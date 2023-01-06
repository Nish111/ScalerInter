package recursion121222;
// https://www.scaler.com/academy/mentee-dashboard/class/40906/assignment/problems/31725/hints?navref=cl_pb_nv_tb
public class PrintNNaturalNumbers {
/*
 * You are given an integer A, print 1 to A using using recursion.
 */
	public void printNaturalNumbers(int n) {
		if(n==1) {
			System.out.print(1+" ");
			return;
		}
		else {
			printNaturalNumbers(n-1);
			System.out.print(n+ " ");
		}
	}
	public void printNaturalNumbersHis(int n) { // Yash structure, base logic and all
		if(n==1) {
			System.out.println(1);
			return;
		}
		printNaturalNumbersHis(n-1);
		System.out.println(n);
		return;
	}
	public void printNaturalNumbersReverseHis(int n) { // Yash structure, base logic and all
		if(n==1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printNaturalNumbersReverseHis(n-1);
		return;
	}
	public void solve(int A) {
		printNaturalNumbers(A);
        System.out.println();
    }
	public void print1toAScalerSol(int A){
        if(A == 0){
            return;
        }
        print1toAScalerSol(A - 1);
        System.out.print(A + " ");
    }
    public void solveScalerSol(int A) {
    	print1toAScalerSol(A);
        System.out.print("\n");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNNaturalNumbers pnn = new PrintNNaturalNumbers();
		pnn.printNaturalNumbers(4);
		System.out.println();
		pnn.printNaturalNumbersHis(4);
		pnn.printNaturalNumbersReverseHis(4);
		System.out.println("-----");
		pnn.solve(10);
		pnn.solve(5);

	}

}
