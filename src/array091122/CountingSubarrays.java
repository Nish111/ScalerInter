package array091122;
// https://www.scaler.com/academy/mentee-dashboard/class/40902/homework/problems/16089/hints?navref=cl_pb_nv_tb
public class CountingSubarrays {
/*
 * Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.
 */
	public int solve(int[] A, int B) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum=0;
			for (int j = i; j < A.length; j++) {
				sum += A[j];
				if (sum < B) {
					count++;
				}
			}
		}
		return count;
    }
	 public int solveScalersol(int[] A, int B) {
	        int n  = A.length;
	        int pref[] = new int[n];
	        pref[0]=A[0];
	        int ans=0;
	        for(int i=1;i<n;i++)pref[i]=pref[i-1]+A[i];
	        for(int i=0;i<n;i++){
	            for (int j=i;j<n;j++){
	                int sum = pref[j];
	                if(i>0){
	                    sum -= pref[i-1];
	                }
	                if(sum < B) ans++;
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingSubarrays csa = new CountingSubarrays();
		int[] A = {2, 5, 6};
		System.out.println(csa.solve(A, 10)); // 4
		int[] B = {1, 11, 2, 3, 15};
		System.out.println(csa.solve(B, 10)); // 4
	}

}
