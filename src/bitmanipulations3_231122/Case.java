package bitmanipulations3_231122;

public class Case {
// https://stackoverflow.com/questions/3884793/why-is-double-min-value-in-not-negative
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Double.MIN_EXPONENT); // -1022
		System.out.println(Double.MAX_EXPONENT); // 1023
		System.out.println(Double.MIN_NORMAL); // 2.2250738585072014E-308
		System.out.println(Double.MIN_VALUE); // 4.9E-324
		System.out.println(Double.NEGATIVE_INFINITY); // -Infinity
		System.out.println(-Double.MAX_VALUE); // -1.7976931348623157E308
		int a = 100000; int b = 1000000;
		int c = a*b;
		System.out.println(c); // 1215752192 -- overflow
		long d = a*b;
		System.out.println(d); // 1215752192 -- overflow
		long e = (long)(a*b);
		System.out.println(e); // 1215752192 -- overflow
		long f = (long)(a)*b;
		System.out.println(f); // 100000000000 -- no overflow
		long g = (long)(a)*(long)(b);
		System.out.println(g); // 100000000000 -- no overflow
		

	}
}
