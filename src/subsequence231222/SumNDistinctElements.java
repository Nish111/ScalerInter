package subsequence231222;

public class SumNDistinctElements {
	// to count (sum of all subset sum)/2^n
	public long subSetSum(int[] A) { // contribution technique this is using arrays
		// [1,2,3] -> [], [1], [1,2], [1,2,3], [2], [2,3], [3] - subarrays
		// [1,3] - this will be here as subarray does not consider this but comes as subset
        int n = A.length;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (long)(1<<(n-1))*A[i]; // will fail if cast to long not done
		}
		return sum/(1<<n);
    }  
	public long subSetSum2(int[] A) { 
		long sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i]; // will fail if cast to long not done
		}
		return sum/2;
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumNDistinctElements snde = new SumNDistinctElements();
		int[] A = {2,4,1};
		System.out.println(snde.subSetSum(A)); // 3
		System.out.println(snde.subSetSum2(A)); // 3
	}

}
