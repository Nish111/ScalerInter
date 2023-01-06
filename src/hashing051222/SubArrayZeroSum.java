package hashing051222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/*
 * Problem Description
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7
 */
public class SubArrayZeroSum {

	public int subArrayWithSum(int[] A) {
		// prefix array
		long[] pf = new long[A.length];// need long
		int count=0;
		pf[0] = A[0];
		for(int i=1; i<A.length; i++) {
			pf[i] = pf[i-1] + A[i];
		}
		//for(int i=0; i<A.length; i++) System.out.print(pf[i] + " ");
		//System.out.println();
		// creating hashmap
		HashMap<Long, Integer> mp = new HashMap<>();// need Long else will give error
		for(int i=0; i<pf.length; i++) {
			if(mp.containsKey(pf[i])) {
				count+=mp.get(pf[i]);// adding to count
				mp.put(pf[i], (mp.get(pf[i]))+1);
				
			} else {
				mp.put(pf[i], 1);
			}
		}
		//System.out.println(mp.containsKey((long)0));
		if(mp.containsKey((long)0)) count+=mp.get((long)0);// getting count of 0s
		return count%1000000007;
	}
	public int solveScalerSol(int[] A) {
        final int mod = (int)(1e9 + 7);
        HashMap<Long, Integer> pref = new HashMap<Long, Integer>();
        Long curr = 0L , ans = 0L;
        pref.put(0L, 1);
        for(int i = 0 ; i < A.length ; i++){
            curr += A[i];
            if(pref.containsKey(curr)){
                ans += pref.get(curr);
            }
            pref.put(curr, pref.getOrDefault(curr, 0) + 1);
        }
        return (int)(ans % mod);
    }
	 public int solve2(int[] A) {      
	        int prefsum=0;
	        int count=0;
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        map.put(0,1);  //cases when the prefix sum itself becomes zero
	        for(int i=0;i<A.length;i++){
	            prefsum+=A[i];
	            if(map.containsKey(prefsum)){
	                count+=map.get(prefsum);
	                map.put(prefsum,map.get(prefsum)+1);  
	            }        
	            else
	                map.put(prefsum,1);
	        }return count%1000000007;      
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArrayZeroSum sas = new SubArrayZeroSum();
		int[] A = {2,4,3,-5,-2,4,-4};
		int[] B = {1,2,3,-6};
		int[] C = {1, -1, -2, 2};
		int[] D = {2,4,3,5,-2,4,-8};
		int[] E = {1, 2, 3, 4, 5};
		int[] F = {-1,2, -1};
		System.out.println(sas.subArrayWithSum(A)); //4
		System.out.println(sas.solve2(A)); //4
		System.out.println(sas.subArrayWithSum(B)); // 1
		System.out.println(sas.solve2(B)); //1
		System.out.println(sas.subArrayWithSum(C)); // 3
		System.out.println(sas.solve2(C)); //3
		System.out.println(sas.subArrayWithSum(D)); // 0
		System.out.println(sas.solve2(D)); 
		System.out.println(sas.subArrayWithSum(E)); // 0
		System.out.println(sas.solve2(E)); 
		System.out.println(sas.subArrayWithSum(F));// 1
		System.out.println(sas.solve2(F)); //1
	}

}
