package array211122;
// https://www.scaler.com/academy/mentee-dashboard/class/40904/assignment/problems/26930/submissions
public class UnsetIthBit {
	public int solveScalerSol(int A, int B) {
        int num = 1 << B;
        if((A & num) > 0){
            A -= num;
        }
        return A;
    }
	public int solve(int A, int B) {
		int N = A &(1<<B);
        return (A ^ N);
    }
	public static void main(String[] args) {
		UnsetIthBit uib = new UnsetIthBit();
		System.out.println(uib.solve(4, 1)); // 4
		System.out.println(uib.solve(5, 2)); // 1
		System.out.println(uib.solve(28, 1)); // 28
	}
}
