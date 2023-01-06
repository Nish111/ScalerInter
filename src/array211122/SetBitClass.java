package array211122;
import array211122.BitManipulation;;
public class SetBitClass {
	public static int setBitClass(int N, int i) {
		return (N |(1<<i));
	}
	// check once for using XOR
	public static int setBitClassXOR(int N, int i) {
		BitManipulation bm = new BitManipulation();
		if(bm.solve(N, i) != 0) {
			return (N^(1<<i));
		}
		return i;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setBitClass(4, 3)); // 12
		System.out.println(setBitClass(4, 2)); // 4
	}

}
