package problemsolving191022;

public class DivideBy2 {

	public static int divBy2(int N) {
		int count=0;
		while(N/2 !=1) {
			count++;
			N=N/2;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divBy2(5));
		System.out.println(Math.ceil(Math.log(5)));
		System.out.println(Math.floor(Math.log(5)));
		System.out.println(divBy2(7));
		System.out.println(Math.ceil(Math.log(7)));
		System.out.println(Math.floor(Math.log(7)));
		System.out.println(divBy2(8));
		System.out.println(Math.ceil(Math.log(8)));
		System.out.println(Math.floor(Math.log(8)));
	}
/*
 * Let N be the number (N>1) that you want to divide. Say that you have to divide 
 * it k times. Then
1 <= N / 2^k < 2
Therefore, 
0 = log1 <= -k + logN < log2 = 1
k <= logN < k + 1
k = floor(logN)
 */
}
