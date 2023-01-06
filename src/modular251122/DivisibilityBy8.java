package modular251122;
// https://www.scaler.com/academy/mentee-dashboard/class/40891/homework/problems/4222/hints?navref=cl_pb_nv_tb
public class DivisibilityBy8 {
	public int solve(String A) { // works only for small values
		int val = Integer.valueOf(A);
		if(val%8==0) return 1;
		else return 0;
    }
	public int solve2(String A) {
		int sum=0;
		if(A.length()==1) sum=A.charAt(0);
		else if(A.length()==2) sum=A.charAt(1) + 10*A.charAt(0);
		else sum=A.charAt(A.length()-1) + 10*A.charAt(A.length()-2) + 100*A.charAt(A.length()-3);
		
		if(sum%8==0) return 1;
		else return 0;
    }
	 public int solveScalerSol(String A) {
	        int n = A.length();
	        if (n == 1){
	            if((A.charAt(0) - '0') % 8 == 0){
	                return 1;
	            }
	            return 0;
	        }
	        if (n == 2) {
	            int x = (A.charAt(0) - '0') * 10 + A.charAt(1) - '0';
	            if(x % 8 == 0){
	                return 1;
	            }
	            return 0;
	        }
	        int a3 = (A.charAt(n-3) - '0') * 100 + (A.charAt(n-2) - '0') * 10 + (A.charAt(n-1) - '0');
	        if(a3 % 8 == 0){
	            return 1;
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibilityBy8 db = new DivisibilityBy8();
		System.out.println(db.solve2("16"));
		System.out.println(db.solve2("123"));
		System.out.println(db.solve2("165757"));
		System.out.println(db.solve2("165000"));
		System.out.println(db.solve2("40897237111816995922805307737859413552091006514927603847883130124746756767426237849396480087733429432861339411285568084588535007444731"));

	}

}
