package array111122;

import java.util.HashSet;
// https://www.scaler.com/academy/mentee-dashboard/class/40895/homework/problems/11455/hints?navref=cl_pb_nv_tb
public class RowToColumnZero {
	public int[][] solve(int[][] A) {// Failing for some giving arrayindex out of bounds on B[k][1]=j;
		int[][] B = new int[A.length][2];
		int k=0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j]==0){
                	B[k][0]=i;
                	B[k][1]=j;
                	k++;
                    //makeRowColZero(A, i, j);
                } 
            }
        }
        // printing here
        for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
        //System.out.println(k);
        for(int x=0; x<k;x++) {
        	for(int j=0;j<A[0].length; j++){ 
   			 	A[B[x][0]][j]=0; 
   		 	} 
   		 	for(int i=0; i<A.length; i++){
   		 		A[i][B[x][1]]=0; 
   		 	} 
        }
        for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println("Solve");
		}
        return A;
    }
	public void makeRowColZero(int[][] A, int row, int col){ 
		 for(int j=0;j<A[0].length; j++){ 
			 A[row][j]=0; 
		 } 
		 for(int i=0; i<A.length; i++){
	         A[i][col]=0; 
	     } 
	 }
	public int[][] solveAgain(int[][] A) {
		HashSet<Integer> rowEntry = new HashSet<>();
		HashSet<Integer> colEntry = new HashSet<>();
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j]==0){
                	rowEntry.add(i);
                	colEntry.add(j);
                } 
            }
        }
        for(Integer onRow: rowEntry) {
        	makeRowZero(A, onRow);
        }
        for(Integer onCol: colEntry) {
        	makeColZero(A, onCol);
        }
        for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
        return A;
    }
	public void makeRowZero(int[][] A, int row){ 
		 for(int x=0;x<A[0].length; x++){ 
			 A[row][x]=0; 
		 } 
	}
	public void makeColZero(int[][] A, int col){ 
		for(int y=0; y<A.length; y++){
	         A[y][col]=0; 
	     }  
	}
	public int[][] solveScalerSol(int[][] A) {
        int n = A.length, m = A[0].length;
    	for(int i = 0; i < n; i++){
    		int flag = 0;
    		for(int j = 0; j < m; j++){
    			if(A[i][j]==0)flag = 1;
    		}
    		if(flag == 1){
    			for(int j = 0; j < m; j++){
    				if(A[i][j] != 0) A[i][j] = -1;
    			}
    		}
    	}
    	for(int j = 0; j < m; j++){
    		int flag = 0;
    		for(int i = 0; i < n; i++){
    			if(A[i][j]==0)flag = 1;
    		}
    		if(flag == 1){
    			for(int i = 0; i < n; i++){
    				if(A[i][j] != 0) A[i][j] = -1;
    			}
    		}
    	}
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
    			if(A[i][j] == -1)A[i][j] = 0;
    		}
    	}
    	return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RowToColumnZero rtcz = new RowToColumnZero();
		int[][] A = {{1,2,3,4}, {5,6,7,0}, {9,2,0,4}};
		//rtcz.solve(A);
		int[][] B = {{97, 18, 55, 1, 50, 17, 16, 0, 22, 14}, {58, 14, 75, 54, 11, 23, 54, 95, 33, 23},
					{73, 11, 2, 80, 6, 43, 67, 82, 73, 4}, {61, 22, 23, 68, 23, 73, 85, 91, 25, 7},
					{6, 83, 22, 81, 89, 85, 56, 43, 32, 89}, {0, 6, 1, 69, 86, 7, 64, 5, 90, 37},
				    {10, 3, 11, 33, 71, 86, 6, 56, 78, 31}, {16, 36, 66, 90, 17, 55, 27, 26, 99, 59},
					{67, 18, 65, 68, 87, 3, 28, 52, 9, 70}, {41, 19, 73, 5, 52, 96, 91, 10, 52, 21}};
		//rtcz.solve(B);
		rtcz.solveAgain(B);
		
	}

}
