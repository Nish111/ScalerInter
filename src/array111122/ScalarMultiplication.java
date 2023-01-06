package array111122;

public class ScalarMultiplication {
	public int[][] solve(int[][] A, int B) {
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j] = B*A[i][j];
            }
        }
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScalarMultiplication sm = new ScalarMultiplication();
		int[][] A = {{1,2}, {3,4}}; 
		int[][] B = sm.solve(A, 2);
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
