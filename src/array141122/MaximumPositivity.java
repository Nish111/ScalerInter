package array141122;
// https://www.scaler.com/academy/mentee-dashboard/class/40903/homework/problems/8515/submissions
public class MaximumPositivity {
	public int[] solve(int[] A) {
		int positiveCount=0;
		int count=Integer.MIN_VALUE;
		int countIndex=0;
		for(int i=0; i<A.length; i++) {
			if(A[i]>0) positiveCount++;
			else positiveCount=0;
			if(count<positiveCount) {
				count=positiveCount;
				countIndex = i;
			}
		}
		int[] result = new int[count];
		int start = countIndex-count+1;
		int x=0;
		for(int i=start; i<=countIndex; i++) {
			result[x] = A[i];
			x++;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumPositivity mp = new MaximumPositivity();
		int[] A = {5, 6, -1, 7, 8};
		int[] B = mp.solve(A);
		int[] C = {1, 2, 3, 4, 5, 6};
		int[] D = mp.solve(C);
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		for(int i=0; i<D.length; i++) {
			System.out.print(D[i] + " ");
		}
		System.out.println();
	}

}
