package strings021222;

import java.util.ArrayList;
//https://www.scaler.com/academy/mentee-dashboard/class/40905/assignment/problems/11468/hints?navref=cl_pb_nv_tb
public class ToggleCase {

	public String solveScalerSol(String A) {
	    int N = A.length();
	    StringBuffer res = new StringBuffer(A);
	    for (int i = 0; i < N; i++) {
	      Character c = A.charAt(i);
	      if (Character.isLowerCase(c))
	        res.setCharAt(i, Character.toUpperCase(c));
	      else
	        res.setCharAt(i, Character.toLowerCase(c));
	    }
	    return "" + res;

	  }
	 public String solve(String A) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<A.length(); i++) {
			if(A.charAt(i) >= 'a' && A.charAt(i) <='z') {
				char temp = (char) (A.charAt(i) -32);
				sb.append(temp);
			}
			//System.out.println(sb);
			if(A.charAt(i) >= 'A' && A.charAt(i) <='Z') sb.append( (char) (A.charAt(i) +32));
			//System.out.println(sb);
		}
		return sb.toString();
    }
	 public String solveClass(String A) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<A.length(); i++) {
				char temp = (char) (A.charAt(i)^(1<<5));
				sb.append(temp);
			}
			return sb.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToggleCase tc = new ToggleCase();
		String A = "Hello";
		String B = "tHiSiSaStRiNg";
		System.out.println(tc.solve(A)); //  hELLO 
		System.out.println(tc.solve(B)); // ThIsIsAsTrInG 
		System.out.println(tc.solveClass(A)); //  hELLO 
		System.out.println(tc.solveClass(B)); // ThIsIsAsTrInG 


	}
	

}
