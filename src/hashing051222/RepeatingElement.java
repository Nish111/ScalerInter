package hashing051222;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * Problem Description
Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence is 
the smallest.
If there is no repeating element, return -1.
 */
public class RepeatingElement {
	public int elementRepeat(int[] A) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(mp.containsKey(A[i])) {
				mp.put(A[i], (mp.get(A[i]))+1);
				//mp.replace(A[i], value, value+1);
			} else {
				mp.put(A[i], 1);
			}
		}
		for(int i=0; i<A.length; i++) {
			int value = mp.get(A[i]);
			if(value>1) return A[i];
		}
		return -1;
	}
	public int solveScalerSol(ArrayList<Integer> A) {
        HashMap<Integer, Integer> vis = new HashMap<Integer, Integer>();
        int ans = -1;
        for(int i = A.size()-1; i >= 0; --i){
            if(vis.containsKey(A.get(i))){
                ans = A.get(i);
            }
            else{
                vis.put(A.get(i), 1);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatingElement ef = new RepeatingElement();
		int[] A = {2,4,2,1,4,4,3};
		int[] B = {2,4,4,1,4,2,3,1,3};
		int[] C = {10, 5, 3, 4, 3, 5, 6};
		int[] D = {6, 10, 5, 4, 9, 120};
		System.out.println(ef.elementRepeat(A));// 2
		System.out.println(ef.elementRepeat(B));// 2
		System.out.println(ef.elementRepeat(C)); // 5
		System.out.println(ef.elementRepeat(D)); // -1
	}

}
