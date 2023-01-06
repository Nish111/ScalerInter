package array161122;
// https://www.scaler.com/academy/mentee-dashboard/class/40893/assignment/problems/26719/hints?navref=cl_pb_nv_tb
public class EvenIndexSum {
	public int[] solveScalerSol(int[] A, int[][] B) {
        int n = A.length;
        int[] pref = new int[n];
        pref[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            if(i % 2 == 0){
                pref[i] = pref[i - 1] + A[i];
            }
            else{
                pref[i] = pref[i - 1];
            }
        }
        int[] ans = new int [B.length];
        for(int i = 0 ; i < B.length ; i++){
            int val = pref[B[i][1]];
            if(B[i][0] > 0){
                val -= pref[B[i][0] - 1];
            }
            ans[i] = val;
        }
        return ans;
    }
	public int[] solve(int[] A, int[][] B) {
        int[] pf = new int[A.length];
        int[] C = new int[B.length];
		pf[0]=A[0];
		for(int i=1; i<A.length; i++) {
			if(i%2==0) pf[i] = pf[i-1] + A[i];
			else pf[i] = pf[i-1];
		}
		for(int i=0; i<B.length; i++) {
			int s=B[i][0];
			int e=B[i][1];
			int sum = 0;
			if(s==0) C[i]=pf[e];
			else C[i] = pf[e] - pf[s-1];
			//System.out.print(sum + " ");
		}
        return C;
    }
	public static void evenIndexSum(int[] A, int[][] Q) { // O(NQ)
		for(int i=0; i<Q.length; i++) {
			int s=Q[i][0];
			int e=Q[i][1];
			int sum = 0;
			for(int j=s; j<=e; j++) {
				if(j%2==0) {
					sum+=A[j];
				}
			}
			System.out.print(sum + " ");
		}
	}
	public static void evenIndexSumPrefix(int[] A, int[][] Q) { // O(N+Q)
		int[] pf = new int[A.length];
		pf[0]=A[0];
		for(int i=1; i<A.length; i++) {
			if(i%2==0) pf[i] = pf[i-1] + A[i];
			else pf[i] = pf[i-1];
		}
		for(int i=0; i<Q.length; i++) {
			int s=Q[i][0];
			int e=Q[i][1];
			int sum = 0;
			if(s==0) sum=pf[e];
			else sum = pf[e] - pf[s-1];
			System.out.print(sum + " ");
		}
	}
	public static void main(String[] args) {
		int[] A = {2,3,1,6,4,5};
		int[][] Q = {{1,3},{2,5},{0,4},{3,3},{1,5}};
		evenIndexSum(A, Q); // 1 5 7 0 5 
		System.out.println();
		evenIndexSumPrefix(A,Q);// 1 5 7 0 5 
		System.out.println();
	}
}
