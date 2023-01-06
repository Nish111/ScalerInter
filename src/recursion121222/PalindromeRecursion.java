package recursion121222;

public class PalindromeRecursion {

	public int solve(String A) {
		if(A.length()==0 || A.length()==1) return 1;
		if(isPalindrome(A, 0, A.length()-1)) return 1;
		else return 0;
    }
	public boolean isPalindrome(String A, int i, int j) {
		if(j==0) return true;
		if(A.charAt(i)!=A.charAt(j)) {
			return false;
		}
		else
			return isPalindrome(A, i+1, j-1);
	}
	public int solveScalerSol(int i, int j, String A){
        if(i >= j){
            return 1;
        }
        if(A.charAt(i) != A.charAt(j)){
            return 0;
        }
        return solveScalerSol(i+1, j-1, A);
    }
    public int solveScalerSol(String A) {
        return solveScalerSol(0, A.length()-1, A);
    }
	public boolean isPalindrome2(String A, int len) {
		if(len==0 || len==1) return true;
		else {
			if(A.charAt(0)==A.charAt(len-1)) {
				String s = A.substring(1, len-1);
				return isPalindrome2(s, s.length());
			}
			else return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeRecursion pr = new PalindromeRecursion();
		System.out.println(pr.isPalindrome("112211", 0, 5)); // true
		System.out.println(pr.isPalindrome("noon", 0, 3)); // true
		System.out.println(pr.isPalindrome("strings", 0, 6)); // false
		System.out.println(pr.isPalindrome("", 0, 0)); // true
		System.out.println(pr.isPalindrome("g", 0, 0)); // true
		
		System.out.println(pr.isPalindrome2("112211", 6)); // true
		System.out.println(pr.isPalindrome2("noon", 4)); // true
		System.out.println(pr.isPalindrome2("none", 4)); // false
		System.out.println(pr.isPalindrome2("", 0)); // true
		System.out.println(pr.isPalindrome2("g", 1)); // true
		
		System.out.println(pr.solve("112211")); // 1
		System.out.println(pr.solve("noon")); // 1
		System.out.println(pr.solve("none")); // 0
		System.out.println(pr.solve("")); // 1
		System.out.println(pr.solve("g")); // 1
		System.out.println(pr.solve("strings")); // 0
	}

}
