package array041122;
// https://www.scaler.com/academy/mentee-dashboard/class/40897/assignment/problems/15991/hints?navref=cl_pb_nv_tb
public class RangeSum {
/*
 * You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */
	 public long[] rangeSum(int[] A, int[][] B) {
	        long []C = new long[A.length];
	        long []D = new long[B.length];
	        C[0] = A[0];
	        for(int i=1; i<A.length; i++) {
	            C[i] = C[i-1] + A[i];
	        }
	        for(int j=0; j<B.length; j++){
	            if(B[j][0]==0){
	                D[j] = C[B[j][1]];
	            } else {
	                D[j] = C[B[j][1]] - C[B[j][0] -1] ;
	            }
	        }
	        return D;
	    }
	 public long[] rangeSumStart1(int[] A, int[][] B) {
	        long []C = new long[A.length];
		    long []D = new long[B.length];
		    C[0] = A[0];
		    for(int i=1; i<A.length; i++) {
	            C[i] = C[i-1] + A[i];
		    }
	         for(int j=0; j<B.length; j++){
		        if((B[j][0])==1){
		            D[j] = C[B[j][1]-1];
		        } else {
		            D[j] = C[B[j][1]-1] - C[(B[j][0]) -1 - 1] ;
		        }
		    }
		    return D;
	    }
	 public long[] rangeSumScalerSol(int[] A, int[][] B) {
	        int n = A.length;
	        int m = B.length;
	        long[] pref = new long[n + 1];
	        for (int i = 1; i <= n; i++) {
	            pref[i] = pref[i - 1] + A[i - 1];   //Sum from the 0th to the i-1'th index 
	        }
	        long[] ans = new long[m];
	        for (int i = 0; i < m; i++) {
	            ans[i] = pref[B[i][1]] - pref[B[i][0] - 1];
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeSum rs = new RangeSum();
		int[] A = {1, 2, 3, 4, 5};
		int[][] B = {{0,2},{1,4}};
		long[] C =rs.rangeSum(A, B);
		for(int i=0; i<C.length; i++) {
			System.out.print(C[i]+" ");
		} System.out.println();
		int[][] B1 = {{1,4},{2,3}};
		long[] C1 =rs.rangeSumStart1(A, B1);
		for(int i=0; i<C1.length; i++) {
			System.out.print(C1[i]+" ");
		} System.out.println();
		int[] D = {2, 1, 8, 3, 9};
		int[][] E = {{0,3},{2,4}};
		long[] F =rs.rangeSum(D, E);
		for(int i=0; i<F.length; i++) {
			System.out.print(F[i]+" ");
		}System.out.println();
		int[][] E1 = {{1,4},{3,5}};
		long[] F1 =rs.rangeSumStart1(D, E1);
		for(int i=0; i<F1.length; i++) {
			System.out.print(F1[i]+" ");
		}System.out.println();
	}

}
