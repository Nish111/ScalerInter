package array021122;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/assignment/problems/29129/hints?navref=cl_pb_nv_tb
public class ArrayReverse {
	/*
	 * Given an array A of N integers. Also given are two integers B and C. Reverse the array 
	 * A in the given range [B, C]
	 */
	public int[] solve(int[] A, int B, int C) {
        while(C>B){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++; C--;
        }
        return A;
    }
	public int[] completeArray(final int[] A) {
//https://www.scaler.com/academy/mentee-dashboard/class/40901/assignment/problems/11554?navref=cl_tt_nv
		/* You are given a constant array A.
You are required to return another array which is the reversed form of the input array.
		 */
        int[] B = A;
        int i=0; int j=B.length-1;
        while(j>i){
            int temp = B[i];
            B[i] = B[j];
            B[j] = temp;
            i++; j--;
        }
        return B;
    }
	 public int[] solveScalerSol(int[] A, int B, int C) {
	        int i = B , j = C;
	        while(i < j){
	            int temp = A[i];
	            A[i] = A[j];
	            A[j] = temp;
	            i += 1; j -= 1;
	        }
	        return A;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayReverse ar = new ArrayReverse();
		int[] A = {1, 2, 3, 4};
		ar.solve(A, 2, 3); // 1 2 4 3 
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		ar.completeArray(A); // 3 4 2 1 
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

}
