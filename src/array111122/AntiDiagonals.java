package array111122;

import java.util.ArrayList;

//https://www.scaler.com/academy/mentee-dashboard/class/40895/assignment/problems/293/?navref=cl_pb_nv_tb
public class AntiDiagonals {
// Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
	 public ArrayList<ArrayList<Integer>> diagonalScalerSol(ArrayList<ArrayList<Integer>> A) {
	        int l = A.size();
		    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	        for (int i = 0; i < 2 * l - 1; ++i) {
	    	    int offset = i < l ? 0 : i - l + 1;
		        ArrayList<Integer> row = new ArrayList<Integer>();
		        int k=0;
	    	    for (int j = offset; j <= i - offset; ++j) {
			        row.add(A.get(j).get(i - j));
			        k++;
	    	    }
	    	    for(int j = k; j< l ;j++){
	    	        row.add(0);
	    	    }
		        res.add(row);
	        }
	        return res;
	    }
	public int[][] diagonal(int[][] A) {
		int n = A.length;
		int m = A[0].length;
		int[][] B = new int[2 * n - 1][m];
		for (int i = 0; i < m; i++) {
			int row = 0;
			int col = i;
			int j = 0;
			while (row < n && col >= 0) {
				B[i][j] = A[row][col];
				//System.out.print(A[row][col] + " ");
				row++;
				col--;
				j++;
			}
		}
		for (int i = 1; i < n; i++) {
			int row = i;
			int col = m - 1;
			int j = 0;
			while (row < n && col >= 0) {
				B[i + n - 1][j] = A[row][col];
				//System.out.print(A[row][col] + " ");
				row++;
				col--;
				j++;
			}
		}
		return B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AntiDiagonals ad = new AntiDiagonals();
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B = ad.diagonal(A);
		System.out.println();
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}
/*
 * Input Format
Only argument is a 2D array A of size N * N.


Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.
 */
}
