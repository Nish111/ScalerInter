package recursion141222;

public class PowerFunc {

	public int powerFunction(int A, int B, int C) {
		if(A==0) return 0;
		if(B==0) return 1;
		//if(B==1) return A%C+C;
		int value=0;
		long p = powerFunction(A, B/2, C);
		if(B%2==0) value= (int) ((p * p)%C);
		else value = (int) ((p * p)%C * A%C)%C;
		
		if(value<0) return value+C;
		else return value;
	}
	public int powScalerSol(int x, int n, int d) {
	    long a = x;
	    long res = 1L;
	    while (n > 0) {
	        if (n % 2 == 1) {
	            res *= a;
	            res %= d;
	        }
	        a *= a;
	        a %= d;
	        n = n >> 1;
	    }
	    res = (res + d) % d;
	    return (int) res;
	}

    public int powScalersol2(int A, int B, int C) {
        if(A == 0)
            return 0;
        if(B == 0)
            return 1;
        long ans = powScalersol2(A, B / 2, C);
        ans = (ans * ans) % C;
        if(B % 2 == 1)
            ans = (ans * A);
        ans = (ans + C) % C;
        return (int)ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerFunc pf = new PowerFunc();
		System.out.println(pf.powerFunction(2, 3, 3));// 2
		System.out.println(pf.powerFunction(0, 0, 1));// 0
		System.out.println(pf.powerFunction(-1, 1, 20));
		System.out.println(Math.floor(15/2));
	}

}
