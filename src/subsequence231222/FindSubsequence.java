package subsequence231222;
// https://www.scaler.com/academy/mentee-dashboard/class/48348/homework/problems/4831/?navref=cl_pb_nv_tb
public class FindSubsequence {
/*
 * Given two strings A and B, find if A is a subsequence of B.

Return "YES" if A is a subsequence of B, else return "NO".
 */
	public String solve(String A, String B) {
		int indexA = 0;
		int indexB = 0;
		if(B.length()<A.length()) return "NO";
		if(A.length()==B.length()){
	            if(A.equals(B)) return "YES";
	            else return "NO";
	    }
		while(indexA <A.length() && indexB < B.length()) {
			if(A.charAt(indexA) == B.charAt(indexB)) {
				indexA++;
				indexB++;
			} else {
				indexB++;
			}
		}
		if(indexA==A.length()) return "YES";
		else return "NO";
		/* my logic
		 * StringBuilder sb = new StringBuilder(); sb.append(A); while(sb.length() !=0 &
		 * indexB<B.length()) { char temp = A.charAt(indexA); for(int i=indexB;
		 * i<B.length(); i++) { if(temp == B.charAt(i)) { indexB = i+1; indexA++;
		 * //System.out.println(A.charAt(indexA) + " " + B.charAt(indexB));
		 * System.out.println(temp + " temp " + B.charAt(i) + " Bchar "); break; } }
		 * if((indexB==0) || temp != B.charAt(indexB-1)) return "NO";
		 * if(indexA>A.length()-1) return "YES"; sb.replace(indexA, A.length()-1, A); }
		 * if(sb.length()>0) return "NO"; else return "YES";
		 */
	}
	public String solveScalerSol(String A, String B) {
        int m = A.length();
        int n = B.length();
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(A.charAt(i) == B.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        if(i == m)
        {
            return "YES";
        }
        return "NO";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSubsequence fs = new FindSubsequence();
		String A = "bit";
		String B = "dfbkjijgbbiihbmmt";
		System.out.println(fs.solve(A, B)); // YES
		String C = "apple";
		String D = "appel";
		System.out.println(fs.solve(C, D)); // NO
		String E = "mcbzcsqvouyrsq";
		String F = "wnqryjentzuptshyjvufcbhkcorfchzvhotqwctvgjjhmfcrsminuvabryqplqarmbsxewaumd";
		System.out.println(fs.solve(E, F)); // NO
		String G ="refzmkjvjzvaxryppiaximwqhtmgk";
		String H = "w";
		System.out.println(fs.solve(G, H)); // NO
		String I ="aklgohgcoaslj";
		String J ="qjxymvrirrdcpqlotgmepuntqnxggcucnqikizffsehrromtunwpnbzxgollu";
		System.out.println(fs.solve(I, J)); // NO
	}

}
