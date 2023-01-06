package array051122;

import java.util.TreeSet;

public class AmazingSubarrays {
	 public int solveScalerSol(String A) {
	        TreeSet<Character> se = new TreeSet<>();
	        se.add('a'); se.add('e'); se.add('i'); se.add('o'); se.add('u');
	        se.add('A'); se.add('E'); se.add('I'); se.add('O'); se.add('U');
	        
	        int n = A.length();
	        long ans = 0;
	        for(int i = 0; i < n; i++){
	            if(se.contains(A.charAt(i))){
	                ans += (n - i);
	            }
	        }
	        return (int)(ans%10003);
	    }
	public int solve(String A) {
		A = A.toLowerCase();
		int total=0;
		for(int i=0; i<A.length(); i++) {
			if((A.charAt(i)== 'a')|| (A.charAt(i)== 'e')||(A.charAt(i)== 'i')||
					(A.charAt(i)== 'o')||(A.charAt(i)== 'u')){
				total += A.length()-i;
				total = total%10003;
			}
		}
		return total;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazingSubarrays as = new AmazingSubarrays();
		System.out.println(as.solve("ABEC"));// 6
		System.out.println(as.solve("ABEC"));
	}

}
