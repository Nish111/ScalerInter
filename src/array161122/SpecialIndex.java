package array161122;

public class SpecialIndex {
	private int cntIndexesToMakeBalanceScalerSol(int arr[], int n) {
		if (n == 1) {
			return 1;
		}

		if (n == 2)
			return 0;

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sumEven += arr[i];
			} else {
				sumOdd += arr[i];
			}
		}

		int currOdd = 0;
		int currEven = arr[0];
		int res = 0;
		int newEvenSum = 0;
		int newOddSum = 0;

		for (int i = 1; i < n - 1; i++) {
			if (i % 2 == 1) {
				currOdd += arr[i];
				newEvenSum = currEven + sumOdd - currOdd;
				newOddSum = currOdd + sumEven - currEven - arr[i];
			} else {
				currEven += arr[i];
				newOddSum = currOdd + sumEven - currEven;
				newEvenSum = currEven + sumOdd - currOdd - arr[i];
			}
			if (newEvenSum == newOddSum) {
				res++;
			}
		}
		if (sumOdd == sumEven - arr[0]) {
			res++;
		}
		if (n % 2 == 1) {
			if (sumOdd == sumEven - arr[n - 1]) {
				res++;
			}
		} else {
			if (sumEven == sumOdd - arr[n - 1]) {
				res++;
			}
		}
		return res;
	}

	public int solveScalerSol(int[] A) {
		int n = A.length;
		return cntIndexesToMakeBalanceScalerSol(A, n);
	}

	public static int specialIndex(int[] A) {
		int[] evenPf = new int[A.length];
		int[] oddPf = new int[A.length];
		evenPf[0] = A[0];
		oddPf[0] = 0;
		for (int i = 1; i < A.length; i++) {
			if (i % 2 == 0) {
				evenPf[i] = evenPf[i - 1] + A[i];
				oddPf[i] = oddPf[i - 1];
			} else {
				evenPf[i] = evenPf[i - 1];
				oddPf[i] = oddPf[i - 1] + A[i];
			}
		}
		for (int i = 0; i < A.length; i++)
			System.out.print(evenPf[i] + " ");
		System.out.println();
		for (int i = 0; i < A.length; i++)
			System.out.print(oddPf[i] + " ");
		System.out.println();
		// checking sum now for special index
		int sumOdd = 0;
		int sumEven = 0;
		int specialIndex = 0;
		// edge case for 0th element
		if ((evenPf[A.length - 1] - evenPf[0]) == (oddPf[A.length - 1] - oddPf[0])) {
			specialIndex++;
			System.out.println("This is special index 0");
		}
		for (int i = 1; i < A.length; i++) {
			sumOdd = oddPf[i - 1] + (evenPf[A.length - 1] - evenPf[i]);
			sumEven = evenPf[i - 1] + (oddPf[A.length - 1] - oddPf[i]);
			if (sumEven == sumOdd) {
				specialIndex++;
				System.out.println("This is special index " + i);
			}
		}
		return specialIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 4, 3, 2, 7, 6, -2 };
		System.out.println(specialIndex(A));// 2
	}

}
