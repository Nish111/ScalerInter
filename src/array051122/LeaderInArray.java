package array051122;

import java.util.ArrayList;
// https://www.scaler.com/academy/mentee-dashboard/class/40896/assignment/problems/11921?navref=cl_tt_nv
public class LeaderInArray {
/*
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A.

An element is a leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.
 */
	// starts ScalerSol
	ArrayList<Integer> printLeaders(ArrayList<Integer> arr) 
    { 
        int size = arr.size();
        int max_from_right =  arr.get(size-1); 
      
        ArrayList<Integer> ans = new ArrayList<>();
        /* Rightmost element is always leader */
        ans.add(arr.get(size-1));
        
        for (int i = size-2; i >= 0; i--) 
        { 
            if (max_from_right < arr.get(i)) 
            {            
                max_from_right = arr.get(i);
                ans.add(max_from_right);
            } 
        }
        return ans;
    } 
    
    public ArrayList<Integer> solveScalerSol(ArrayList<Integer> A) {
        return printLeaders(A);
    }
    // ends
	public int[] solve(int[] A) {
		int N = A.length;
		int[] B = new int [N];// created this array to mark the leader elements
		int max = A[N-1];
		B[0] = max;
		int j=1;
		int count=1;
		for(int i=N-2; i>=0; i--) {
			if(A[i]>max) {
				max=A[i];
				B[j]=max;
				j++;
				count++;
			}
		}
		int[] C = new int[count]; // this array to store and display all leaders
		int k=0;
		for(int i=0; i<B.length; i++) {
			if(B[i] != 0) {
				C[k]=B[i];
				k++;
			}
		}
		return C;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaderInArray lia = new LeaderInArray();
		int[] A = {16, 17, 4, 3, 5, 2};
		int[] B = lia.solve(A);
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i] + " ");
			/*
			 * if(B[i] != 0) { System.out.print(B[i] + " "); // 2 5 17 }
			 */
		}
		int[] C = {93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26 };
		int[] D = lia.solve(C);
		for(int i=0; i<D.length; i++) {
			System.out.print(D[i] + " ");
		}
	}

}
