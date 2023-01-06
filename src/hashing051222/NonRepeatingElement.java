package hashing051222;

import java.util.HashMap;
// problem 2
public class NonRepeatingElement {
	public int elementNonrepeat(int[] A) {
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
		for(int i=0; i<A.length; i++) {
			int value = mp.get(A[i]);
			if(value==1) return A[i];
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonRepeatingElement ef = new NonRepeatingElement();
		int[] A = {2,4,2,1,4,4,3};
		int[] B = {2,4,2,1,4,4,3,1,3};
		System.out.println(ef.elementNonrepeat(A));// 1
		System.out.println(ef.elementNonrepeat(B));// 0
	}

}
