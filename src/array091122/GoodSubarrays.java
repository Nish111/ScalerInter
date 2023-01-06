package array091122;

import java.util.ArrayList;
import java.util.ListIterator;
// https://www.scaler.com/academy/mentee-dashboard/class/40902/homework/problems/16094/?navref=cl_pb_nv_tb
public class GoodSubarrays {
/*
 * Given an array of integers A, a subarray of an array is said to be good if it fulfills any 
 * one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be 
less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be 
greater than B.
Your task is to find the count of good subarrays in A.
 */
	public int solve(int[] A, int B) {
		int count = 0;
		int sum = 0; int elementCount = 0;
		for (int i = 0; i < A.length; i++) {
			sum=0; elementCount=0;
			for (int j = i; j < A.length; j++) {
				sum += A[j]; elementCount++;
				if ((sum < B && elementCount % 2 == 0) || (sum > B && elementCount % 2 == 1)) {
					count++;
				}
			}
		}
		return count;
	}
	public int solveScalerSol(int[] A, int B) {
        int n = A.length;
        int pref[] = new int[n];
        pref[0] = A[0];
        int ans = 0;
        for(int i = 1 ; i < n ; i++) pref[i] = pref[i - 1] + A[i];
        for(int i = 0 ; i < n ; i++){
            for (int j = i ; j < n ; j++){
                int sz = j - i + 1;
                int sum;
                if(i == 0) sum = pref[j];
                else sum = pref[j] - pref[i - 1];
                if(sz % 2 == 0 && sum < B)ans++;
                if(sz % 2 == 1 && sum > B)ans++;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodSubarrays gs = new GoodSubarrays();
		int[] A = { 1, 2, 3, 4, 5 };
		System.out.println(gs.solve(A, 4)); // 6
		int[] B = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
		System.out.println(gs.solve(B, 65)); // 36
	}

}
