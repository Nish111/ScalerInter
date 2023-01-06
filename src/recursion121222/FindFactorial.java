package recursion121222;
// https://www.scaler.com/academy/mentee-dashboard/class/40906/assignment/problems/10753/submissions
public class FindFactorial {
	// Write a program to find the factorial of the given number A.
	public int solve(int A) {
		if(A==1) return 1;
		return A * solve(A-1);
	}
	public int solveScalerSol(int A) {
        return factorialScalerSol(A);
    }
    public static int factorialScalerSol(int n) 
    { 
        if (n == 0) 
            return 1; 
  
        return n * factorialScalerSol(n - 1); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFactorial ff = new FindFactorial();
		System.out.println(ff.solve(4));
		System.out.println(ff.solve(2));
		
	}

}
