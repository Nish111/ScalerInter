package array181122;

public class XORSum {
	public int solve(int A, int B) {
		// expected A^X + B^X for any X so that min sum is achieved
		for(int i=0; i<=B; i++) {
			System.out.print(A^i + B^i);
			System.out.println(" i is " + i);
		}
		
		//System.out.println(A^1 + B^2);
        return A^B;
    }
	public static void main(String[] args) {
		XORSum xs = new XORSum();
		System.out.println(xs.solve(6, 12));// 10
		System.out.println(xs.solve(4, 9));// 13 for X as 3 val is 11
	}
}
