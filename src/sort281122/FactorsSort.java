package sort281122;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// https://www.scaler.com/academy/mentee-dashboard/class/40890/assignment/problems/27473/hints?navref=cl_pb_nv_tb
public class FactorsSort {
	public int[] solve(int[] A) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
 		for(int i=0; i<A.length; i++) {
 			ar.add(A[i]);
 		}
 		//for(int i=0; i<A.length; i++) System.out.println(A[i] + " ");
		//System.out.println();
 		Collections.sort(ar, (a,b)->{
 			int factorA = findFactors(a);
 			int factorB = findFactors(b);
 			if(factorA>factorB) return 1;
 			else if ((factorA==factorB) && (a>b)) return 1;
 			else return -1;
 		});
 		int[] B = new int[ar.size()];
 		for(int i=0; i<B.length; i++) B[i] = ar.get(i);
 		return B;
    }
	public int findFactors(Integer N) {
		int count=0;
		for(int i=1; i<=Math.sqrt(N); i++) {
			if(N%i==0) {
				count=count+2;
			}
			if(i*i==N) count--;
		}
		return count;
	}
	Integer countFactors(Integer n){
        Integer count = 0;
        for(Integer i = 1 ; i * i <= n ; i++){
    		if(n % i == 0){
    			count++;
    			if(i * i != n){
    				count++;
    			}
    		}
    	}
        return count;
    }
    public ArrayList<Integer> solveScalerSol(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator< Integer >(){
            @Override
            public int compare(Integer val1, Integer val2) {
                Integer count1 = countFactors(val1);
                Integer count2 = countFactors(val2);
                if(count1 == count2){
                    return val1 - val2;
                }
                return count1 - count2;
            }    
        });
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorsSort fs = new FactorsSort();
		int[] A = {6, 8, 9};
		int[] B = fs.solve(A); // 9 6 8
		int[] C = {2, 4, 7};
		int[] D = fs.solve(C); // 2 7 4
		for(int i=0; i<B.length; i++) System.out.print(B[i] + " ");
		System.out.println();
		for(int i=0; i<D.length; i++) System.out.print(D[i] + " ");
		System.out.println();
	}

}
