package sort281122;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TensDigitSorting2 implements Comparator<Integer>{

	 public int[] solve(int[] A) {
		 for(int i=0; i<A.length; i++) {
			 for(int j=i; j<A.length; j++) {
				 if(compare(A[i], A[j]) < 0) {
					 int temp = A[i];
					 A[i] = A[j];
					 A[j] = temp;
				 }
			 }
			 
		 }
		 return A;
	    }
	    @Override
		public int compare(Integer a, Integer b) {
			// TODO Auto-generated method stub
			int fact_a = valueTens(a);
			int fact_b = valueTens(b);
			if(fact_a > fact_b) return 1;
			else if((fact_a == fact_b) && (a>b)) return 1;
			else return 0;
		}
	    public int valueTens(int N) {
			if(N/10 > 1){
	            return ((N/10)%10);
	        }
	        else return 0;
		}
	    public ArrayList<Integer> solve(ArrayList<Integer> A) {

	        Collections.sort(A, (a,b)->{
	            int tens_place1 = (a/10)%10;
	            int tens_place2 = (b/10)%10;
	            if(tens_place1 == tens_place2) return b-a;
	            else return tens_place1 - tens_place2;
	        });

	        return A;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TensDigitSorting2 tds = new TensDigitSorting2();
		int[] A = {15, 11, 7, 19};
		int[] B = {2, 24, 22, 19};
		int[] C = tds.solve(A); // 7, 19, 15, 11
		int[] D = tds.solve(B); // 2, 19, 24, 22
		
		for(int i=0; i<C.length; i++) System.out.println(C[i] + " ");
		System.out.println();

	}

}
