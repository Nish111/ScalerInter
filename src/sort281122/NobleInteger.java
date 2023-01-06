package sort281122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// https://www.scaler.com/academy/mentee-dashboard/class/40890/assignment/problems/372/hints?navref=cl_pb_nv_tb
public class NobleInteger { // check once
	public int solve(int[] A) {
		Arrays.sort(A);
		A = Arrays.stream(A).boxed().sorted((a,b) -> b.compareTo(a)).mapToInt(i -> i).toArray();
		//for(int j=0; j<A.length; j++) { System.out.print(A[j] + " "); }
		//System.out.println();
		int count=0;
		if(A[0]==0) return 1;
		for(int i=1; i<A.length; i++) {
			if(A[i] != A[i-1] && i==A[i]) { // taking care of duplicate
				count++;
				//System.out.println(A[i]);
				return 1;
			}
			
		}
		if(count==0) return -1;
		else return 1;
    }
	public int solveScalerSol(ArrayList<Integer> A) {
        Collections.sort(A);
        int size = A.size();
        for(int i = 0; i < size; i++){
        	while(i+1<size && A.get(i)==A.get(i+1))
        		i++;
        	if(A.get(i) == size-1-i)
        		return 1;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NobleInteger ni = new NobleInteger();
		int A[] = {99, 11, 7, 21, 4, 2};
		System.out.println(ni.solve(A)); // 1
		int[] B = {3, 2, 1, 3};
		int[] C = {1,1,3,3};
		System.out.println(ni.solve(B)); // 1
		System.out.println(ni.solve(C)); // -1
		int[] D = { -4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5 };
		System.out.println(ni.solve(D)); // -1
		int[] E = {5,6,2};
		System.out.println(ni.solve(E));// 1
	}

}
