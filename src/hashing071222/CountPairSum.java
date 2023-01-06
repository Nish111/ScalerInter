package hashing071222;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
// https://www.scaler.com/academy/mentee-dashboard/class/40888/homework/problems/27714/hints?navref=cl_pb_nv_tb
public class CountPairSum {
	
	public int checkIfPairExistsSetHis(int[] A, int B) { // not working for duplicate D
		HashSet<Integer> hs = new HashSet<>();
		int count=0;
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = B-A[i];
			if(hs.contains(b)) count++; 
			else hs.add(a);
		}
		return count;
	}
	public int solve(int[] A, int B) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		int count=0;
		int mod=1000000007;
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = B-A[i];
			if(mp.containsKey(b)) count=(count+mp.get(b))%mod;
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
	            if(freq.containsKey(B - A[i])){
	                ans = (ans + freq.get(B - A[i])) % mod;
	            }
	            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
	        }
	        return (int)(ans);
	    }
	 public int solve2(int[] A, int B) {
	        int n = A.length;
	        int m = 1000000007;
	        int count =0;
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	        for(int i=0;i<n;i++){
	            int b = B-A[i];
	            if(hm.containsKey(b)){
	                count = (count+hm.get(b))%m;
	            }
	            if(hm.containsKey(A[i])){
	            hm.put(A[i],hm.get(A[i])+1);
	            }
	            else{
	                hm.put(A[i],1);
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPairSum cps = new CountPairSum();
		int[] A = {8,9,1,-2,4,5,11,-6,7,5,11};
		int[] B = {8,9,1,-2,4,5,11,-6,7,5};
		int[] C = {3, 5, 1, 2};
		int[] D = {1,2,1,2};
		System.out.println(cps.checkIfPairExistsSetHis(A, 22));// 1
		System.out.println(cps.checkIfPairExistsSetHis(A, 13));// 3
		System.out.println(cps.checkIfPairExistsSetHis(B, 16));// 2
		System.out.println(cps.checkIfPairExistsSetHis(C, 8));// 1
		System.out.println(cps.checkIfPairExistsSetHis(D, 3));// 2
		System.out.println(cps.solve(C, 8));// 1
		System.out.println(cps.solve(D, 3));// 4
	}

}
