package array021122;

import java.util.HashSet;

// https://www.scaler.com/academy/mentee-dashboard/class/40901/assignment/problems/11160?navref=cl_tt_nv
public class SumPair { // GoodPair
	/*
	 * Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and 
	 * (A[i] + A[j] == B). Check if any good pair exist or not.
	 */
	public int solve(int[] A, int B) {
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i] + A[j] == B){
                    return 1;
                }
            }
        }
        return 0;
    }
	public int solve2(int[] A, int B) {
		HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<A.length; i++){
            if(hashSet.contains(B-A[i])) {
            	hashSet.add(A[i]);
            	return 1;
            } else {
            	hashSet.add(A[i]);
            }
        }
        return 0;
    }
	public int solveScalerSol(int[] A, int B) {
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(i == j) continue;
                if(A[i] + A[j] == B) return 1;
            }
        }
        
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumPair sp = new SumPair();
		int[] A = {3,5,-1,6,4};
		int[] B = {1,2,3,4};
		System.out.println(sp.solve(A, 8)); // 1
		System.out.println(sp.solve(B, 7)); // 1
		System.out.println(sp.solve2(A, 8)); // 1
		System.out.println(sp.solve2(B, 8)); // 1
	}

}
