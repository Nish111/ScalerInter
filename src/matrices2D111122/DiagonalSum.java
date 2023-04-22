package array111122;

public class DiagonalSum {
	 public int solveScalerSol(final int[][] A) {
	        int N = A.length;
	    
	        int sum = 0;
	        for (int i = 0; i < N;i++){
	            // A[i][i] is the main diagonal element 
	            sum += A[i][i];
	        }
	    
	        return sum;
	    }
	 public int solve(final int[][] A) {
	        int sum=0;
	        for(int i=0; i<A.length; i++){
	            sum +=A[i][i];
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiagonalSum rs = new DiagonalSum();
		int[][] mat = {{1, -2, -3},{ -4, 5, -6},{ -7, -8, 9}};
		System.out.println(rs.solve(mat));// 15
	}

}
