package strings021222;
//https://www.scaler.com/academy/mentee-dashboard/class/40905/assignment/problems/185/submissions
public class LongestPalindromeSubstring {
	 public String expandAroundCenterScalerSol(String s, int c1, int c2) {
	        int l = c1, r = c2;
	        int n = s.length();
	        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
	            l--;
	            r++;
	        }
	        return s.substring(l + 1, r);
	    }
	    public String longestPalindromeScalerSol(String A) {
	        int n = A.length();
	        if (n == 0)
	            return "";
	        String longest = A.substring(0, 1); // a single char itself is a palindrome
	        for (int i = 0; i < n - 1; i++) {
	            String p1 = expandAroundCenterScalerSol(A, i, i);
	            if (p1.length() > longest.length())
	                longest = p1;
	            String p2 = expandAroundCenterScalerSol(A, i, i + 1);
	            if (p2.length() > longest.length())
	                longest = p2;
	        }
	        return longest;
	    }
	 public String longestPalindrome(String A) {
		 int max_len = 0;
		 StringBuilder sb = new StringBuilder();
			// odd length
			for(int i=0; i<A.length(); i++) {
				String temp = expand(A, i, i);
				//System.out.println(temp);
				int len = temp.length();
				if(len>max_len) {
					sb= sb.delete(0, len);
					sb= sb.append(temp);
				}
				max_len = Math.max(max_len, len);
				/*
				 * if(max_len == len) { sb= sb.delete(0, len); sb= sb.append(temp); }
				 */
				
			}
			// even length
			for(int i=0; i<A.length()-1; i++) { 
				String temp = expand(A, i, i+1); 
				int len = temp.length();
				if(len>max_len) {
					sb= sb.delete(0, len);
					sb= sb.append(temp);
				}
				max_len = Math.max(max_len, len); 
				/*
				 * if(max_len == len) { sb= sb.delete(0, len); sb=sb.append(temp); }
				 */
			}
			return sb.toString();
	 }
	 public String expand(String s, int p1, int p2) {
			int n = s.length();
			while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)) {
				p1--;
				p2++;
			}
			StringBuilder sb = new StringBuilder();
			sb.append(s, p1+1, p2);
			//System.out.println(sb.toString());
			return sb.toString();
		}
	 public static void main(String[] args) {
		LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
		String s = "abacab";
		String s1 = "abcde";//a
		String s2 = "aaaabaaa";
		String s3 = "abaaba";
		System.out.println(lps.longestPalindrome(s)); // bacab
		System.out.println(lps.longestPalindrome(s1)); // e
		System.out.println(lps.longestPalindrome(s2)); // aaabaaa
		System.out.println(lps.longestPalindrome(s3)); // abaaba
		String s4 = "abbcccbbbcaaccbababcbcabca"; // bbcccbb
		System.out.println(lps.longestPalindrome(s4)); 
	}
}
