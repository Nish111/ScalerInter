package subsequence231222;
// https://www.scaler.com/academy/mentee-dashboard/class/48348/homework/problems/5557/hints?navref=cl_pb_nv_tb
public class OddEvenSubsequence {
/*
 * Given an array of integers A of size, N. Find the longest subsequence of A, 
 * which is odd-even.
A subsequence is said to be odd-even in the following cases:
The first element of the subsequence is odd; the second element is even, the third 
element is odd, and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]
The first element of the subsequence is even, the second element is odd, the third 
element is even, and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]
Return the maximum possible length of odd-even subsequence.
Note: An array B is a subsequence of an array A if B can be obtained from A by 
deleting several (possibly, zero, or all) elements.
 */
	public int solve(int[] A) {
		int prev=A[0]; int count=1;
		for(int i=1; i<A.length; i++) {
			// both below works but & is better and % is more time consuming
			if(((prev&1) ==0 && (A[i]&1) !=0) || ((prev&1) !=0 && (A[i]&1) ==0)) {
			//if((prev %2 ==0 && A[i]%2 !=0) || (prev %2 !=0 && A[i]%2 ==0)) {
				count++;
				prev=A[i];
			}
		}
		return count;
	}
	 public int solveScalerSol(int[] A) {
	        int n=A.length;
	        int ans1=0,ans2=0;
	        int x=1,y=0;
	        for(int i = 0; i < n; i++){
	            int it = A[i];
	            it=(it&1);
	            if(it==x){
	                ++ans1;
	                x^=1;
	            }
	            if(it==y){
	                y^=1;
	                ++ans2;
	            }
	        }
	        return Math.max(ans1,ans2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenSubsequence oes = new OddEvenSubsequence();
		int[]  A = {1, 2, 2, 5, 6};
		System.out.println(oes.solve(A)); // 4
		System.out.println(oes.solveScalerSol(A));
		int[]  B = {2, 2, 2, 2, 2, 2};
		System.out.println(oes.solve(B)); // 1
		System.out.println(oes.solveScalerSol(B));
		
	}

}
