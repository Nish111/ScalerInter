package contest191122;

import java.util.Scanner;

public class MatrixGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long q = scan.nextInt();
		long[] r = new long[100005];
		long[] c = new long[100005];
		for(int i=0; i<n; i++) r[i] = i;
		for(int i=0; i<m; i++) c[i] = i;
		for(int i=0; i<q; i++) {
			int t = scan.nextInt();
			if(t==1) {
				int c1 = scan.nextInt();
				int c2 = scan.nextInt();
				long tm = c[c1-1];
				c[c1-1] = c[c2-1];
				c[c2-1] = tm;
			}
			if(t==2) {
				int r1 = scan.nextInt();
				int r2 = scan.nextInt();
				long tm = r[r1-1];
				r[r1-1] = r[r2-1];
				r[r2-1] = tm;
			}
			if(t==3) {
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				int x2 = scan.nextInt();
				int y2 = scan.nextInt();
				long a = r[x1-1]*m + c[y1-1] +1;
				long b = r[x2-1]*m + c[y2-1] +1;
				System.out.println(a|b); // 7
			}
			if(t==4) {
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				int x2 = scan.nextInt();
				int y2 = scan.nextInt();
				long a = r[x1-1]*m + c[y1-1] +1;
				long b = r[x2-1]*m + c[y2-1] +1;
				System.out.println(a&b); // 2
			}
		}
		/*
		 * 2 3 4
1 2 3
3 1 2 2 2
2 1 2
4 1 2 2 3
		 */
	}
}
