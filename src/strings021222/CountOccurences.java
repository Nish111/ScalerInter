package strings021222;
//https://www.scaler.com/academy/mentee-dashboard/class/40905/homework/problems/10748/hints?navref=cl_pb_nv_tb
public class CountOccurences {
	public int solve(String A) {
		int count=0;
		for(int i=0; i<A.length()-2; i++) {
			if(A.substring(i, i+3).equals("bob")) count++;
			//System.out.println(A.substring(i, i+3));
		}
		return count;
	}
	 public int solveScalerSol(String A) {
	        int ans = 0;
	        for(int i = 0; i+2 < A.length(); ++i){
	            if(A.charAt(i) == 'b' && A.charAt(i+1) == 'o' && A.charAt(i+2) == 'b'){
	                ++ans;
	            }
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOccurences co = new CountOccurences();
		String A = "abobc";
		String B = "bobob";
		System.out.println(co.solve(A));
		System.out.println(co.solve(B));
	}

}
