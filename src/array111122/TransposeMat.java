package array111122;

public class TransposeMat {

	public static void transposeMat(int[][] mat) {
		int N = mat.length;
		for(int i=0; i<N; i++) {
			for(int j=i; j<N; j++) {
				if(i==j) {
					continue;
				}
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}	
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},
				{16,17,18,19,20}, {21,22,23,24,25}};
		transposeMat(mat);
	}
}
