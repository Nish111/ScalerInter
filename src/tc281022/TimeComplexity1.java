package tc281022;
public class TimeComplexity1 {

	public int someLoop(int[][][] A) {
		int sum=0; int count=0;
		int N = A.length;
		int M = A[0].length;
		int K = A[0][0].length;
		for(int i=1; i<N; i++) {
			for(int j=i ;j<M; j++) {
				for(int k=j; k<K; k++) {
					//sum += A[i][j][k];
					count++;
				}
			}
		}
		return count; // O(NMK) is correct
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimeComplexity1 tc = new TimeComplexity1();
		int[][][] A = new int[10][5][4]; // 10
		System.out.println(tc.someLoop(A));
		int[][][] B = new int[10][10][10]; // 165
		System.out.println(tc.someLoop(B));
		int[][][] C = new int[10][20][25]; // 1785
		System.out.println(tc.someLoop(C));
		// NMK or N+M+K or N*M+K or N+M*K
		int[][][] D = new int[5][10][15]; // 280
		System.out.println(tc.someLoop(D));
		int[][][] E = new int[15][10][5]; // 20
		System.out.println(tc.someLoop(E));
		int[][][] F = new int[100][10][15]; // 390
		System.out.println(tc.someLoop(F));
		int[][][] G = new int[5][100][15]; // 450
		System.out.println(tc.someLoop(G));
		int[][][] H = new int[5][15][100]; // 4590
		System.out.println(tc.someLoop(H));
		

	}

}
