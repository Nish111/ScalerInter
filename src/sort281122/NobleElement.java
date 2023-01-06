package sort281122;

import java.util.Arrays;

public class NobleElement {

	public int findNobleElements(int[] A) {
		Arrays.sort(A);
		for(int j=0; j<A.length; j++) { System.out.print(A[j] + " "); }
		System.out.println();
		int count=0;
		for(int i=0; i<A.length; i++) {
			if(i==A[i]) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NobleElement ne = new NobleElement();
		int[] A = {1, -5, 3, 5, -10, 4};
		System.out.println(ne.findNobleElements(A)); // 3 -> 3,5,4
	}

}
