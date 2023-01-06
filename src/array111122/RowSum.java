package array111122;

public class RowSum {
	public int[] solveSclaerSol(int[][] A) {
        int n = A.length, m = A[0].length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            int temp = 0;
            // Finding sum of elements of ith row
            for(int j = 0; j < m; j++){
                temp += A[i][j];
            }
            ans[i] = temp;
        }
        return ans;
    }
	public int[] solve(int[][] A) {
        int sum=0;
	       int[] B = new int[A.length];
	       for(int i=0; i<A.length; i++) {
	           sum=0;
				for(int j=0; j<A[0].length; j++) {
					sum +=A[i][j];
				}
	            B[i]=sum;
			}
	        return B;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RowSum rs = new RowSum();
		int[][] mat = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		int []B = rs.solve(mat);
		for(int i=0; i<B.length; i++) {
			System.out.println(B[i]);
		}
	}

}
