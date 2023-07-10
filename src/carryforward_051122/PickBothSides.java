package carryforward_051122;
// https://www.scaler.com/academy/mentee-dashboard/class/40896/homework/problems/9900/submissions
public class PickBothSides {
	public int solve(int[] A, int B) {// Perfectly working and using 2 prefix sum arrays
		int sum = 0;
		int[] leftprefix = new int[A.length];
		int[] rightprefix = new int[A.length];
		leftprefix[0] = A[0];
		rightprefix[0] = A[A.length-1];
		for (int i = 1; i < A.length; i++) {
			leftprefix[i] = leftprefix[i-1]+ A[i];
			rightprefix[i] = rightprefix[i-1]+ A[A.length-i-1];
		}
		printArray(leftprefix);
		printArray(rightprefix);
		//sum = leftprefix[B - 1];
		/*
		 System.out.println("Printing left"); for(int z=0; z<leftprefix.length; z++) {
		 System.out.print(leftprefix[z] + " "); } System.out.println();
		 System.out.println("Printing right"); for(int z=0; z<rightprefix.length; z++)
		 { System.out.print(rightprefix[z] + " "); } System.out.println();
		 */
		/*
		 * if(B==1) { if(leftprefix[B-1]> rightprefix[B-1]) { sum = leftprefix[B-1]; }
		 * else { sum = rightprefix[B-1]; } }
		 */
		 if(B==1) {
			if(leftprefix[B-1]> rightprefix[B-1]) {
				sum = leftprefix[B-1];
			} else {
				sum = rightprefix[B-1];
			}
		}
		if(leftprefix[B-1]> rightprefix[B-1]) {
			sum = leftprefix[B-1];
		} else {
			sum = rightprefix[B-1];
		}
		int temp =leftprefix[B-1];
		int trial = rightprefix[0];
		for(int k=1; k<B; k++) {
			temp = leftprefix[B-k-1];
			trial = rightprefix[k-1];
			//System.out.println(temp+" "+trial+" "+k);
			if(temp + trial >sum) {
				sum = temp + trial;
				//System.out.println(k);
			}
		}
		return sum;
	}
	public void printArray(int[] A) {
		for(int i=0; i<A.length; i++)
			System.out.print(A[i] +" ");
		System.out.println();
	}
	public int solveHis(int[] A, int B) {
		int[] pf = new int[A.length + 1];
		pf[0] = 0;
		for (int i = 1; i < pf.length; i++) {
			pf[i] = pf[i - 1] + A[i - 1];
		}
		/*
		 * for(int z=0; z<pf.length; z++) { System.out.print(pf[z] + " "); }
		 * System.out.println();
		 */
		int ans = pf[B];
		int back = 0;
		int temp = B;

		for (int j = A.length - 1; j >= A.length - temp; j--) {
			back = back + A[j];
			int curr = pf[B - 1] + back;
			ans = Math.max(ans, curr);
			B--;
		}
		return ans;
	}
	public int solveScalerSol1(int[] A, int B) {
        int n = A.length;
        int []suff = new int[n + 1];
        suff[n] = 0;
        suff[n - 1] = A[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suff[i] = A[i] + suff[i + 1];
        }
        int pref_sum = 0;
        int ans = suff[n - B];
        for(int i = 0; i < B; i++){
            pref_sum = pref_sum + A[i];
            int suff_sum = suff[n - B + (i + 1)];
            ans = Math.max(ans, pref_sum + suff_sum);
        }
        return ans;
    }
	public int solveScalerSol2(int[] A, int B) {
        int n = A.length;
        int cur = 0;
        for(int i = 0; i < B; i++){
            cur += A[i];
        }
        int back = B - 1; 
        int ans = cur; 
        for(int j = n - 1 ; j >= n-B; j--){
            cur += A[j];
            cur -= A[back];
            back--;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PickBothSides pbs = new PickBothSides();
		int[] A = { 5, -2, 3, 1, 2 };
		pbs.printArray(A);
		System.out.println(pbs.solve(A, 3));// 8
		System.out.println(pbs.solveHis(A, 3)); // 8
		int[] B = { 1, 2 };
		System.out.println(pbs.solve(B, 1)); // 2
		System.out.println(pbs.solveHis(B, 1)); // 2
	}

}
