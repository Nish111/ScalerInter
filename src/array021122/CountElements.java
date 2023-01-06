package array021122;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/assignment/problems/29033?navref=cl_tt_nv
public class CountElements {
/*
 * Given an array A of N integers. Count the number of elements that have at least 
 * 1 elements greater than itself.
 */
    public int solve(int[] A) {
	        int max = Integer.MIN_VALUE;
	        // if array is empty then using A[0] will give error
	        int count=0;
	        for(int i=0; i<A.length; i++){
	            if(A[i] > max){
	                max = A[i];
	            }
	        }
	        for(int i=0; i<A.length; i++){
	            if(max==A[i]){
	                count++;
	            }
	        }
	        return A.length-count;
	    }
    public int solveScalerSol(int[] A) {
        int max_value = 0, max_count = 0;
    	for(int i = 0 ; i < A.length ; i++){
    		if(A[i] > max_value){
    			max_value = A[i];
    			max_count = 1;
    		}
    		else if(A[i] == max_value){
    			max_count += 1;
    		}
    	}
    	return A.length - max_count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountElements ce = new CountElements();
		int []A = {3, 1, 2};
		int []B = {5, 5, 3};
		int []C = {};
		System.out.println(ce.solve(A)); // 2
		System.out.println(ce.solve(B)); // 1
		System.out.println(ce.solve(C)); // 0

	}

}
