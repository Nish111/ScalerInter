package subsequence231222;
// https://www.scaler.com/academy/mentee-dashboard/class/48348/homework/problems/12555/submissions
public class CheckSubsetSumArray {
/*
 * You are given an array of integers of N size.
You have to find that there is any subsequence exists or not whose sum is equal to B.
 */
	public boolean checkSum(int[] A, int k) {// brute
/*
 * We have all the total sub arrays - 2^N here 7 so 128 and in 128 all combinations will be 
 * present, so we are just iterating till n and checking which bits are set in that 
 * 128(0 -> 111111) and as per if sum is equal to k we increment count or return true
 */
		int x = 1<<A.length; // same as pow(2,n) but optimized than this
		System.out.println(x);
		for(int i=0; i<x; i++) { // this is 2^n so TC 2^n*n
			int sum=0;
			for(int j=0; j<A.length; j++) {
				if(checkBit(i, j)) sum +=A[j]; //   O(1)
			}
			if(sum==k) return true;
		}
		return false;
	}
	public int checkSum2(int[] A, int k) { // submitted this
		int x = 1<<A.length; // same as pow(2,n) but optimized than this
		int count=0;
		for(int i=0; i<x; i++) {
			int sum=0;
			for(int j=0; j<A.length; j++) {
				if(checkBit(i, j)) sum +=A[j];
			}
			if(sum==k) count++;
		}
		return count;
	}
	public boolean checkBit(int n, int i) {
		if(((n>>i)&1) == 1) return true;
		else return false;
	}
	public int subsequenceSumScalerSol(int[] A, int B, int i){
        if(i==-1){
            if(B==0)return 1;
            else return 0;
        }
        int ans = 0;
        ans |= subsequenceSumScalerSol(A, B, i-1);
        ans |= subsequenceSumScalerSol(A, B - A[i], i-1);
        return ans;
    }
    public int solveScalerSol(int[] A, int B) {
        if(B==0)return 0;
        int n = A.length;
        return subsequenceSumScalerSol(A, B, n-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSubsetSumArray cssa = new CheckSubsetSumArray();
		int[] A = {3, -1, 0, 6, 2, -3, 5};
		System.out.println(cssa.checkSum(A, 10)); // true
		System.out.println(cssa.checkSum(A, 45)); // false
		System.out.println(cssa.checkSum2(A, 10)); // 10
		System.out.println(cssa.checkSum2(A, 45)); // 0
	}

}
