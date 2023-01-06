package contest191122;

public class ConstructBinaryNumber {
	public static int solve(int A, int B) {
        //System.out.println(1<<(A));
        return (((1<<(A))-1)<<B);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(3, 2));// 28
		System.out.println(solve(2, 3)); // 24
		System.out.println(solve(5, 1)); // 62
	}

}
