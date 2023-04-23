package array181122;

import java.util.ArrayList;
// https://www.scaler.com/academy/mentee-dashboard/class/40892/homework/problems/1085/hints?navref=cl_pb_nv_tb
public class InterestingArray {
	 public String solveScalerSol(ArrayList < Integer > A) {
	        int cnt = 0;
	        for (int x: A) {
	            if (x % 2 == 1)
	                cnt++;
	        }
	        // checks the parity of the number of odd elements
	        if (cnt % 2 == 1)
	            return "No";
	        else
	            return "Yes";
	    }
	public String solve(int[] A) {
		int count=0;
		for(int i=0; i<A.length; i++) {
			if(A[i]%2 !=0) count++;
		}
		if(count%2==0) return "Yes";
		else return "No";
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestingArray ia = new InterestingArray();
		int[] A = {9, 17};
		int[] B = {1};
		System.out.println(ia.solve(A)); // Yes
		System.out.println(ia.solve(B)); // No
	}
/*
 *  Following is one possible sequence of operations -  
 1) Merge i.e 9 XOR 17 = 24  
 2) Split 24 into two parts each of size 12  
 3) Merge i.e 12 XOR 12 = 0  
 As there is only 1 element i.e 0. So it is possible.
 */
}
