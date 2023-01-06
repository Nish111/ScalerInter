package strings021222;

public class Palindrome {

	public boolean palindrome(String palin) {
		int i=0; int j=palin.length()-1;
		while(i<j) {
			if(palin.charAt(i) != palin.charAt(j)) return false;
			i++; j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		String s = "malayalam";
		String s1 = "aabbaa";
		String s2 = "makmk";
		System.out.println(p.palindrome(s)); // true
		System.out.println(p.palindrome(s1)); // true
		System.out.println(p.palindrome(s2)); // false
		
	}
}
