package array121122;

import java.util.ArrayList;
// https://www.scaler.com/academy/mentee-dashboard/class/40894/assignment/problems/63/?navref=cl_pb_nv_tb
public class SpiralOrderMatrix {
	public ArrayList<ArrayList<Integer>> generateMatrixScalerSol(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	    int rows, cols;
	    int row, col;
	    rows = cols = A;
	    int num = 1;
	    int max = A * A;
	    for (int i = 0; i < rows; i++) {
	        res.add(new ArrayList<>());
	        for (int j = 0; j < rows; j++) {
	            res.get(i).add(0);
	        }
	    }
	    row = col = 0;
	    int dir = 0;
	    int layer = 0;
	    res.get(0).set(0, 1);
	    for (int step = 2; step <= A * A; step++) {
	        switch(dir) {
	            // Go right
	            case 0:
	                if (col == cols - layer - 1) {
	                    row++;
	                    dir = 1;
	                } 
	                else
	                    col++;
	                break;
	           // Go down     
	           case 1:
	               if (row == rows - layer - 1) {
	                   dir = 2;
	                   col--;
	               } else
	                   row++;
	               break;
	           // Go left    
	           case 2:
	               if (col == layer) {
	                   row--;
	                   dir = 3;
	               } else
	                   col--;
	               break;
	           // Go up    
	           case 3:
	               if (row == layer + 1) {
	                   dir = 0;
	                   col++;
	                   layer++;
	               } else
	                   row--;
	               break;
	        }
	        res.get(row).set(col, step);
	    }
	    return res;
	}
	public static int[][] spiralPrint(int A) {
		int N = A;
		int[][] B = new int[A][A];
		int i = 0; int j = 0;
		int value=1;
		while(N>1) {
			for (int k = 1; k < N; k++) {
				B[i][j]=value;
				j++;
				value++;
			}
			for (int k = 1; k < N; k++) {
				B[i][j] = value;
				i++;
				value++;
			}
			for (int k = 1; k < N; k++) {
				B[i][j]=value;
				j--;
				value++;
			}
			for (int k = 1; k < N; k++) {
				B[i][j] = value;
				i--;
				value++;
			}
			N=N-2; i++; j++;
		}
		if(N==1) {
			B[i][j]=value;
			value++;
		}
		return B;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A=spiralPrint(1); // 1
		int[][] B=spiralPrint(2); // 1 2 4 3 
		int[][] C=spiralPrint(5);
		for(int i=0;i<C.length;i++) {
			for(int j=0; j<C.length; j++) {
				System.out.print(C[i][j] + " ");
			}
		}
		System.out.println();

	}

}
