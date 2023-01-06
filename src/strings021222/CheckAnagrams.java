package strings021222;
//https://www.scaler.com/academy/mentee-dashboard/class/40905/homework/problems/27541/hints?navref=cl_pb_nv_tb
public class CheckAnagrams {
	 public int solve(String A, String B) {
		 if(A.length()!=B.length()) {
			 return 0;
		 }
		 int[] freqA = new int[26];
		 int[] freqB = new int[26];
			for(int i=0; i<26; i++) {
				freqA[i]=0;
				freqB[i]=0;
			}
			for(int i=0; i<A.length(); i++) {
				int index = A.charAt(i)-'a';
				freqA[index]++;
				int ind = B.charAt(i)-'a';
				freqB[ind]++;
			}
			//for(int i=0; i<26; i++) System.out.println(freq[i]);
			for(char c = 'a'; c<='z'; c++) {
				int index = c-'a';
				if(freqA[index] != freqB[index]) return 0;
			}
			return 1;
	 }
	 public int solveScalerSol(String A, String B) {
	        int[] freq1 = new int[26];
	        int[] freq2 = new int[26];
	        for(int i = 0 ; i < A.length() ; i++){
	            freq1[A.charAt(i) - 'a']++;
	            freq2[B.charAt(i) - 'a']++;
	        }
	        for(int i = 0 ; i < 26 ; i++){
	            if(freq1[i] != freq2[i]){
	                return 0;
	            }
	        }
	        return 1;
	    }
	public static void main(String[] args) {
		CheckAnagrams ca = new CheckAnagrams();
		String A = "cat"; String B = "bat";
		String C = "secure"; String D = "rescue";
		System.out.println(ca.solve(A, B));//0
		System.out.println(ca.solve(C, D));//1
	}

}
