package array111122;

public class RectangleMatrix {
	public static void printRectange(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(i<n-1 && j>=0) {
					System.out.print(mat[i][j]);
					j--;
					i++;
				}
			}
			System.out.println();
		}
	}
	public static void printRectangeHis(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int i=0;
		for(int j=0; j<m; j++) {
			int row=i;
			int col=j;
			while(row<n && col >= 0) {
				System.out.print(mat[row][col] + " ");
				row++;
				col--;
				}
			System.out.println();
		}
		int j=m-1;
		for(int i1=1; i1<n; i1++) {
			int row=i1;
			int col=j;
			while(row<n && col >= 0) {
				System.out.print(mat[row][col] + " ");
				row++;
				col--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		printRectangeHis(mat);
	}

}
