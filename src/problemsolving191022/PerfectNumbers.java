package problemsolving191022;
// https://www.scaler.com/academy/mentee-dashboard/class/40900/homework/problems/29084?navref=cl_tt_lst_nm
public class PerfectNumbers {
/*
 * You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.
 */
	public int solve(int A) {
	       int sum = 0;
			if (A == 1) {
				return 0;
			}
			for (int i = 2; i <= Math.sqrt(A); i++) {
				if (A % i == 0) {
					sum += i;
					sum += A/i;
				}
			}
			sum++;// adding 1 as 1 is divisor
			if (sum == A) {
				return 1;
			} else {
				return 0;
			}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumbers pn = new PerfectNumbers();
		System.out.println(pn.solve(4));// 0
		System.out.println(pn.solve(6));// 1

	}

}
