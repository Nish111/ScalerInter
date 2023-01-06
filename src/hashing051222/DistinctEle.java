package hashing051222;

import java.util.HashMap;
import java.util.HashSet;
// problem 4
public class DistinctEle {
	public boolean distinctElement(int[] A) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(mp.containsKey(A[i])) {
				return false;
			} else {
				mp.put(A[i], 1);
			}
		}
		
		return true;
	}
	public boolean distinctElement2(int[] A) {
		HashSet<Integer> mp = new HashSet<>();
		for(int i=0; i<A.length; i++) {
			mp.add(A[i]);
		}
		
		if(A.length==mp.size()) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctEle ef = new DistinctEle();
		int[] A = {2,4,2,1,4,4,3};
		int[] B = {2,43,12,1,453,54,53,11,3, 10000000};
		System.out.println(ef.distinctElement(A));// false
		System.out.println(ef.distinctElement(B));// true
		System.out.println(ef.distinctElement2(A));// false
		System.out.println(ef.distinctElement2(B));// true
	}

}
