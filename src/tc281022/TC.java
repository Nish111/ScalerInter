package tc281022;

public class TC {

	public static void tc1(int n) {
		// The print statement executes for (3^1 + 3^2 + 3^3 + .. + 3^n) times which is
		// (3^n - 1)/2
		// So, time complexity is O(3^n).
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= Math.pow(3, i); j++) {
				System.out.println(i + j);
			}
		}
	}

	public static void tc2(int N) {
		/*
		 * We have to find k such that, N/(3^k) = 0 We will approx it to, N/(3^k) = 1
		 * Or, N = 3^k Taking log we will get k=logN where base is 3.
		 */
		int count = 0;
		while (N > 0) {
			count++;
			N /= 3;
		}
		System.out.println(count);
	}

	public static void tc3(int N) {
		// Here for every i the inner loop will run for only interation. So the
		// complexity is the number of times outer loop will run.
		// That is N so complexity is O(N).
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				System.out.println(j + " " + i);
				break;
			}
		}
	}

	public static void tc4(int N) {
		/*
		 * The outer loops runs from 1 to 2^ N. The inner loop runs from i to 0. So,
		 * worst case TC will be O((2^N)^2) = O(4^N).
		 */
		int count=0;
		for (int i = 0; i < Math.pow(2, N); i++) {
			int j = i;
			while (j > 0) {
				j -= 1;
				System.out.println(i + " " + j);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tc1(2); // O(3^n)
		tc2(5);
		tc3(5);
		tc4(5); // O(4^N)
	}

}
