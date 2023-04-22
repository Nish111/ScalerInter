package array121122;
//https://www.scaler.com/academy/mentee-dashboard/class/40894/homework/problems/12827/hints?navref=cl_pb_nv_tb
public class SubarrayLeastAvg {

	private int findMinAvgSubarray(int arr[], int n, int k)
    {
        // Initialize  beginning index of result
        int res_index = 0;
        // Compute sum of first subarray of size k
        int curr_sum = 0;
        for (int i = 0; i < k; i++)
            curr_sum += arr[i];
        // Initialize minimum sum as current sum
        int min_sum = curr_sum;
        // Traverse from (k+1)'th element to n'th element
        for (int i = k; i < n; i++) {
            // Add current item and remove first item of
            // previous subarray
            curr_sum += arr[i] - arr[i - k];
            // Update result if needed
            if (curr_sum < min_sum) {
                min_sum = curr_sum;
                res_index = (i - k + 1);
            }
        }
        return res_index;
    }
    public int solveScalerSol(int[] A, int B) {
        int n = A.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = A[i];
        return findMinAvgSubarray(arr, n, B);
    }
	public int solve(int[] A, int B) {
        int s=0; int e=B-1;
		int sum=0;
        int min_val=Integer.MAX_VALUE;
		for(int i=s; i<=e; i++) {
			sum += A[i];
		}
		s=1; e=B;
		min_val=sum;
		//System.out.println(min_val);
		int storeIndex=0;
		while(e<A.length) {
			sum = sum - A[s-1] + A[e];
			if(min_val>sum) {
				storeIndex = e-B+1;
				//System.out.println(storeIndex);
			}
			min_val = Math.min(min_val, sum);
			s++; e++;
		}
		return storeIndex;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarrayLeastAvg sla = new SubarrayLeastAvg();
		int[] A = {3, 7, 90, 20, 10, 50, 40};
		System.out.println(sla.solve(A, 3));//3
		int[] B = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19 };
		System.out.println(sla.solve(B, 1));// 12
		int[] C = {3, 7, 5, 20, -10, 0, 12};
		System.out.println(sla.solve(C, 2));//4	
	}
}
