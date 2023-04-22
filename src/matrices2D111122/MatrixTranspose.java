package array111122;
// https://www.scaler.com/academy/mentee-dashboard/class/40895/assignment/problems/11615/hints?navref=cl_pb_nv_tb
public class MatrixTranspose {
	public int[][] solveScalerSol(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] ans = new int[col][row];
        // Iterating over the columns
        for(int i = 0; i < col; i++){
            // Iterating over the rows
            for(int j = 0; j < row; j++)
                ans[i][j] =  A[j][i];
            
        }
        return ans;
    }
	 public int[][] solve(int[][] A) {
	        int n = A.length;
	        int m = A[0].length;
	        int[][] B = new int [m][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					B[j][i] = A[i][j];
				}	
			}
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(B[i][j] + " ");
				}
				System.out.println();
			}
	        return B;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixTranspose mt = new MatrixTranspose();
		int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int[][] B = mt.solve(A);
		int[][] C = {{1, 2, 3},{4, 5, 6},{7, 8, 9}, {10,11,12}};
		int[][] D = mt.solve(C);
	}

}
