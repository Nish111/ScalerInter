package array121122;

public class SlidingWindow {
// class problem
	public static int slidingWindowCode(int[] A, int k) {
		int s=0; int e=k-1;
		int sum=0; int max_val=Integer.MIN_VALUE;
		for(int i=s; i<=e; i++) {
			sum += A[i];
		}
		max_val = sum;
		s=1; e=k;
		while(e<A.length) {
			sum = sum - A[s-1] + A[e];
			max_val = Math.max(max_val, sum);
			s++; e++;
		}
		return max_val;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-3, 2, 6, 4, 1, -4, 5, 3};
		System.out.println(slidingWindowCode(A, 4));// 13

	}

}
