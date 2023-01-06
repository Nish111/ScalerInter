package array091122;

import java.util.ArrayList;
// https://www.scaler.com/academy/mentee-dashboard/class/40902/assignment/problems/16121/submissions
public class MaximumSubArray {
	public int maxSubarray(int A, int B, int[] C) {
		int res = 0;
		int s = 0;
		int max = 0;
		for (int i = 0; i < A; i++) {
			if (C[i] > B) {
				res = 0;
				continue;
			}
			max = Math.max(max, res);
			res = res + C[i];
			while (res > B) {
				res = res - C[s];
				s++;
			}
			if (res == B) return B;
			max = Math.max(max, res);
		}
		if (max != 0) return max;
		else return res;
	}
	  public int maxSubarrayMine(int A, int B, int[] C) {
		  int sum=0, max =0;
		  if(A==1) {
			  if(C[0]<=B) return C[0];
			  else return 0;
		  }
		  for(int i=0; i<A; i++) {
			  sum=0;
			  for(int j=i; j<A; j++) {
				  sum += C[j];
				  if(sum>B) continue;
				  if(sum>max) max=sum; 
			  }
		  }
		  return max;
		}
	  public int maxSubarrayScalerSol(int A, int B, int[] C) {
	        int ans = 0;
	        for (int i = 0; i < A; i++) {
	            int sum = 0;
	            for (int j = i; j < A; j++) {
	                sum += C[j];
	                if (sum <= B)
	                    ans = Math.max(ans, sum);
	                else break;
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubArray msa = new MaximumSubArray();
		int[] C = {2, 1, 3, 4, 5};
		System.out.println(msa.maxSubarray(5, 12, C)); // 12
		System.out.println(msa.maxSubarrayMine(5, 12, C)); // 12
		int[] A = {2,2,2};
		int[] B = {34};
		int[] Z = {12};
		System.out.println(msa.maxSubarrayMine(3, 1, A)); //0
		System.out.println(msa.maxSubarrayMine(1, 12, B));//0
		System.out.println(msa.maxSubarrayMine(1, 12, Z));//12
	}

}
