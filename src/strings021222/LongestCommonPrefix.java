package strings021222;

import java.util.ArrayList;
import java.util.Arrays;
// https://www.scaler.com/academy/mentee-dashboard/class/40905/homework/problems/176/hints?navref=cl_pb_nv_tb
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] A) {
        int N = A.length;
        Arrays.sort(A);
        // check for only first and last String because String Array is already sorted
        String first = A[0];
        String last = A[N-1];

        int count = 0;
        while(count < first.length()){
            if(first.charAt(count) != last.charAt(count)){
                break;
            }
            count++;
        }
        return count == 0 ? "" : first.substring(0 , count);
    }
	 public String longestCommonPrefixScalerSol(ArrayList < String > A) {
	        if (A.size() == 0)
	            return "";
	        String str;
	        String res = "";
	        int min = Integer.MAX_VALUE;
	        for (int i = 0; i < A.size(); i++) {
	            min = Math.min(min, A.get(i).length());
	        }
	        for (int i = 0; i < min; i++) {
	            char c = A.get(0).charAt(i);
	            // check if c character is same in every string or not    
	            for (int j = 1; j < A.size(); j++) {

	                if (c != A.get(j).charAt(i))
	                    return res;
	            }
	            res += c;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] A = {"abcdefgh", "aefghijk", "abcefgh"};
		String []B = {"abab", "ab", "abcd"};
		System.out.println(lcp.longestCommonPrefix(A)); // a
		System.out.println(lcp.longestCommonPrefix(B)); // ab
		
	}

}
