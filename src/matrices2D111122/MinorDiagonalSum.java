package array111122;
// https://www.scaler.com/academy/mentee-dashboard/class/40895/assignment/problems/11466?navref=cl_tt_nv
public class MinorDiagonalSum {
/*
 * You are given a N X N integer matrix. You have to find the sum of all the minor 
 * diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that 
i + j = M + 1 (where i, j are 1-based).
 */
	 public int solveScalerSol(final int[][] A) {
	        int N = A.length;
	        int sum = 0;
	        for (int i = 0; i < N;i++){
	            sum += A[i][N - 1 - i];
	        }
	    
	        return sum;
	    }
	 public int solve(final int[][] A) {
	        int sum=0;
	        int N = A.length;
		    for(int i=0; i<N; i++){
		        sum +=A[i][N-1-i];
		        //System.out.println(A[i][N-1-i]);
		    }
		    return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinorDiagonalSum mds = new MinorDiagonalSum();
		int[][] mat = {{1, -2, -3},{ -4, 5, -6},{ -7, -8, 9}};
		System.out.println(mds.solve(mat));// -5
	}

}
