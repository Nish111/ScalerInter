package array091122;
// https://www.scaler.com/academy/mentee-dashboard/class/40902/assignment/problems/30352?navref=cl_tt_nv
import java.util.Arrays;

public class SubarrayInRange {
// Given an array A of length N, return the subarray from B to C.
	public int[] solveScalerSol(int[] A, int B, int C) {
        return Arrays.copyOfRange(A, B, C + 1);
    }
	public int[] solve(int[] A, int B, int C) {
        int n = A.length;
        int [] test = new int[C-B+1];
        int i=0;
		for(int s=B; s<=C; s++){
			test[i]=A[s];
			i++;
		}
        return test;
        //return Arrays.copyOfRange(A, B, C + 1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarrayInRange sir = new SubarrayInRange();
		int[] A = {4, 3, 2, 6};
		int[] B = sir.solve(A, 1, 3); // 3 2 6 
		int[] C = {4, 2, 2};
		int[] D = sir.solve(C, 0, 1); // 4 2 
		int[] E = {6, 3, 3, 6, 7, 8, 7, 3, 7 };
		int[] F = sir.solve(E, 1, 2); // 3 3
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		for(int i=0; i<D.length; i++) {
			System.out.print(D[i] + " ");
		}
		System.out.println();
		for(int i=0; i<F.length; i++) {
			System.out.print(F[i] + " ");
		}
		System.out.println();
	}

}
