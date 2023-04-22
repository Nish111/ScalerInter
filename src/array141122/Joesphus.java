package array141122;

// https://www.scaler.com/academy/mentee-dashboard/class/40903/assignment/problems/26771/hints?navref=cl_pb_nv_tb
public class Joesphus {
	public int msbPosScalerSol(int n){
        int pos = 0;
        while (n != 0) {
            pos++;
            n = n / 2;
        }
        return pos;
    }
	/*
	 * We know 2's power then the person we start will be only 1, 
	 * so to reach such condition, from 100 we need to kill 36 people, then 64 will remain and the one having sword will win
So to kill 36 the sword will reach 2*36 +1 = 73 and so 73 will be alive
	 */
	public int solveScalerSol(int A) {
        int position = msbPosScalerSol(A);
        int j = (int)Math.pow(2, (position - 1));
        A = A - j;
        A = A * 2;
        A = A + 1;
        return A;
    }
	public int solve(int A) {
        return personK(A, 2) +1;
    }
    public static int personK(int n, int k) {
		if(n==1) {
			return 0;
		}
		return (personK(n-1, k) + k)%n;
	}
    public int solveClass(int A) {
        return personK(A, 2) +1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joesphus j = new Joesphus();
		System.out.println(j.solveScalerSol(4));//1 
		System.out.println(j.solveScalerSol(5));//3
		System.out.println(j.solve(100));//73
		System.out.println(j.solveScalerSol(100));//73
		System.out.println(j.solveClass(100)); // 73
	}

}
