package strings021222;
//https://www.scaler.com/academy/mentee-dashboard/class/40905/assignment/problems/190/?navref=cl_pb_nv_tb
public class ReverseTheString {
	public String solveScalerSol(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder buf = new StringBuilder();
        
        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(c!=' ') buf.append(c);
            else createScalerSol(res, buf);
        }
        
        createScalerSol(res, buf);
        return res.toString();
    }
    
    private void createScalerSol(StringBuilder res, StringBuilder buf)
    {
        int i = buf.length()-1;
        
        while(i>=0){
            if(i==buf.length()-1 && res.length()>0) res.append(' ');
            res.append(buf.charAt(i));
            i--;
        }
        buf.setLength(0);
    }
	public String solve(String A) {
		StringBuilder ans = new StringBuilder();
        int len = A.length();
        for(int i=len-1;i>=0;i--){
            if(A.charAt(i)==' '){
                String sol = A.substring(i+1,len);
                ans.append(sol);
                if(A.charAt(len-1) != ' ')
                    ans.append(' ');
                len = i;
            }
        }
        if(len >0){
            ans.append(A.substring(0,len));
        }
        return ans.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseTheString rts = new ReverseTheString();
		String A = "the sky is blue";
		System.out.println(rts.solve(A));
	}

}
