package subsequence231222;

import java.util.Arrays;

public class SumOfMaxInSubsequence {

	public int findSum(int[] A) {// brute
		int x = 1<<A.length; // same as pow(2,n) but optimized than this
		//System.out.println(x);
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0; i<x; i++) { // this is 2^n so TC 2^n*n
			//sum=0;
			for(int j=0; j<A.length; j++) {
				if(max<A[j]) max = A[j]; //   O(1)
			}
			sum+=max;
		}
		return sum;
	}
	public boolean checkBit(int n, int i) {
		if(((n>>i)&1) == 1) return true;
		else return false;
	}
	public int findSum2(int[] A) {
		Arrays.sort(A);
		int contri = 1;
		int res = 0;
		for(int i=0; i<A.length; i++) {
			res += contri*A[i];
			contri*=2;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfMaxInSubsequence somis = new SumOfMaxInSubsequence();
		int[] A = {3, -1, 0, 6, 2, -3, 5};
		System.out.println(somis.findSum(A)); // 768
		int[] B = {3,1,-4};
		System.out.println(somis.findSum(B));// 24
		System.out.println(somis.findSum(A)); // 768
		System.out.println(somis.findSum2(B));  // 10
	}

}
