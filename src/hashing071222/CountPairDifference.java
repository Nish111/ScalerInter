package hashing071222;

import java.util.HashMap;
import java.util.Map;
// https://www.scaler.com/academy/mentee-dashboard/class/40888/homework/problems/11836/submissions
public class CountPairDifference {
	public int solve(int[] A, int B) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		int count=0;
		int mod=1000000007;
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = B+A[i];
			int c = A[i]-B;
			if(mp.containsKey(b)) count=(count+mp.get(b))%mod;
			if(mp.containsKey(c)) count=(count+mp.get(c))%mod;
			if(mp.containsKey(a)) mp.put(a, mp.get(a)+1);
			else mp.put(a, 1);
		}
		return (count)%mod;
    }
	 public int solveScalerSol(int[] A, int B) {
		 Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
	        final int mod = (int)(1e9 + 7);
	        long ans = 0;
	        for(int i = 0 ; i < A.length ; i++){
	            ans += freq.getOrDefault(A[i] - B, 0) + freq.getOrDefault(A[i] + B, 0);
	            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
	        }
	        return (int)(ans % mod);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPairDifference pwgd = new CountPairDifference();
		int[] A = {5, 10, 3, 2, 50, 80};
		int[] B = {-10, 20};
		int[] C = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 
				942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 
				538, 869, 912, 667, -701, 35, 894, -297, 811, 322 };
		int[] D = {3, 5, 1, 2};
		int[] E = {1,2,1,2};
		System.out.println(pwgd.solve(A, 78));// 1
		System.out.println(pwgd.solve(B, 30)); // 1
		System.out.println(pwgd.solve(C, 369)); // 2
		System.out.println(pwgd.solve(D, 4));//1 
		System.out.println(pwgd.solve(E, 1));// 4
	}

}
