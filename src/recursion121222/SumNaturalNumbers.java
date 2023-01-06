package recursion121222;

public class SumNaturalNumbers {

	public int sum(int n) {
		if(n==1) return 1;
		return sum(n-1)+n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumNaturalNumbers snn = new SumNaturalNumbers();
		System.out.println(snn.sum(5));
		System.out.println(snn.sum(2000)); // 2001000
		System.out.println(snn.sum(8000)); // 32004000
		System.out.println(snn.sum(19990)); // 199810045
		System.out.println(snn.sum(24110)); // 290658105
		System.out.println(snn.sum(24213)); // 293146791 -- boundary case
		// after 24213 ie 24214 we get stack overflow
		// still sometimes gives stack error
		//System.out.println(snn.sum(24110)); // 290658105
	}

}
