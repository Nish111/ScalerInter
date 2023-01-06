package array121122;

public class SubArraySumLength {
	 public int solve(int[] A, int B, int C) {
        int s=0; int e=B-1;
		int sum=0;
		for(int i=s; i<=e; i++) {
			sum += A[i];
		}
		s=1; e=B;
		if(sum==C) {
			return 1;
		}
		while(e<A.length) {
			sum = sum - A[s-1] + A[e];
			if(sum==C) {
				return 1;
			}
			s++; e++;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySumLength ssl = new SubArraySumLength();
		int[] A = {4, 3, 2, 6};
		System.out.println(ssl.solve(A, 2, 5));// 1
		int[] B = {4, 2, 2};
		System.out.println(ssl.solve(B, 2, 8));// 0
		int[] C = {4, 3, 2, 6};
		System.out.println(ssl.solve(A, 2, 5));

	}

}
