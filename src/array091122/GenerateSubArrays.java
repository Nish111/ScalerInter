package array091122;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
// https://www.scaler.com/academy/mentee-dashboard/class/40902/assignment/problems/26732/submissions
public class GenerateSubArrays {
	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> list2D = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A.size(); i++) {
			for (int j = i; j < A.size(); j++) {
				ArrayList<Integer> list1D = new ArrayList<Integer>();
				for (int k = i; k <= j; k++) {
					list1D.add(A.get(k));
				}
				list2D.add(i, list1D);
			}
		}
		return list2D;
	}
	 public ArrayList<ArrayList<Integer>> solveScalerSol(ArrayList<Integer> A) {
	        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	        int n = A.size();
	        for(int i = 0 ; i < n ; i++){
	            for(int j = i ; j <n ; j++){
	                ArrayList<Integer> v = new ArrayList<Integer>();
	                for(int k = i ; k <= j ; k++){
	                    v.add(A.get(k));
	                }
	                ans.add(v);
	            }
	        }
	        return ans;
	    }
	public int[][] solve(int[] A) { // not able to solve using only arrays
		int newLen = A.length * (A.length + 1) / 2;
		int[][] B = new int[newLen][A.length];

		ArrayList<ArrayList<Integer>> list2D = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list1D = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for (int k = i; k <= j; k++) {
					temp.add(A[k]);
				}
			}
		}
		
		return B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateSubArrays gsa = new GenerateSubArrays();
		int[] A = { 1, 2, 3 };
		ArrayList<Integer> D = new ArrayList<>();
		D.add(1);
		D.add(2);
		D.add(3);
		ArrayList<ArrayList<Integer>> C = gsa.solve(D);
		ListIterator<ArrayList<Integer>> E = C.listIterator();
		while(E.hasNext()) {
			System.out.println(E.next());
		}
		int[][] B = gsa.solve(A); // not working
		
		for (int i = 0; i < B.length; i++) { for (int j = 0; j < B[i].length; j++) {
		System.out.println(B[i][j]); } }
		
	}

/* Not able to follow this
1.create a 2D array list 
2. create a array list(to store the sub arrays)
3. for loop from l to n
4. nested for loop from r=l to n
5. nested of nested for loop for the sub array i =0 to n
6. add the elements to an array first
7. then add them to 2D array after the inner most loop of i gets executed
8. clear the array list to add new sub array
*/	
}