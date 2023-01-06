package subsequence231222;

public class SumAllSubsetSums {

	public int subsetSums(int[] A) { // 1 approach using previous
		int x = 1<<A.length; // same as pow(2,n) but optimized than this
		int total_sum=0;
		for(int i=0; i<x; i++) {
			int sum=0;
			for(int j=0; j<A.length; j++) {
				if(checkBit(i, j)) sum +=A[j];
			}
			total_sum +=sum;
		}
		return total_sum;
	}
	public boolean checkBit(int n, int i) {
		if(((n>>i)&1) == 1) return true;
		else return false;
	}
	public long subSetSum(int[] A) { // contribution technique this is using arrays
		// [1,2,3] -> [], [1], [1,2], [1,2,3], [2], [2,3], [3] - subarrays
		// [1,3] - this will be here as subarray does not consider this but comes as subset
        int n = A.length;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (long)(1<<(n-1))*A[i]; // will fail if cast to long not done
		}
		return sum;
    }  
	public long subarraySum(int[] A) { // contribution technique this is using subsets O(n)
		// [1,2,3] -> [], [1], [1,2], [1,2,3], [2], [2,3], [3] - subarrays
		// [1,3] - this is missed here as subarray does not consider this but
		// comes as subset
        int n = A.length;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (long)(i+1)*(n-i)*A[i]; // will fail if cast to long not done
		}
		return sum;
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAllSubsetSums sass = new SumAllSubsetSums();
		int[] A = {2,4,1};
		System.out.println(sass.subarraySum(A)); // 25 
		// for subset need 28 but [2,1] is missed in sum
		System.out.println(sass.subSetSum(A)); // 28
		System.out.println(sass.subsetSums(A)); // 28
	}

}
