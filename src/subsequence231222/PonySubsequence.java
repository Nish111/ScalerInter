package subsequence231222;

public class PonySubsequence {
/*
 * Little Ponny has been given a string A, and he wants to find out the lexicographically 
 * minimum subsequence from it of size >= 2. Can you help him?

A string a is lexicographically smaller than string b, if the first different letter in a 
and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".
 */
	public String solve2(String A) { // working
		StringBuilder sb = new StringBuilder();
		char temp = A.charAt(0);
		int index = 0;
        for(int i=1; i<A.length(); i++) {
        	if(temp>A.charAt(i)) {
        		temp = A.charAt(i);
        		index = i;
        	}
        }
        sb.append(temp);
        System.out.println(temp);
        temp = A.charAt(0);
        System.out.println(index + " index " + A.length() + " A.length() ");
        if(index == A.length()-1) {
        	temp = A.charAt(0);
            for(int j=0; j<index; j++) {
            	if(temp>A.charAt(j)) {
            		temp = A.charAt(j);
            	}
            }
            sb.append(temp);
            sb.reverse();
        } else {
        	System.out.println("Else triggered");
        	temp = A.charAt(index+1);
        	for(int j=index+1; j<A.length(); j++) {
            	if(temp>A.charAt(j)) {
            		temp = A.charAt(j);
            	}
            }
        	sb.append(temp);
        }
        System.out.println(temp);
        return sb.toString();
    }
	public String solveScalerSol(String A) {
        char minchar = 'z';
        int idx = 1000000000;
        for(int i = 0; i < A.length() - 1; i++){
            if(A.charAt(i) < minchar){
                minchar = A.charAt(i);
                idx = i;
            }
        }
        char minchar2 = 'z';
        for(int i = idx + 1; i < A.length(); i++)
            if(A.charAt(i) < minchar2)
                minchar2 = A.charAt(i);
        String ans = String.valueOf(minchar) + String.valueOf(minchar2);
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PonySubsequence ps = new PonySubsequence();
		String A = "abcdsfhjagj";
		String B = "ksdjgha";
		String C = "dvdgajrqal";
		String D = "epujxwjiad";
		String E = "djjhibvetj";
		//System.out.println(ps.solve(A)); // aa
		//System.out.println(ps.solve(B)); // da
		//System.out.println(ps.solve(C)); // aa
		//System.out.println(ps.solve(D)); // ea
		//System.out.println(ps.solve2(A)); // aa
		//System.out.println(ps.solve2(B)); // da
		//System.out.println(ps.solve2(C)); // aa
		System.out.println(ps.solve2(D)); // ad
		System.out.println(ps.solve2(E)); // be
	}

}
