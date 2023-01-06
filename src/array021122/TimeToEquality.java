package array021122;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/homework/problems/9003?navref=cl_tt_nv
public class TimeToEquality {
	/*
	 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.
	 */
	public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int count=0;
        for(int i=0; i<A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        for(int i=0; i<A.length; i++){
            count += (max-A[i]);
        }
        return count;
    }
	public int solveScalersol(int[] A) {
        int n=A.length;
        int val=0;
        for(int i=0;i<n;i++)
        {
            val=Math.max(val,A[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
          ans+=val-A[i];
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeToEquality tte = new TimeToEquality();
		int []A = {2, 4, 1, 3, 2};
		System.out.println(tte.solve(A)); // 8
		int []B = {1};
		System.out.println(tte.solve(B)); // 0
		int []C = {};
		System.out.println(tte.solve(C)); // 0
		int []D = {23, 45,1};
		System.out.println(tte.solve(D)); // 66
	}

}
