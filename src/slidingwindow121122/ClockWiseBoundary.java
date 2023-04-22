package array121122;

public class ClockWiseBoundary {
// problem 3
	public static void printBoundaryClockwise(int[][] A) {
		for(int j=0; j<A[0].length-1; j++) {
			System.out.print(A[0][j] + " ");
		}
		System.out.println();
		for(int i=0; i<A.length-1; i++) {
			System.out.print(A[i][A.length-1] + " ");
		}
		System.out.println();
		for(int j=A[0].length-1; j>0; j--) {
			System.out.print(A[A.length-1][j] +" ");
		}
		System.out.println();
		for(int i=A.length-1; i>0; i--) {
			System.out.print(A[i][0] + " ");
		}
		System.out.println();
	}
	public static void printBoundaryClockwiseSimple(int[][] A) {
		int i=0; int j=0;
		for(int k=1; k<A[0].length; k++) {
			System.out.print(A[i][j] + " ");
			j++;
		}
		System.out.println();
		for(int k=1; k<A[0].length; k++) {
			System.out.print(A[i][j] + " ");
			i++;
		}
		System.out.println();
		for(int k=1; k<A[0].length; k++) {
			System.out.print(A[i][j] + " ");
			j--;
		}
		System.out.println();
		for(int k=1; k<A[0].length; k++) {
			System.out.print(A[i][j] + " ");
			i--;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},
				{16,17,18,19,20}, {21,22,23,24,25}};
		printBoundaryClockwise(A);
		printBoundaryClockwiseSimple(A);
	}
/*
 * 1 2 3 4 
5 10 15 20 
25 24 23 22 
21 16 11 6 
 */
}
