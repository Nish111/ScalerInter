package array021122;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/homework/problems/29090?navref=cl_tt_lst_nm
public class MaxMin {
	/*
	 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
	 */
	 public int solve(int[] A) {
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        for(int i=0; i<A.length; i++){
	            if(A[i]>max){
	                max = A[i];
	            }
	            if(A[i]<min){
	                min = A[i];
	            }
	        }
	        return max+min;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMin mm = new MaxMin();
		int[] A = {-2, 1, -4, 5, 3};
		System.out.println(mm.solve(A));
		int[] B = {2};
		System.out.println(mm.solve(B));
		int[] C = {1, 3, 4, 1};
		System.out.println(mm.solve(C));
	}

}
