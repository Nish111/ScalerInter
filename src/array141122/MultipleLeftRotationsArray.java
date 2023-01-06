package array141122;

import java.util.ArrayList;

// https://www.scaler.com/academy/mentee-dashboard/class/40903/homework/problems/3852/submissions
public class MultipleLeftRotationsArray {

	public ArrayList<ArrayList<Integer>> solveScalerSol(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList< ArrayList<Integer> > ans = new ArrayList<>();
        int n = a.size();
        for(int x : b) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++)  temp.add(a.get( (i+x) % n ));
            ans.add(temp);
        }
        return ans;
    }
	 public int[][] solve(int[] A, int[] B) {
		 int[][] C = new int[B.length][A.length];
		 for(int i=0; i<B.length; i++) {
			 for(int j=0; j<A.length; j++) {
				 C[i][j]=A[(j+ B[i])%A.length];
			 }
		 }
		 return C;
	 }
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleLeftRotationsArray mlra = new MultipleLeftRotationsArray();
		int[] A = {1, 2, 3, 4, 5};
		int[] B = {2, 3};
		int[][] C = mlra.solve(A, B);
		/* [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]*/
		for(int i=0;i<C.length;i++) {
			for(int j=0; j<C[0].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
