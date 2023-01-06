package array141122;
// https://www.scaler.com/academy/mentee-dashboard/class/40903/homework/problems/1083/submissions
public class ChristmasTree {
	public int solveScalerSol(int[] A, int[] B) {
        final int inf = (int)(1e9 + 10);
        int n = A.length;
        int ans = inf;
        for(int i = 0 ; i < n ; i++){
            int left_min = inf , right_min = inf;
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    left_min = Math.min(left_min, B[j]);
                }
            }
            for(int j = i + 1 ; j < n ; j++){
                if(A[j] > A[i]){
                    right_min = Math.min(right_min, B[j]);
                }
            }
            int temp_ans = left_min + B[i] + right_min;
            ans = Math.min(ans , temp_ans);
        }
        if(ans == inf) ans = -1;
        return ans;
    }
	public int solve(int[] A, int[] B) {
		int min_left=Integer.MAX_VALUE;
		int min_right=Integer.MAX_VALUE;
		int total = 0; int min_total = Integer.MAX_VALUE;
		if (A.length == 0)
			return 0;
		for (int j = 1; j < A.length - 1; j++) {
			min_left = Integer.MAX_VALUE;
			min_right = Integer.MAX_VALUE;
			for (int i = 0; i < j; i++) {
				if (A[i] < A[j])
					min_left=Math.min(B[i], min_left);
			}
			for (int k = j + 1; k < A.length; k++) {
				if (A[j] < A[k])
					min_right=Math.min(B[k], min_right);
			}
			// only updating if left and right both has min value else no update
			if(min_left != Integer.MAX_VALUE && min_right != Integer.MAX_VALUE) {
				min_total = Math.min(min_total, min_left + min_right+B[j]);
			}
			//System.out.println(total + " " + min_left + " " + min_right);
		}
		if(min_total==Integer.MAX_VALUE) return -1;
		else return min_total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChristmasTree ct = new ChristmasTree();
		int[] A = {1, 3, 5};
		int[] B = {1,2,3};
		System.out.println(ct.solve(A, B));//6
		int[] C = {1, 6, 4, 2, 6, 9};
		int[] D = {2, 5, 7, 3, 2, 7};
		System.out.println(ct.solve(C, D));//7 
		int []E = { 5, 9, 10, 4, 7, 8 };
		int[] F = { 5, 6, 4, 7, 2, 5 };
		System.out.println(ct.solve(E, F));// 12
	}

}
