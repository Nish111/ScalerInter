package sort281122;

import java.util.Arrays;
import java.util.Comparator;

public class NoOfFactors implements Comparator<Integer>{ /// stuck something missing only comparator defined rest imple still need

	public int[] sortNumberOfFactors(int[] A) {
		int count=0;
		for(int i=0; i<A.length-1; i++) {
			if(compare(A[i], A[i+1]) ==1) count++;
		}
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfFactors nof = new NoOfFactors();
		int[] A = {6, 8, 9};
		int[] B = nof.sortNumberOfFactors(A);
		int[] C = {2,4,7};
		int[] D = nof.sortNumberOfFactors(B);
		int[] E = {1,5,3,9,6,10,12};
		int[] F = nof.sortNumberOfFactors(E);
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
	}
	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		int fact_a = count_factors(a);
		int fact_b = count_factors(b);
		if(fact_a < fact_b) return 1;
		else if((fact_a == fact_b) && (a<b)) return 1;
		else return 0;
	}
	public int count_factors(int N) {
		int count=0;
		for(int i=1; i<=Math.sqrt(N); i++) {
			if(N%i==0) {
				count++;
				if(N/i != i) {
					count++;
				}
			}
		}
		return count;
	}
}
