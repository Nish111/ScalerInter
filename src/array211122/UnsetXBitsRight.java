package array211122;
// https://www.scaler.com/academy/mentee-dashboard/class/40904/homework/problems/17892/submissions
public class UnsetXBitsRight {
	 public long solve(long A, int B) {
		 A=A>>B;
		 return (A<<B);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnsetXBitsRight uxbr = new UnsetXBitsRight();
		System.out.println(uxbr.solve(53, 5));//32
		// 000110101
		System.out.println(uxbr.solve(5, 1));// 4
		// 00000101
		System.out.println(uxbr.solve(25, 3)); // 24
		System.out.println(uxbr.solve(37, 3)); // 32
		System.out.println(uxbr.solve(93, 4)); // 80

	}

}
