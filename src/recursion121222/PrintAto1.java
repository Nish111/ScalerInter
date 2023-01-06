package recursion121222;

public class PrintAto1 {

	    public void solve(int A) {
	        printNaturalNumbersReverse(A);
	        System.out.println();
	    }
	    public void printNaturalNumbersReverse(int n) {
			if(n==1) {
				System.out.print(1+" ");
				return;
			}
			else {
	            System.out.print(n+ " ");
				printNaturalNumbersReverse(n-1);
				
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintAto1 pa = new  PrintAto1();
		pa.solve(8);
		pa.solve(4);
	}

}
