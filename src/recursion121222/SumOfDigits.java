package recursion121222;
// https://www.scaler.com/academy/mentee-dashboard/class/40906/homework/problems/10754/submissions
public class SumOfDigits {
// Given a number A, we need to find the sum of its digits using recursion.
	public int solve(int A) {
		if(A/10==0) return A;
		return A%10+solve(A/10);
    }
	public int solveScalerSol(int A) {
        return sum_of_digitScalerSol(A);
    }
    static int sum_of_digitScalerSol(int n) {  
        if (n == 0) 
            return 0; 
        return (n % 10 + sum_of_digitScalerSol(n / 10)); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits sod = new SumOfDigits();
		System.out.println(sod.solve(46));
		System.out.println(sod.solve(11));
		System.out.println(sod.solve(4));
	}

}
