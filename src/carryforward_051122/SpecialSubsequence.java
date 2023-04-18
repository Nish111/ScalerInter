package array051122;
// https://www.scaler.com/academy/mentee-dashboard/class/40896/assignment/problems/1247?navref=cl_tt_nv
public class SpecialSubsequence {
/*
 * You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 */
	public int solveScalerSol(String A) {// terrible solution
        int n = A.length(), ans = 0, MOD = 1000*1000*1000 + 7;
        int cnt_G[] = new int[n], count = 0;
        
        //Suffix count of G
        for(int i = n - 1 ; i >= 0 ; i--){
            if(A.charAt(i) == 'G')
                count = count + 1;
            cnt_G[i] = count;
        }
        
        // traverse the string again from beginning
        for(int i = 0; i < n; i++){
            // if current character is "A" then add number of G's after that 
            if(A.charAt(i) == 'A') {
                ans = ans + cnt_G[i];
                ans = ans % MOD;
            }
        }
        return ans;
    }
	public int solve(String A) {
		int N = A.length();
		int count = 0;
		int count_g = 0;
		for(int i=N-1;i>=0;i--) {
			if(A.charAt(i)=='g' || A.charAt(i)=='G') {
				count_g ++;
			} else if(A.charAt(i) == 'a' || A.charAt(i) == 'A') {
				count = (int) ((count + count_g)%(Math.pow(10, 9)+7));
			}
		}
		return (int) (count%(Math.pow(10, 9)+7));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialSubsequence ss = new SpecialSubsequence();
		String A = "baagdcag";
		System.out.println(ss.solve(A)); // 5
		String B = "ABCGAG";
		System.out.println(ss.solve(B)); // 3
		String C = "GAB";
		System.out.println(ss.solve(C)); // 0
	}

}
