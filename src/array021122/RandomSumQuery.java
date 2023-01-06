package array021122;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/homework/problems/27366?navref=cl_tt_nv
public class RandomSumQuery { //  Range Sum Query - II
/*
 * You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */
	public int[] solve(int[] A, int[][] B) {
        int []C = new int[B.length];
        for(int i=0; i<B.length; i++) {
        	for(int j=B[i][0]; j<=B[i][1]; j++) {
        		C[i] += A[j-1];
        	}
        }
        return C;
    }
	 public int[] solveScalerSol(int[] A, int[][] B) {
	        int[] ans = new int[B.length];
	    	for(int i = 0 ; i < B.length ; i++){
	    		int sum = 0;
	    		for(int j = B[i][0] - 1 ; j < B[i][1] ; j++){
	    			sum += A[j];
	    		}
	    		ans[i] = sum;
	    	}
	    	return ans;
	    }
	public long[] solvePrefixSum(int[] A, int[][] B) {
		long []C = new long[A.length];
	    long []D = new long[B.length];
	    C[0] = A[0];
	    for(int i=1; i<A.length; i++) {
	        C[i] = C[i-1] + A[i];
	    }
	    for(int i=0; i<C.length; i++) {
			//System.out.println(C[i] + " i " + i);
	    }
	    for(int j=0; j<B.length; j++){
	        if((B[j][0])==0){
	            D[j] = C[B[j][1]];
	            //System.out.println(D[j]);
	        } else {
	            D[j] = C[B[j][1]] - C[(B[j][0]) -1] ;
	            //System.out.println(D[j]);
	        }
	    }
	    return D;
	}
	public long[] solvePrefixSumAc(int[] A, int[][] B) { // not able to do it yet
		long []C = new long[A.length];
	    long []D = new long[B.length];
	    C[0] = A[0];
	    for(int i=1; i<A.length; i++) {
	        C[i] = C[i-1] + A[i];
	    }
	    for(int i=0; i<C.length; i++) {
			//System.out.println(C[i] + " i " + i);
	    }
	    for(int j=0; j<B.length; j++){
	        if((B[j][0])==1){
	            D[j] = C[B[j][1]-1];
	            System.out.println(D[j]);
	        } else {
	            D[j] = C[B[j][1]-1] - C[(B[j][0]) -1] ;
	            //System.out.println(D[j]);
	        }
	    }
	    return D;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomSumQuery rsq = new RandomSumQuery();
		int[] A = {1, 2, 3, 4, 5};
		int[][] B = {{0,3}, {1,2}};
		int[][] C = {{1,4}, {2,3}};
		long []D = rsq.solvePrefixSum(A, B); // 10 5
		for(int i=0; i<D.length; i++) {
			System.out.println(D[i]);
		}
		int[] E = {2, 2, 2}; // 2 4 6
		int[][] F = {{0, 0}, {1, 2}}; // 2 4
		int[][] Z = {{1, 1}, {2, 3}}; // using for solvePrefixSumAc indexes
		long []G = rsq.solvePrefixSumAc(E, Z); // 2 4
		for(int i=0; i<G.length; i++) {
			System.out.println(G[i]);
		}

	}

}
