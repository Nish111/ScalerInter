package hashing051222;

import java.util.HashMap;
import java.util.HashSet;
// problem 3
public class DistinctElement {
	public int distinctElement(int[] A) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(mp.containsKey(A[i])) {
				int value = mp.get(A[i]);
				mp.put(A[i], value+1);
				//mp.replace(A[i], value, value+1);
			} else {
				mp.put(A[i], 1);
			}
		}
		
		return mp.size();
	}
	public int distinctElement2(int[] A) {
		HashSet<Integer> mp = new HashSet<>();
		for(int i=0; i<A.length; i++) {
			mp.add(A[i]);
		}
		
		return mp.size();
	}
	 public int solveScalerSol(int[] A) {
	        HashSet<Integer> set = new HashSet<>();
	        for(int i = 0 ; i < A.length ; i++){
	            set.add(A[i]);
	        }
	        return set.size();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctElement ef = new DistinctElement();
		int[] A = {2,4,2,1,4,4,3};
		int[] B = {2,4,2,1,4,4,3,1,3, 10000000};
		System.out.println(ef.distinctElement(A));// 4
		System.out.println(ef.distinctElement(B));// 5
		System.out.println(ef.distinctElement2(A));// 4
		System.out.println(ef.distinctElement2(B));// 5
	}

}
