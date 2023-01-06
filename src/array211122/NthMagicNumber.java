package array211122;
// https://www.scaler.com/academy/mentee-dashboard/class/40904/homework/problems/4105/?navref=cl_pb_nv_tb
public class NthMagicNumber {
	public int solve(int A) {
		int number = 0;
		int count=1;
		while(A>0) {
			number+=(A&1) * Math.pow(5, count);
			count++;
			A>>=1;
		}
		return number;
    }
	// use 5 as base and simply find 001 -> 5, 010 -> 25, 011 -> 25+5 30
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthMagicNumber nmn  = new NthMagicNumber();
		System.out.println(nmn.solve(3)); // 30
		System.out.println(nmn.solve(10)); // 650
		System.out.println(nmn.solve(7)); // 155
		// 5, 25, 30, 125, 130, 150, 155, 625, 630, 650, 750
	}

}
