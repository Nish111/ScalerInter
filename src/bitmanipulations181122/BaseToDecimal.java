package bitmanipulations181122;

public class BaseToDecimal {
	 public int solve(int A, int B) {
		 int num=0;
		 int val=1;
		 while(A>0) {
			 int temp = A%10;
			 num += temp * val;
			 //System.out.println(temp + " " + A +  " " + B + " " + num);
			 A=A/10;
			 val *= B;
		 }
		 return num;
	 }
	 public static void main(String[] args) {
		 BaseToDecimal btd = new BaseToDecimal();
		 int A = 1010;
		 int B = 2;
		 int C = 22;
		 int D = 3;
		 System.out.println(btd.solve(A, B));// 10
		 System.out.println(btd.solve(C, D)); // 8
	}
}
