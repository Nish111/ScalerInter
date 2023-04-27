package array231122;

public class CheckPowerOf2 {

	public int powerOfTwo(int N) {
		if((N&(N-1))==0) return 1;
		else return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPowerOf2 cp = new CheckPowerOf2();
		System.out.println(cp.powerOfTwo(7)); // 0
		System.out.println(cp.powerOfTwo(32)); // 1
		System.out.println(cp.powerOfTwo(10)); // 0
	}

}
