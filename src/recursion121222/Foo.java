package recursion121222;

public class Foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(foo(3,5)); // 243
		int ans = fun(2,10);
		System.out.println(ans);// 1024
	}

	public static int fun(int x, int n) {
		// TODO Auto-generated method stub
		if(n==0) return 1;
		else if(n%2==0) return fun(x*x, n/2);
		else return x * fun(x*x, (n-1)/2);
	}

	static int foo(int x, int y) {
		// TODO Auto-generated method stub
		if(y==0) return 1;
		return bar(x, foo(x, y-1));
	}

	static int bar(int x, int y) {
		// TODO Auto-generated method stub
		if(y==0) return 0;
		return (x+bar(x, y-1));
	}
/*
 * Recurrence relation for bar(x,y)
is
bar(x, y) = x + bar(x, y−1) = 2x + bar(x, y−2) = … = yx + bar(x, 0) = yx
That is bar(x,y)
returns the product of x and y

Now, recurrence relation for foo
is
foo(a, b) = a × foo(a, b−1) = a × a × foo(a, b−2) = … = ab × foo(a, 0) = ab × 1 = ab
The given code returns ab
 */
	/*
	 * The above function performs binary exponentation which returns xn, hence the answer is 210 = 1024.
	 */
}

