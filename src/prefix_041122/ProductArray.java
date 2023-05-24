package prefix_041122;
// https://www.scaler.com/academy/mentee-dashboard/class/40897/homework/problems/4103/submissions
public class ProductArray { // bookmarked
/*
 * Given an array of integers A, find and return the product array of the 
 * same size where the ith element of the product array will be equal to the 
 * product of all the elements divided by the ith element of the array.
Note: It is always possible to form the product array with integer (32 bit) 
values. Solve it without using the division operator.
 */
	public int[] solve(int[] A) {
		int B[] = new int[A.length];
		int product=1;
		for(int i=0; i<A.length;i++) {
			product *=A[i];
		}
		for(int i=0; i<B.length;i++) {
			B[i] =product/A[i];
		}
		return B;
    }
	public int[] solve2(int[] A) { // Solve it without using the division operator.
		int B[] = new int[A.length];
		for(int i=0; i<B.length; i++)
			B[i]=1;
		for(int i=0; i<A.length;i++) {
			for(int j=0; j<A.length; j++) {
				if(i!=j) B[i] *=A[j];
			}
			
		}
		return B;
    }
	public int[] solveScalerSol(int[] A) {// check once
        int n = A.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i - 1] * A[i];
        }
        suff[n - 1] = A[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--){
            suff[i] = suff[i + 1] * A[i];
        }
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                ans[i] = suff[i + 1];
            }
            else if(i == n - 1){
                ans[i] = pref[i - 1];
            }
            else{
                ans[i] = pref[i - 1] * suff[i + 1];
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductArray pa = new ProductArray();
		int[] A = {1, 2, 3, 4, 5};
		int[] B = pa.solve2(A);
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		int[] C = {5, 1, 10, 1};
		int[] D = pa.solve(C);
		for(int i=0; i<D.length; i++) {
			System.out.print(D[i] + " ");
		}
		System.err.println();
	}

}
