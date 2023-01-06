package strings021222;
// https://www.scaler.com/academy/mentee-dashboard/class/40905/assignment/problems/10903?navref=cl_tt_nv
public class Reverse {
	public String reverse(String s, int i, int j) {
		StringBuilder sb = new StringBuilder();
		//sb=sb.append(s);
		char[] ch = s.toCharArray();
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++; j--;
		}
		//sb.reverse();
		//sb.replace(i-1, j+1, s);
		for(int k=0; k<s.length(); k++) {
			sb.append(ch[k]);
		}
		return sb.toString();
	}
	public String solve(String s) {
		StringBuilder sb = new StringBuilder();
		//sb=sb.append(s);
		char[] ch = s.toCharArray();
		int i=0; int j=s.length()-1;
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++; j--;
		}
		//sb.reverse();
		//sb.replace(i-1, j+1, s);
		for(int k=0; k<s.length(); k++) {
			sb.append(ch[k]);
		}
		return sb.toString();
	}
	public String solveScalerSol  (String A) {
        char[] s = A.toCharArray();
        int n = A.length();
        for(int i = 0; i < n/2; i++){
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
        return new String(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		String s = "abcdef";
		System.out.println(r.reverse(s, 2, 5)); // abfedc
		System.out.println(r.solve(s)); // fedcba
		String s1 =  "scaler";
		System.out.println(r.reverse(s1, 2, 5));// screla
		System.out.println(r.solve(s1)); // relacs
		String s2 =  "academy";
		System.out.println(r.reverse(s2, 2, 5)); // acmeday
		System.out.println(r.solve(s2)); // ymedaca

	}

}
