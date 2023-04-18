package array041122;
// https://www.scaler.com/academy/mentee-dashboard/class/40897/assignment/problems/15991/hints?navref=cl_pb_nv_tb
public class PrefixSum {
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
	public long[] rangeSum(int[] A, int[][] B) {
		long []C = new long[A.length];
	    long []D = new long[B.length];
	    C[0] = A[0];
	    for(int i=1; i<A.length; i++) {
	        C[i] = C[i-1] + A[i];
	    }
		/*
		 * for(int i=0; i<C.length; i++) { //System.out.println(C[i] + " i " + i); }
		 */
	    for(int j=0; j<B.length; j++){
	        if((B[j][0])==1){
	            D[j] = C[B[j][1]-1];
	           
	        } else {
	            D[j] = C[B[j][1]-1] - C[(B[j][0]) -1 - 1] ;
	          
	        }
	    }
	    return D;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrefixSum ps = new PrefixSum();
		int[] A = {1, 2, 3, 4, 5};
		int[][] B = {{1,4},{2,3}};
		long []D = ps.rangeSum(A, B); // 10 5
		for(int i=0; i<D.length; i++) {
			System.out.println(D[i]);
		}
		
		int[] E = {2, 2, 2}; 
		int[][] F = {{1,1}, {2,3}};
		long[]G = ps.rangeSum(E, F); // 4 7 9 
		for(int i=0;i<G.length; i++) { 
			System.out.println(G[i]); 
		}


	}

}
