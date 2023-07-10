package array091122;

import java.util.stream.IntStream;
import java.util.stream.Stream;
// https://www.scaler.com/academy/mentee-dashboard/class/40902/assignment/problems/14363/submissions
public class SumAllSubArrays {
/*
 * You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray
 */
	public static int printAllSub(int[] arr) {
		int n = arr.length;
		int total_sum = 0;
		int sum = 0;
		for (int s = 0; s < n; s++) {
			sum = 0;
			for (int e = s; e < n; e++) {
				sum += arr[e];
				total_sum += sum;

			}
		}
		return total_sum;
	}
	 public long subarraySumJ8(int[] A) { // working for Scaler
	        int n = A.length;
			/*for (int i = 0; i < n; i++) {
				sum += (long)(i+1)*(n-i)*A[i];
			}
			return sum;*/
			/*
			 * sum = IntStream.range(0, n) .mapToLong(i -> (long) (i + 1) * (n - i) * A[i])
			 * .sum();
			 */
	    //return (long) IntStream.range(0, n).mapToDouble(i -> (i+1)*(n-i)*A[i]).sum();
	    return 0;
	    }
	public static long subarraySum(int[] A) { // contribution technique
        int n = A.length;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (long)(i+1)*(n-i)*A[i]; // will fail if cast to long not done
		}
		return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 2, 3 }; // 6 sub arrays n(n+1)/2
		System.out.println(printAllSub(A)); // 20
		System.out.println(subarraySum(A)); // 20
		//The different subarrays for the given array are: 
		//[1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
		//Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
		int[] B = { 2, 1, 3 }; // 6 sub arrays n(n+1)/2
		System.out.println(printAllSub(B)); // 19
		int[] C = { 2, 4, 1, 2, 5 }; // 6 sub arrays n(n+1)/2
		System.out.println(printAllSub(C)); // 92
		System.out.println(subarraySum(C)); // 92
	}
	/*
	 * 1 1 2 1 2 3 2 2 3 3
	 */
}
