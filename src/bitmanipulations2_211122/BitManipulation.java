package array211122;
// https://www.scaler.com/academy/mentee-dashboard/class/40904/assignment/problems/27343?navref=cl_tt_nv
public class BitManipulation {

	public static String checkSetUnset(int N, int i) {
		if(((N>>i)& 1) == 1) return "Set";
		else return "Unset";
	}
	 public int solve(int A, int B) {
	        if(((A>>B)& 1) == 1) return 1;
			else return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkSetUnset(10, 2)); // Unset 1010
		System.out.println(checkSetUnset(10, 3)); // Set 1010
		
		BitManipulation bm = new BitManipulation();
		System.out.println(bm.solve(10, 2)); // 0
		System.out.println(bm.solve(10, 3)); // 1
	}

}
