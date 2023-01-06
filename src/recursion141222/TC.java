package recursion141222;

public class TC {
/*
 * The floor function will always result an odd number if the number is 2 
k−1
  .
Hence the time complexity will be o(logn)
 */
	public int function(int n) {
		if(n%2==0) return 0;
		return function(n-1)+ function((int) Math.floor(n/2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC tc = new TC();
		System.out.println(tc.function(3));
		System.out.println(tc.function(13));
		System.out.println(tc.function(15));
		System.out.println(tc.function(7));
	}

}
