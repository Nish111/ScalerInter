package array181122;

import java.util.List;
// https://www.scaler.com/academy/mentee-dashboard/class/40892/assignment/problems/193/hints?navref=cl_pb_nv_tb
public class SingleNumber {
	 public int singleNumberScalerSol(final List < Integer > A) {
	        int num = 0;
	        for (int val: A) {
	            // xor of all the elements of the array
	            num ^= val;
	        }
	        return num;
	    }
	public int singleNumber(final int[] A) {
		int num = A[0];
		for (int i = 1; i < A.length; i++) {
			num = num ^ A[i];
		}
		return num;
	}

	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] A = {1, 2, 2, 3, 1};
		int[] B = {1, 2, 2};
		System.out.println(sn.singleNumber(A)); // 3
		System.out.println(sn.singleNumber(B)); // 1
	}
}
