package problemsolving191022;
// https://www.scaler.com/academy/mentee-dashboard/class/40900/assignment/problems/11227?navref=cl_tt_nv
public class SquareRoot {
/*
 * Given a number A. Return square root of the number if it is perfect square otherwise return -1.
 */
	public int solve(int A) {
        for(int i=1; i<=Math.sqrt(A); i++){
            if(A/i == i){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareRoot sr = new SquareRoot();
		System.out.println(sr.solve(4)); // 2
		System.out.println(sr.solve(1001)); // -1
		
	}

}
