package array121122;

public class SpiralPrinting {
	public static void spiralPrint(int[][] A) {
		int N = A.length;
		int i = 0; int j = 0;
		while(N>1) {
			for (int k = 1; k < N; k++) {
				System.out.print(A[i][j] + " ");
				j++;
			}
			System.out.println();
			for (int k = 1; k < N; k++) {
				System.out.print(A[i][j] + " ");
				i++;
			}
			System.out.println();
			for (int k = 1; k < N; k++) {
				System.out.print(A[i][j] + " ");
				j--;
			}
			System.out.println();
			for (int k = 1; k < N; k++) {
				System.out.print(A[i][j] + " ");
				i--;
			}
			System.out.println();
			N=N-2; i++; j++;
		}
		if(N==1) {
			System.out.print(A[i][j] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 },{ 21, 22, 23, 24, 25 } };
		spiralPrint(A);
		int[][] B = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11,12 },
				{13, 14, 15, 16, 17, 18 }, {19, 20, 21,22,23,24 },
				{25, 26,27,28,29,30 },{31,32,33,34,35,36 } };
		spiralPrint(B);
	}

}
