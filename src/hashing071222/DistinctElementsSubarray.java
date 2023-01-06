package hashing071222;

import java.util.HashMap;

public class DistinctElementsSubarray {

	public int[] distinctElementsInSubArray(int[] A, int k) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<k ;i++) {
			if(hm.containsKey(A[i])) hm.put(A[i], hm.get(A[i])+1);
			else hm.put(A[i], 1);
		}
		System.out.println(hm.size());
		int[] list = new int[A.length-k+1];
		list[0] = hm.size();
		int start=1; int end=k; int counter=1;
		while(end<A.length) {
			// delete A[s-1]
			hm.put(A[start-1], hm.get(A[start-1])-1);
			if(hm.get(A[start-1]) == 0) {
				hm.remove(A[start-1]);
			}
			// addition
			if(hm.containsKey(A[end])) hm.put(A[end], hm.get(A[end])+1);
			else hm.put(A[end], 1);
			System.out.println(hm.size());
			list[counter] = hm.size();
			counter++; start++; end++;
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctElementsSubarray des = new DistinctElementsSubarray();
		int[] A = {2,4,3,8,3,9,4,9,4,10};
		int[] B = des.distinctElementsInSubArray(A, 4);
		for(int i=0; i<B.length; i++) System.out.print(B[i] + " ");
		System.out.println();
	}

}
