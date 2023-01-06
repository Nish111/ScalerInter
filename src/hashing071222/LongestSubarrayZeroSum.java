package hashing071222;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
	public int solve(int[] A) {
		// creating hashmap
		HashMap<Long, Integer> mp = new HashMap<>();
		long sum=A[0];
		int count=0;
		for(int i=1; i<A.length; i++) {
			sum+=A[i];
			if(sum==0) count=i+1;
			if(( mp.get(sum)) != null ) count = Math.max(count, i- (mp.get(sum)));
			else mp.put(sum, i);
		}
		return count;
	}
	public int solveScalerSol(int[] A) {
        HashMap<Long, Integer> pref = new HashMap<Long, Integer>();
        Long curr = 0L;
        int ans = 0;
        pref.put(0L, 0);
        for(int i = 1 ; i <= A.length ; i++){
            curr += A[i - 1];
            if(pref.containsKey(curr)){
                ans = Math.max(ans, i - pref.get(curr));
            }
            else{
                pref.put(curr, i);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		LongestSubarrayZeroSum lszs = new LongestSubarrayZeroSum();
		// TODO Auto-generated method stub
		int[] A = {2,4,3,-5,-2,4,-4};
		int[] B = {1,2,3,-6};
		int[] C = {1, -1, -2, 2};
		int[] D = {2,4,3,5,-2,4,-8};
		int[] E = {1, 2, 3, 4, 5};
		int[] F = {-1,2, -1};
		//System.out.println(lszs.subArrayWithSum(A)); //4
		System.out.println(lszs.solve(A)); //4
		//System.out.println(lszs.subArrayWithSum(B)); // 1
		System.out.println(lszs.solve(B)); //1
		//System.out.println(lszs.subArrayWithSum(C)); // 3
		System.out.println(lszs.solve(C)); //3
		//System.out.println(lszs.subArrayWithSum(D)); // 0
		System.out.println(lszs.solve(D)); 
		//System.out.println(lszs.subArrayWithSum(E)); // 0
		System.out.println(lszs.solve(E)); 
		//System.out.println(lszs.subArrayWithSum(F));// 1
		System.out.println(lszs.solve(F)); //1
	}

}
