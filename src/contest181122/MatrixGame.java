package contest181122;

import java.util.Scanner;

public class MatrixGame { // bookmark

	public void printArray(long[] A) {
		for(long i:A) {
			if(i!=0) System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		MatrixGame mg = new MatrixGame();
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long q = scan.nextInt();
		long[] r = new long[100005];
		long[] c = new long[100005];
		for (int i = 0; i < n; i++)
			r[i] = i;
		for (int i = 0; i < m; i++)
			c[i] = i;
		mg.printArray(r);
		mg.printArray(c);
		for (int i = 0; i < q; i++) {
			int t = scan.nextInt();
			if (t == 1) {
				int c1 = scan.nextInt();
				int c2 = scan.nextInt();
				long tm = c[c1 - 1];
				c[c1 - 1] = c[c2 - 1];
				c[c2 - 1] = tm;
			}
			mg.printArray(c);
			if (t == 2) {
				int r1 = scan.nextInt();
				int r2 = scan.nextInt();
				long tm = r[r1 - 1];
				r[r1 - 1] = r[r2 - 1];
				r[r2 - 1] = tm;
			}
			mg.printArray(r);
			if (t == 3) {
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				int x2 = scan.nextInt();
				int y2 = scan.nextInt();
				long a = r[x1 - 1] * m + c[y1 - 1] + 1;
				long b = r[x2 - 1] * m + c[y2 - 1] + 1;
				System.out.println(a | b);
			}
			if (t == 4) {
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				int x2 = scan.nextInt();
				int y2 = scan.nextInt();
				long a = r[x1 - 1] * m + c[y1 - 1] + 1;
				long b = r[x2 - 1] * m + c[y2 - 1] + 1;
				System.out.println(a & b);
			}
		}

	}
}
