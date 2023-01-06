package array041122;
// https://www.scaler.com/academy/mentee-dashboard/class/40897/assignment/problems/26546/hints?navref=cl_pb_nv_tb
public class EvenNumbersRange {
/*
 * You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to find the count of even numbers in the range A[B[i][0]…B[i][1]].
 */
	public int[] solveScalerSol(int[] A, int[][] B) {
        int n = A.length;
        int[] pref = new int[n + 1];
        pref[0] = 0;
        for(int i = 0 ; i < n ; i++){
            if(A[i] % 2 == 0){
                pref[i + 1] = pref[i] + 1;
            }
            else{
                pref[i + 1] = pref[i];
            }
        }
        int[] ans = new int [B.length];
        for(int i = 0 ; i < B.length ; i++){
            ans[i] = pref[B[i][1] + 1] - pref[B[i][0]];
        }
        return ans;
    }
	public int[] solve(int[] A, int[][] B) {
        int[] C = new int[A.length];
        int[] D = new int[B.length];
        for(int i=0; i<A.length; i++){
            if(A[i]%2==0){
                C[i]=1;
            } else {
                C[i]=0;
            }
        }
		/*
		 * for(int i=0; i<C.length; i++) { //System.out.println(C[i]); }
		 */
        for(int i=1; i<C.length; i++){
            C[i] = C[i-1] + C[i];
        }
		/*
		 * for(int i=0; i<C.length; i++) { System.out.print(C[i] + " "); }
		 * System.out.println();
		 */
        for(int i=0; i<B.length; i++){
        	if(B[i][0] == 0) {
        		D[i] = C[B[i][1]] ;
        	} else {
        		 D[i] = C[B[i][1]] - C[B[i][0] - 1];
        	}
        }
        return D;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumbersRange enr = new EvenNumbersRange();
		int[] A = {1, 2, 3, 4, 5};
		int[][] B = {{0,2},{1,4}};
		int[] C =enr.solve(A, B);
		for(int i=0; i<C.length; i++) {
			System.out.println(C[i]);
		}
		int[] D = {2, 1, 8, 3, 9};
		int[][] E = {{0,3},{2,4}};
		int[] F =enr.solve(D, E);
		for(int i=0; i<F.length; i++) {
			System.out.println(F[i]);
		}
	}

}
