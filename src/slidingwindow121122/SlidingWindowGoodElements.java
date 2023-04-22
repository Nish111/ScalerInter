package array121122;
// https://www.scaler.com/academy/mentee-dashboard/class/40894/assignment/problems/4033/?navref=cl_pb_nv_tb
public class SlidingWindowGoodElements {
	public int solveSclaerSol(int[] A, int B) {
        int n = A.length;
        int cnt = 0;
        // count number of elements <= B
        for(int x : A)  
            if(x <= B)  
                cnt++;
        // If there is only one element, No need to swap
        if(cnt <= 1)    
            return 0;
        else {
            int l = 0, r = 0, x = 0;
            // Find the count of elements <= B in every window of length cnt using two
            //pointer approach
            while(r < cnt) {
                if(A[r] > B)    
                    x++;
                r++;
            }
            int ans = x;
            while(r < n) {
                if(A[r] > B)   
                    x++;
                if(A[l] > B)    
                    x--;
                ans = Math.min(ans, x);
                r++;    
                l++;
            }
            return ans;
        }
	}
	// problem 2 in class
	public static int noOfSwaps(int[] A, int B) {
		int k=0;
		// to find k ie number of ele less than B
		for(int i=0; i<A.length; i++) {
			if(A[i]<=B) k++;
		}
		// edge cases
		if(k==0 || k==1 || k==A.length) return 0;
		// sliding window 1st loop
		int s=0; int e=k-1;
		int goodElements=0;
		for(int i=s; i<=e; i++) {
			if(A[i]<=B) {
				goodElements++;
			}
		}
		int numberOfSwaps = k-goodElements;
		int min_swaps = numberOfSwaps;
		// O(1) loop for sliding window
		s=1; e=k;
		while(e<A.length) {
			if(A[s-1]<=B) goodElements--;
			if(A[e]<=B) goodElements++;
			s++; e++;
			numberOfSwaps = k-goodElements;
			min_swaps = Math.min(numberOfSwaps, min_swaps);
		}
		return min_swaps;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,12,10,3,14,10,5};
		System.out.println(noOfSwaps(A, 8));// 2
		int[] B = {19, 11, 3, 9,7, 25, 6, 20, 4};
		System.out.println(noOfSwaps(B, 10));// 1
	}
}
