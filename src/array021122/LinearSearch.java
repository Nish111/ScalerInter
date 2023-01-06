package array021122;

import java.util.ArrayList;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/homework/problems/16497/hints?navref=cl_pb_nv_tb
public class LinearSearch {
	/*
	 * Given an array A and an integer B, find the number of occurrences of B in A.
	 */
	public int solveScalerSol(ArrayList<Integer> A, int B) {
        int ans = 0;
        for(int i = 0; i < A.size(); ++i){
            if(A.get(i) == B){
                ans++;
            }
        }
        return ans;
    }
	 public int solve(int[] A, int B) {
	        int count=0;
	        for(int i=0; i<A.length; i++){
	            if(A[i]== B){
	                count++;
	            }
	        }
	        return count;
	    }
	 public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		int[] A = {1,2,2};
		System.out.println(ls.solve(A, 2));
		int[] B = {3};
		System.out.println(ls.solve(B, 2));
		int[] C = {};
		System.out.println(ls.solve(C, 2));
	}
}
