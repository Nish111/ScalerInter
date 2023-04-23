package array181122;

public class DecimalToBase {
	public int DecimalToAnyBase(int A, int B) {
		 int num=0;
		 int val=1;
		 while(A>0) {
			 int temp = A%B;
			 num += temp * val;
			 //System.out.println(temp + " " + A +  " " + B + " " + num);
			 A=A/B;
			 val *= 10;
		 }
		 return num;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalToBase dtb = new DecimalToBase();
		int A = 4;
		int B = 3;
		System.out.println(dtb.DecimalToAnyBase(A, B)); // 11
	}

}
