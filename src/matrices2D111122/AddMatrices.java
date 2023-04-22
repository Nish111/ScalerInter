package array111122;
// https://www.scaler.com/academy/mentee-dashboard/class/40895/homework/problems/11616/hints?navref=cl_pb_nv_tb
public class AddMatrices {

	public int[][] solveScalerSol(int[][] A, int[][] B) {
        int row = A.length, col = A[0].length;
        // Iterating over rows
        for(int i = 0; i < row; i++)
            // Iterating over the columns
            for(int j = 0; j < col; j++)
                A[i][j] += B[i][j];
        return A;
    }
	public int[][] solve(int[][] A, int[][] B) {
        int [][]C = new int[A.length][A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j]; 
            }
        }
        return C;
    }
	public int[][] solveSubtract(int[][] A, int[][] B) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j] -= B[i][j]; 
            }
        }
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
