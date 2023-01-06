package recursion141222;

public class Power1 {
	public int pow1(int a, int n) {
		if (n==0) return 1;
		return pow1(a, n-1)*a;
	}
	public int pow2(int a, int n) {
		if (n==0) return 1;
		if(n%2==0) {
			return pow2(a, n/2)* pow2(a, n/2);
		} else {
			return pow2(a, n/2)* pow2(a, n/2) * a;
		}
	}
	public int pow3(int a, int n) {
		if (n==0) return 1;
		int p = pow3(a, n/2);
		if(n%2==0) {
			return p*p;
		} else {
			return p*p * a;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power1 p1 = new Power1();
		System.out.println(p1.pow1(2, 5)); // 32
		System.out.println(p1.pow1(3, 4)); // 81
		System.out.println(p1.pow2(2, 5)); // 32
		System.out.println(p1.pow2(3, 4)); // 81
		System.out.println(p1.pow3(2, 5)); // 32
		System.out.println(p1.pow3(3, 4)); // 81

	}

}
