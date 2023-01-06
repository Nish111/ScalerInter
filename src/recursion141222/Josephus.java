package recursion141222;
// https://www.scaler.com/academy/mentee-dashboard/class/40887/homework/problems/26803/hints?navref=cl_pb_nv_tb
public class Josephus {
/*
 * Given the total number of person A and a number B which indicates that B-1 
 * persons are skipped and the Bth person is killed in a circle. Find the last 
 * person standing in the circle.
 */
	public int solve(int A, int B) {
        return personK(A, B) +1;
    }
    public static int personK(int n, int k) {
		if(n==1) {
			return 0;
		}
		return (personK(n-1, k) + k)%n;
	}
	public int josephusScalerSol(int n, int k){
        if(n == 1){
            return 1;
        }
        return (josephusScalerSol(n - 1, k) + k - 1) % n + 1;
    }
    public int solveScalerSol(int A, int B) {
        return josephusScalerSol(A,B);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
