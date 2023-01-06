package array021122;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/homework/problems/11427/submissions
public class SecondLargest {
	/*
	 * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
	 */
	 public int solve(int[] A) {
	        int max = Integer.MIN_VALUE;
	        int secMax = Integer.MIN_VALUE;
	        for(int i=0; i<A.length; i++){
	            if(A[i]>max){
	                secMax = max;
	                max = A[i];
	            } else if(A[i]<max && A[i]>secMax){
	                secMax = A[i];
	            }
	        }
	        if(secMax == Integer.MIN_VALUE){
	            return -1;
	        } else {
	            return secMax;
	        }
	    }
	 public int solveScalerSol(int[] A) {
	        int index = 0, n = A.length;
	        // This will give us the maximum element of A
	        for(int i = 1; i < n; i++){
	            if(A[i] > A[index]) index = i;
	        }
	        int ans = -1;
	        // This will give us maximum element of A which is less than A[index]
	        for(int i = 0; i < n; i++){
	            if(A[i] != A[index]) ans = Math.max(ans, A[i]);
	        }
	        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargest sl = new SecondLargest();
		int[] A = {2, 1, 2};
		System.out.println(sl.solve(A));
		int[] B = {2};
		System.out.println(sl.solve(B));
		int[] C = {};
		System.out.println(sl.solve(C));
	}

}
