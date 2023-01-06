package sort281122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// https://www.scaler.com/academy/mentee-dashboard/class/40890/homework/problems/10208?navref=cl_tt_nv
public class ArithmeticProgression {

	public int solve(int[] A) {
		Arrays.sort(A);
		int diff = A[1]-A[0];
		for(int i=2; i<A.length; i++) {
			if(A[i]-A[i-1] != diff) return 0;
		}
		return 1;
		
	}
	public int solveScalerSol(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        int dif = A.get(1) - A.get(0);
        int ans = 1;
        for(int i = 1; i < n; i++){
            if(A.get(i) - A.get(i-1) != dif){
                ans = 0;
                break;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticProgression ae = new ArithmeticProgression();
		int[] A = {3, 5, 1};
		System.out.println(ae.solve(A));//1
		int[] B = {2,4,1};
		System.out.println(ae.solve(B));//0
	}

}
