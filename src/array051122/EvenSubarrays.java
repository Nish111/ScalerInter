package array051122;
// https://www.scaler.com/academy/mentee-dashboard/class/40896/homework/problems/1176/?navref=cl_pb_nv_tb
public class EvenSubarrays {
/*
 * You are given an integer array A.
Decide whether it is possible to divide the array into one or more subarrays of even 
length such that the first and last element of all subarrays will be even.
Return "YES" if it is possible; otherwise, return "NO" (without quotes).
 */
/*
 * For it to be YES, size of array should be even (if size of each sub array is even. 
 * sum of all sub-arrays will be even)
We should be able to divide the array into one or more(at least one) subarrays that 
satisfy the condition. Since the complete array can be considered as the sub-array 
and irrespective of how the input array is split into sub arrays the first and last 
element of the input should be start/end of one of the sub-arrays. So for any input 
array, we just need to check if the full array satisfies the condition. .i.e. A[0] && 
A[n-1] should be even.
 */
	 public String solveScalerSol(int[] A) {
	        int n = (int)A.length;
	        if(A[0]%2 == 0 && A[n-1]%2 == 0 && n%2 == 0)
	            return "YES";
	        return "NO";
	    }
	public String solve(int[] A) {
		if(A.length%2 != 0) {
			return "NO";
		} else {
			if(A[0]%2 == 0 && A[A.length-1]%2 ==0) {
				return "YES";
			}
		}
		return "NO";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenSubarrays ea = new EvenSubarrays();
		int[] A = {2, 4, 8, 6};
		System.out.println(ea.solve(A));// YES
		int[] B = {2, 4, 8, 7, 6};
		System.out.println(ea.solve(B)); // NO
	}

}
