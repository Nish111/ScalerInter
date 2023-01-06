package strings021222;

public class LongestPalindrome {
	// brute force starts
	public int longestPalindromicSubstring(String s) { // brute force
		int max_len=0; int len=0;
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				if(isPalin(s,i,j)) {
					len = j-i+1;
					max_len=Math.max(max_len, len);
				}
			}
		}
		return max_len;
	}
	public boolean isPalin(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i++; j--;
		}
		return true;
	}
    // brute force ends
	public int longestPalin(String s) {
		int max_len = 0;
		// odd length
		for(int i=0; i<s.length(); i++) {
			int len = expand(s, i, i);
			max_len = Math.max(max_len, len);
			
		}
		// even length
		for(int i=0; i<s.length()-1; i++) {
			int len = expand(s, i, i+1);
			max_len = Math.max(max_len, len);
		}
		return max_len;
	}
	public int expand(String s, int p1, int p2) {
		int n = s.length();
		while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)) {
			p1--; p2++;
		}
		return p2-p1-1;
	}
	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		String s = "abacab"; String s1 = "abcde";
		System.out.println(lp.longestPalindromicSubstring(s)); // 5 bacab
		System.out.println(lp.longestPalindromicSubstring(s1)); // 1 a
		System.out.println(lp.longestPalin(s)); // 5 bacab
		System.out.println(lp.longestPalin(s1)); // 1 a
	}
}
