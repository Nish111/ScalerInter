package matrices2D111122;
// https://www.scaler.com/academy/mentee-dashboard/class/40895/assignment/problems/55?navref=cl_tt_nv
public class RotateMatrix {
	public void solve(int[][] A) {
        int N = A.length;
        // transpose done
		for(int i=0; i<N; i++) {
			for(int j=i; j<N; j++) {
				if(i==j) {
					continue;
				}
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}	
		}
		printArray(A, N);
        // reverse or swap cols
        for(int i=0; i<N; i++){
            for(int j=0; j<N/2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][N-1-j];
                A[i][N-1-j] = temp;
                //System.out.println(A[i][j] + " xx " + A[0][N-1-j] + " yy ");
            }
        }
        printArray(A, N);
    }
	private void printArray(int[][] A, int N) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RotateMatrix rm = new RotateMatrix();
		int[][] A = {{1,2}, {3,4}}; 
		rm.solve(A);
	}
}
