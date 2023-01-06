package subsequence231222;
// https://www.scaler.com/academy/mentee-dashboard/class/48348/homework/problems/1247/hints?navref=cl_pb_nv_tb
public class SpecialSubSequences {
/*
 * You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 */
	public int solve(String A) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == 'A'){
                count++;
            } else if(A.charAt(i) == 'G'){
                ans += count;
            }
            ans %= 1000000007;
        }
        return ans % 1000000007 ;
    }
	 public int solveScalerSol(String A) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialSubSequences ss = new SpecialSubSequences();
		System.out.println(ss.solve("ABCGAG")); // 3
		System.out.println(ss.solve("GAB")); // 0
	}

}
