package modular251122;
// https://www.scaler.com/academy/mentee-dashboard/class/40891/assignment/problems/31820/submissions
public class DivisibilityBy3 {
	public int divBy3(int[] A) { // O(N)
		long ans=0; long exp=1;
		for(int i=A.length-1; i>=0; i--) {
			long temp = A[i]%3;
			temp = temp * exp;
			temp = temp%3;
			ans = (ans+temp)%3;
			exp = (exp*10)%3;
		}
		if(ans==0) return 1;
		else return 0;
	}
	public int solveScalerSol(int[] A) {
        int sum = 0;
        for(int i = 0 ; i < A.length ; i++){
            sum += A[i];
        }
        if(sum % 3 == 0){
            return 1;
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibilityBy3 db = new DivisibilityBy3();
		int[] A = {4,5,6};
		int[] B = {3,5,6,1,6};
		System.out.println(db.divBy3(A));
		System.out.println(db.divBy3(B));

	}

}
