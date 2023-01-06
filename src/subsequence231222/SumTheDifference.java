package subsequence231222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// https://www.scaler.com/academy/mentee-dashboard/class/48348/homework/problems/453/submissions
public class SumTheDifference {
/*
 * Given an integer array, A of size N.
You have to find all possible non-empty subsequences of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence. Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.
 */
	public int sumDiff(int[] A){
		int x = 1<<A.length; // same as pow(2,n) but optimized than this
		//System.out.println(x);
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int diff=0;
		for(int i=0; i<x; i++) { // this is 2^n so TC 2^n*n
			//sum=0;
			for(int j=0; j<A.length; j++) {
				if(max<A[j]) max = A[j]; //   O(1)
				if(min>A[j]) min = A[j];
			}
			diff+=max-min;
		}
		return diff;
	}
	  public int solve(int[] A) {
	        Arrays.sort(A);
	        int N=A.length;
	        int mod=1000000007;
	        int sumMax=0,sumMin=0;
	        for(int i=0;i<N;i++){
	            //sumOfmax+=A[i]*Math.pow(2,i)%mod; //every ele will be max in 2^(rank in sorted) subsequences
	        	sumMax+=A[i]*(1<<i)%mod;
	        	sumMax%=mod;
	            //sumOfmin+=A[i]*Math.pow(2,len-1-i)%mod; //every ele will be min in 2^(len-1-rank) subsequences
	        	sumMin+=A[i]*(1<<(N-i-1))%mod;
	        	sumMin%=mod;
	        }
	        return (sumMax-sumMin+mod)%mod; //add mod to handle negative remainder case
	    }
	  public int solveScalersol(ArrayList < Integer > A) {
	        // sort the array
	        Collections.sort(A);
	        int Mod = 1000 * 1000 * 1000 + 7;
	        long minus = 0, plus = 0;
	        for (int i = 0; i < A.size(); i++) {	
	            int val = A.get(i);
	            // summation of smallest numbers over all subsequences
	            minus += (val * pow(2, A.size() - 1 - i, Mod)) % Mod;
	            minus %= Mod;
	            // summation of largest numbers over all subsequences
	            plus += (val * pow(2, i, Mod)) % Mod;
	            plus %= Mod;
	        }
	        return (int)((plus - minus + Mod) % Mod);
	    }
	    public long pow(long x, int y, int k) {
	        long result = 1;
	        while (y > 0) {
	            if (y % 2 == 1) {
	                result = (result * x) % k;
	                y--;
	            }
	            y >>= 1;
	            x = (x * x) % k;
	        }
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumTheDifference std = new SumTheDifference();
		int[] A = {3, -1, 0, 6, 2, -3, 5};
		System.out.println(std.sumDiff(A)); // 768
		int[] B = {3,1,-4};
		int[] C = {1,2};
		System.out.println(std.sumDiff(B));// 24
		System.out.println(std.sumDiff(C)); // 768
		System.out.println(std.solve(A));  // 783
		System.out.println(std.solve(B)); // 21
		System.out.println(std.solve(C)); // 1
		
	}

}
