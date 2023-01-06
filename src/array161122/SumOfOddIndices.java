package array161122;
// https://www.scaler.com/academy/mentee-dashboard/class/40893/assignment/problems/26720/hints?navref=cl_pb_nv_tb
public class SumOfOddIndices {

	public int[] solveScalerSol(int[] A, int[][] B) {
        int n = A.length;
        int[] pref = new int[n];
        for(int i = 1 ; i < n ; i++){
            if(i % 2 == 1){
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
		pf[0]=0;
		for(int i=1; i<A.length; i++) {
			if(i%2!=0) pf[i] = pf[i-1] + A[i];
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfOddIndices soi = new SumOfOddIndices();
		int[] A = {1, 2, 3, 4, 5};
		int[][] B = {{0,2}, {1,4}};
		int[] X = soi.solve(A, B);
		int[] C = {2, 1, 8, 3, 9};
		int[][] D = {{0,3}, {2,4}};
		int[] Y = soi.solve(C, D);

	}

}
