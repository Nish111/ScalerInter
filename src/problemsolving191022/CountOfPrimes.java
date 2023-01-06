package problemsolving191022;
// https://www.scaler.com/academy/mentee-dashboard/class/40900/homework/problems/6779?navref=cl_tt_nv
public class CountOfPrimes {
/*
 * You will be given an integer n. You need to return the count of prime numbers less 
 * than or equal to n.
 */
	public int solve(int A) {
		boolean isPrime = false;
		int count = 0;
		if (A == 1) return 0;
		if (A == 2) isPrime = true;
		if (A == 3) return 2;
		if (A > 3) count = 2;
		isPrime = true;
		for (int j = 4; j <= A; j++) {
			isPrime = true;
			for (int i = 2; i <= Math.sqrt(j); i++) {
				if (j % i == 0) isPrime = false;
			}
			if (isPrime) count++;
			// System.out.println(count + "i " + i +" j "+ j);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
