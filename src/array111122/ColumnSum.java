package array111122;

public class ColumnSum {
	public int[] solveScalerSol(int[][] A) {
	    int n = A.length, m = A[0].length;
		int[] ans = new int[m];
	    for(int j = 0; j < m; j++){
	    	int temp = 0;
	    	for(int i = 0; i < n; i++){
	    		temp += A[i][j];
	    	}
	    	ans[j] = temp;
	    }
	    return ans;
	}
	public int[] solve(int[][] A) {
	       int sum=0;
	       int[] B = new int[A[0].length];
	       for(int j=0; j<A[0].length; j++) {
	           sum=0;
				for(int i=0; i<A.length; i++) {
					sum +=A[i][j];
				}
	            B[j]=sum;
			}
	        return B;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColumnSum cs = new ColumnSum();
		int[][] mat = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		int []B = cs.solve(mat);
		for(int i=0; i<B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
