package sort281122;

public class NumberOfDigits {

	public boolean compare(int a, int b) {
		// TODO Auto-generated method stub
		int digit_a = count_digits(a);
		int digit_b = count_digits(b);
		if(digit_a < digit_b) return true;
		else if((digit_a == digit_b) && (a>b)) return true;
		else return false;
	}
	public int count_digits(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
