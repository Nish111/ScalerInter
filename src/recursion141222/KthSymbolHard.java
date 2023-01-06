package recursion141222;

import java.util.ArrayList;

// https://www.scaler.com/academy/mentee-dashboard/class/40887/homework/problems/31788/hints?navref=cl_pb_nv_tb
public class KthSymbolHard {
/*
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and 
 * replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values 
of B are 0-indexed.).
 */
	
    public int solve4(int A, Long B) { // stack overflow to me but working on Scaler
        if(A==1) return 0;       // base case
        int r=solve4(A-1,B/2);    // recursive call
        return B%2==1 ? r^1 : r; // conditional return

    }
    public int findScalerSol(int n, long k){
     	if(k==0){
    		return 0;
     	}
    	int val = findScalerSol(n- 1 , k / 2);
    	if(k % 2 == 0){
    		return val;
    	}
    	return 1 - val;
    }
    public int solveScalerSol(int A, long B) {
        return findScalerSol(A, B);
    }
    public int solveHard(int A, long B) { // stack overflow
        if(B==0 || B==1) return (int)B;
	    long indices = 1<< (A-1);   
	        //System.out.println(indices);
	    if(B < indices/2) return solveHard(A-1, B);
	    else return 1 - solveHard(A-1, B - (indices/2));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSymbolHard ks = new KthSymbolHard();
		System.out.println(ks.solveScalerSol(3, 0)); // 0 -> 0, 01, 0110
		System.out.println(ks.solveScalerSol(4, 4)); // 1 -> 0, 01, 0110, 01101001
		System.out.println(ks.solveScalerSol(3, 0)); // 0 -> 0, 01, 0110
		System.out.println(ks.solveScalerSol(4, 4)); // 1 -> 0, 01, 0110, 01101001
		//System.out.println(ks.solveHard(417, 135)); 
		System.out.println(ks.solveScalerSol(417, 135));
		//System.out.println(ks.solve3(59701, 294634972693719732L));
		System.out.println(ks.solveScalerSol(417, 135));
		System.out.println(ks.solveScalerSol(59701, 294634972693719732L));
		System.out.println(ks.solve4(417, 135L));
		//System.out.println(ks.solve4(59701, 294634972693719732L));
	}

}
