package matrices2D111122;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://www.scaler.com/academy/mentee-dashboard/class/40895/assignment/problems/11437/submissions
public class RowSum {
	public int[] java8(int[][] A) { // java 8
        return Arrays.stream(A)
                .mapToInt(row -> IntStream.of(row).sum())
                .toArray();
	}
	public int[] solveScalarSol(int[][] A) {
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
	public int[] solve2(int[][] A) {
	       int[] B = new int[A.length];
	       for(int i=0; i<A.length; i++) {
				for(int j=0; j<A[0].length; j++) {
					B[i] +=A[i][j];
				}
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
		int[] C = rs.java8(mat);
		for(int i=0; i<C.length; i++) {
			System.out.println(C[i]);
		}
	}

}
