package recursion141222;

import java.util.ArrayList;

// https://www.scaler.com/academy/mentee-dashboard/class/40887/homework/problems/31810?navref=cl_tt_nv
public class KthSymbol {
/*
 * On the first row, we write a 0. Now in every subsequent row, we look at the 
 * previous row and replace each occurrence of 0 with 01, and each occurrence of 1 
 * with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values 
of B are 0-indexed.).
 */
	public int solve(int A, int B) {
		StringBuilder sb0 = new StringBuilder("0");
		StringBuilder sbA = new StringBuilder(createRows(sb0, A-1));
		if(sbA.charAt(B)=='0') return 0;
		else return 1;
	}
	public StringBuilder createRows(StringBuilder sb0, int len) {
		if(len==0) return sb0;
		else {
			StringBuilder temp = new StringBuilder();
			for(int i=0; i<sb0.length(); i++) {
				if(sb0.charAt(i)=='0') temp.append("01");
				else temp.append("10");
			}
			return createRows(temp, len-1);
		}
	}
	public  char solve3(int n, int b, StringBuilder sb){
        if(sb.length()>b) return sb.charAt(b);
        if(sb.length() == 0) sb.append("01");
        else if(sb.charAt(n) == '0') sb.append("01");
        else if(sb.charAt(n) == '1') sb.append("10");
        return solve3(n+1,b,sb);
    }
    public int solve3(int A, int B) {
        if(B == 0) return 0;
        StringBuilder sb = new StringBuilder();
        int ans = solve3(0,B,sb) - '0';
        return ans;
    }
    ArrayList<Integer> A_th_RowScalerSol(int A) {
        if(A == 1){
            ArrayList<Integer> v2 = new ArrayList<Integer>();
            v2.add(0);
            return v2;   
        }
        ArrayList<Integer> v1 = A_th_RowScalerSol(A - 1);
        ArrayList<Integer> v2 = new ArrayList<Integer>();
        for(int i = 0 ; i < v1.size(); i++){
            if(v1.get(i) == 0){
                v2.add(0);
                v2.add(1);
            }
            else{
                v2.add(1);
                v2.add(0);
            }
        }
        return v2;
    }
    public int solveScalersol(int A, int B) {
        return A_th_RowScalerSol(A).get(B);
    }
	 public int solve2(int A, int B) {
	        if(B==0 || B==1) return B;
	        int indices = 1<< (A-1);   //contains count of elements in row A which will be 2^(A-1)
	        if(B < indices/2)         //if B is in the first half, it will be the same symbol on the same index of prev row
	          return solve2(A-1, B);
	        else                      //if B is in the second half, it will be the opposite symbol on the prev row at B - indices/2 index 
	          return 1 - solve2(A-1, B - (indices/2));
/*
 * OBSERVATION:
Here we observe that- 
1. every row is double the count of elements in prev row
2. the first half elements of any row are identical to those of previous row
3. the second half of elements of any row are inverse of the first half of the elements

APPROACH:
1. We will see the Base condition would be 0 if B == 0, and 1 if B == 1
2. from observation 2 (above), if B is present in 1st half of the elements, we will recursively call the function to check the 
    prev row (A-1) for the same index B
3. from the observation 3 (above), if B is present in the 2nd half of the elements, we will take inverse (i.e. 1 - symbol) of 
    the element at prev row at index B - half of indices.
 */
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSymbol ks = new KthSymbol();
		System.out.println(ks.solve(3, 0)); // 0 -> 0, 01, 0110
		System.out.println(ks.solve(4, 4)); // 1 -> 0, 01, 0110, 01101001
		
	}

}
