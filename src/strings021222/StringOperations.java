package strings021222;
// https://www.scaler.com/academy/mentee-dashboard/class/40905/homework/problems/9133/hints?navref=cl_pb_nv_tb
public class StringOperations {
	public String solve(String A) {
		StringBuilder sb = new StringBuilder();
		sb.append(A);
		sb.append(A);
		int len = sb.length();
		//System.out.println(sb.length());
		for(int i=0; i<len; i++) {
			if(sb.charAt(i)>='A' && sb.charAt(i) <= 'Z') {
				sb.deleteCharAt(i);
				i=i-1; len=len-1;
			}
			//System.out.println(sb);
		}
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i'||
					sb.charAt(i)=='o' || sb.charAt(i)=='u') {
				sb.replace(i, i+1, "#");
				//System.out.println("AA");
			}
		}
		return sb.toString();
	}
	 public String solveScalerSol(String A) {
	        StringBuilder res = new StringBuilder();
	        for(int i=0;i<A.length();i++)
	        {
	            if(A.charAt(i)>='a' && A.charAt(i)<='z')
	            {
	                if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
	                {
	                    res.append("#");
	                }
	                else
	                {
	                    res.append(A.charAt(i));
	                }
	            }
	        }
	        res.append(res);
	        return res.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOperations so = new StringOperations();
		String A="AbcaZeoB";
		System.out.println(so.solve(A)); // "bc###bc###"
	}

}
