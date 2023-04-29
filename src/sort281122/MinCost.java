package sort281122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// https://www.scaler.com/academy/mentee-dashboard/class/40890/assignment/problems/11087/hints?navref=cl_pb_nv_tb
public class MinCost {
	
	public int solveScalerSol(ArrayList<Integer> A) {
        Collections.sort(A);
        int sum = 0, ans = 0;
        for(int i=0;i<A.size();i++) {
            sum += (A.size()-i)*A.get(i);
        }
        return sum;
    }
	public int findMinCost(int[] A) {
		// 1. Sort array
		Arrays.sort(A);
		// 2. find total sum
		int total_sum=0;
		for(int i=0; i<A.length; i++) {
			total_sum += A[i];
		}
		System.out.println(total_sum);
		/*
		 * for(int j=0; j<A.length; j++) { System.out.print(A[j] + " "); }
		 */
		//System.out.println();
		int cost = 0;
		for(int i=A.length-1; i>=0; i--) {
			cost += total_sum;
			total_sum -= A[i];
			//System.out.println(cost + " " + A[i]);
		}
		return cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinCost mc = new MinCost();
		int[] A = {6,1,4};
		System.out.println(mc.findMinCost(A)); // 11, 16 17 -> 17 
		int[] B = {2, 1};
		System.out.println(mc.findMinCost(B)); // 4
		int[] C = {5};
		System.out.println(mc.findMinCost(C)); // 5
	}

}
