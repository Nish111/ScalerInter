package array211122;
// https://www.scaler.com/academy/mentee-dashboard/class/40904/homework/problems/191/?navref=cl_pb_nv_tb
public class ReverseBits {
	public long reverse(long A) {
		long number=0; 
		long power=31;
		while(power>=0) {
			int temp = (int) (A&1);
			number +=(long)(temp * Math.pow(2, power));
			power--;
			A>>=1;
		}
		return number;
	}
	public long reverseAgain(long A) {
		long number=0; 
		for(int i=0; i<31; i++) { 
			number+=(A&1); 
			number *=2;
			//System.out.println(number + " iii " + (A&1)); 
			A>>=1; 
		}
		
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseBits rb = new ReverseBits();
		System.out.println(rb.reverse(0)); // 0
		System.out.println(rb.reverse(3)); // 3221225472
		System.out.println(rb.reverseAgain(3)); // 3221225472
		//System.out.println(rb.reverse((long)4294967295)); // 4294967295
		//System.out.println(rb.reverseAgain(4294967295)); // 4294967294 -- not working
		
	}

}
