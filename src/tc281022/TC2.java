package tc281022;

public class TC2 {
	public int someCode(int n) {
		int count = 0;
		for (int i = 1, j = 1; j <= n; i++) {
			System.out.println(i + j);
			count++;
			if (i % n == 0) {
				j++; // j increments only when i becomes multiple of n
				// so each for loop iteration before j increments is n and each such loop 2
				// so n^2
			}
		}
		return count;
	}

	public static void main(String[] args) {
		TC2 tc = new TC2();
		System.out.println(tc.someCode(25));// 625

	}

}
