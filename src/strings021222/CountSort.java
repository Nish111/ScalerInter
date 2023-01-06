package strings021222;

import java.util.Arrays;
// https://www.scaler.com/academy/mentee-dashboard/class/40905/assignment/problems/21391/?navref=cl_pb_nv_tb
public class CountSort {
	public int[] solveScalerSol(int[] A) {
        int n = A.length;
        int mx = -1;
        for(int i = 0 ; i < n ; i++){
            mx = Math.max(mx, A[i]);
        }
        int[] freq = new int[mx + 1];
        for(int i = 0 ; i < n ; i++){
            freq[A[i]] += 1;
        }
        int k = 0;
        for(int i = 0 ; i <= mx ; i++){
            for(int j = 0 ; j < freq[i] ; j++){
                A[k] = i;
                k++;
            }
        }
        return A;
    }
	 public int[] solve(int[] A) {
	        Arrays.sort(A);
	        return A;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountSort cs = new CountSort();
		int[] A = {1, 3, 1};
		int[] B = cs.solve(A);// 1 1 3 
		int[] C = {4,2,1,3};
		int[] D = cs.solve(C); // 1 2 3 4 
		for(int i=0; i<B.length; i++) System.out.print(B[i] + " ");
		System.out.println();
		for(int i=0; i<D.length; i++) System.out.print(D[i] + " ");
		System.out.println();
	}

}
