package array041122;
// https://www.scaler.com/academy/mentee-dashboard/class/40897/assignment/problems/12826/hints?navref=cl_pb_nv_tb
public class EquilibriumIndex {
/*
 * You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */
	public int solveScalerSol(int[] A) {
        long sum1 = 0;  
        for(int i = 0; i < A.length ; i++) 
            sum1 += A[i];
        long sum2 = 0;  // sum of elements at lower indexes
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.length ; i++){
            sum1 -= A[i];   // sum of elements at higher indexes
            if(sum1 == sum2){
                ans = i;
                break;
            }
            sum2 += A[i];
        }
        if(ans == Integer.MAX_VALUE)
            ans =- 1;   // If no equilibrium index found, then return -1
        return ans;
    }
	public int solve(int[] A) {
        int count=-1;
        int[] B = new int[A.length];
        int LHS=0; int RHS=0;
        B[0] = A[0];
        for(int i=1;i<A.length; i++){
            B[i] = B[i-1] + A[i];
        }
        // printing prefix sum
        for(int k=0; k<B.length; k++) {
        	//System.out.println(B[k]);
        }
        for(int j=0; j<B.length; j++){
            if(j==0){
                LHS = 0;
            } else {
                LHS = B[j-1];
            }
            RHS = B[B.length - 1] - B[j];
            //System.out.println(RHS + " RHS " + LHS + " LHS ");
            if(LHS == RHS){
                count=j;
                return count;
            }
        }
        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilibriumIndex ei = new EquilibriumIndex();
		int[] A = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(ei.solve(A)); // 3
		int []B = {1, 2, 3, 7, 1, 2, 3 };
		System.out.println(ei.solve(B)); // 3
		int[ ] C = {1,2,3};
		System.out.println(ei.solve(C)); // -1

	}

}
