package hashing071222;

import java.util.HashMap;
import java.util.Map;
// https://www.scaler.com/academy/mentee-dashboard/class/40888/homework/problems/4827/hints?navref=cl_pb_nv_tb
public class SubArraySumEqualsK { // not getting it
	public int solve(int[] A, int B) {
		int sum=0;
		int count=0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			sum+=A[i];
			if(sum==B) count++;
			if(hm.containsKey(sum-B)) count+=hm.get(sum-B);
			if(hm.containsKey(sum)) hm.put(sum, hm.get(sum)+1);
			else hm.put(sum, 1);
		}
		//System.out.println(hm);
		return count;
	}
	 public int solveScalerSol(int[] A, int B) {
	        Map<Integer, Integer> prevSum = new HashMap<Integer, Integer>();
	        prevSum.put(0, 1);
	        int currSum = 0, ans = 0;
	        for(int i = 0 ; i < A.length ; i++){
	            currSum += A[i];
	            if(prevSum.containsKey(currSum - B)){
	                ans += prevSum.get(currSum - B);
	            }
	            prevSum.put(currSum, prevSum.getOrDefault(currSum, 0) + 1);
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySumEqualsK sasek = new SubArraySumEqualsK();
		int[] A = {1,0,1};
		System.out.println(sasek.solve(A, 1)); // 4 - 1 1 10 01
		int[] B = {0,0,0};
		System.out.println(sasek.solve(B, 0));// 6 - 0 0 0 00 00 00
		int[] C = {1,3,3,5,7,2,4};
		System.out.println(sasek.solve(C, 6));// 2 - 33 and 24
		int[] D = {1,1,0};
		System.out.println(sasek.solve(D, 1)); // 3 - 1 1 and 10
	}

}
