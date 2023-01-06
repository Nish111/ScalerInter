package sort281122;

import java.util.ArrayList;
import java.util.Collections;
// https://www.scaler.com/academy/mentee-dashboard/class/40890/homework/problems/167/hints?navref=cl_pb_nv_tb
public class SortByColor {
	public int[] sortColors(int[] A) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
 		for(int i=0; i<A.length; i++) {
 			ar.add(A[i]);
 		}
 		//for(int i=0; i<A.length; i++) System.out.println(A[i] + " ");
		//System.out.println();
 		Collections.sort(ar, (a,b)->{
 			//System.out.println(a);
 			if(a>b) return 1;
 			else if (a==b) return 0;
 			else return -1;
 		});
 		int[] B = new int[ar.size()];
 		for(int i=0; i<B.length; i++) B[i] = ar.get(i);
 		return B;
	
	}
public ArrayList<Integer> sortColorsScalerSol(ArrayList<Integer> A) {
	    
	    int zero = 0;
	    int two = A.size() - 1;
	    
	    for (int i = 0; i <= two;) {
	        if (A.get(i) == 0) {
	            int temp = A.get(zero);
	            A.set(zero, 0);
	            A.set(i, temp);
	            zero++;
	            i++;
	        } else if (A.get(i) == 2) {
	            int temp = A.get(two);
	            A.set(two, 2);
	            A.set(i, temp);
	            two--;
	        } else {
	            i++;
	        }
	    }
	    return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortByColor sbc = new SortByColor();
		int[] A = {0, 1, 2, 0, 1, 2};
		int[] B = sbc.sortColors(A);
		for(int i=0; i<B.length; i++) System.out.println(B[i] + " ");
		System.out.println();
		int[] C = { 2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
		int[] D = sbc.sortColors(C);
		for(int i=0; i<D.length; i++) System.out.println(D[i] + " ");
		System.out.println();
		
	}

}
