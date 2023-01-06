package sort281122;

import java.util.Arrays;

public class NobleElementDuplicate {

	public int findNobleElements(int[] A) {
		Arrays.sort(A);
		for(int j=0; j<A.length; j++) { System.out.print(A[j] + " "); }
		System.out.println();
		int count=0;
		int noble=0;
		for(int i=0; i<A.length; i++) {
			if(i==A[i]) {
				count++;
				noble = A[i];
			}
			if( i>0 && noble==A[i] && (A[i]==A[i-1]) ) count++;
			
		}
		return count;
	}
	public int findNobleElementsHisSol(int[] A) {
		Arrays.sort(A);
		for(int j=0; j<A.length; j++) { System.out.print(A[j] + " "); }
		System.out.println();
		int count=0;
		if(A[0]==0) count++;
		int less=0;
		for(int i=1; i<A.length; i++) {
			if(A[i]!=A[i-1]) less=i;
			if(less==A[i])	count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NobleElementDuplicate ne = new NobleElementDuplicate();
		int[] A = {1, 2, 2, 2, 0, 4};
		System.out.println(ne.findNobleElements(A)); // 5 -> 0,1,2,2,2
		System.out.println(ne.findNobleElementsHisSol(A));  // 5 -> 0,1,2,2,2
		int[] B = {1, 2, 2, 4, 0, 4, 4, 7, 7};
		System.out.println(ne.findNobleElements(B));  // 9 -> 0 1 2 2 4 4 4 7 7 
		System.out.println(ne.findNobleElementsHisSol(B)); // 9 -> 0 1 2 2 4 4 4 7 7
		
	}

}
