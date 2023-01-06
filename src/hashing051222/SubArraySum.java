package hashing051222;

import java.util.ArrayList;
import java.util.HashSet;
/*
 * Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.
 */
public class SubArraySum {

	public boolean subArrayWithSum(int[] A) {
		// prefix array
		long[] pf = new long[A.length];// need long
		pf[0] = A[0];
		for(int i=1; i<A.length; i++) {
			pf[i] = pf[i-1] + A[i];
		}
		//for(int i=0; i<A.length; i++) System.out.print(pf[i] + " ");
		//System.out.println();
		// creating hashmap
		HashSet<Long> mp = new HashSet<>();// need Long else will give error
		for(int i=0; i<pf.length; i++) {
			mp.add(pf[i]);
		}
		//System.out.println();
		// check for duplicate or 0
		//System.out.println(mp.size());
		//System.out.println(mp.contains((long)0));
		if(mp.size() < pf.length || mp.contains((long)0)) {
			return true;
		}
		else return false;
		
		/*
		 * HashMap<Integer, Integer> mp = new HashMap<>(); for(int i=0; i<A.length; i++)
		 * { if(mp.containsKey(A[i])) { mp.put(A[i], (mp.get(A[i]))+1); } else {
		 * mp.put(A[i], 1); } } //System.out.println(); // check for duplicate or 0
		 * if(mp.size()<A.length || mp.containsKey(0)) { return true; } else return
		 * false;
		 */	
	}
	public int solveScalerSol(ArrayList < Integer > A) {
        HashSet < Long > set = new HashSet < Long > ();
        long sum = 0;
        set.add(sum);
        for (int x: A) {
            sum += x;
            if (set.contains(sum)) return 1;
            else {
                set.add(sum);
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySum sas = new SubArraySum();
		int[] A = {2,4,3,-5,-2,4,-4};
		System.out.println(sas.subArrayWithSum(A)); //true
		int[] B = {1,2,3,-6};
		System.out.println(sas.subArrayWithSum(B)); // true
		int[] C = {0,3,4,2};
		System.out.println(sas.subArrayWithSum(C)); // true
		int[] D = {2,4,3,5,-2,4,-8};
		System.out.println(sas.subArrayWithSum(D)); // false
		int[] E = {1, 2, 3, 4, 5};
		System.out.println(sas.subArrayWithSum(E)); // false
		int[] F = {1, -1};
		System.out.println(sas.subArrayWithSum(F));// true

	}

}
