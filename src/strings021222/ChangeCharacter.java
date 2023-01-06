package strings021222;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeCharacter {
	public int solve(String A, int B) {
		int[] freq = new int[26];
		int digit=0;
		for(char c:A.toCharArray()) {
			int i = c-'a';
			freq[i]++;
			if(freq[i]==1) digit++;
		}
		if(B<0 || B==digit) return digit;
		Arrays.sort(freq);
		for(int i:freq) {
			if(B-i>=0 && i!=0) {
				digit--;
				B-=i;
			}
		}
		return digit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeCharacter cc = new ChangeCharacter();
		String A = "abcabbccd";
		System.out.println(cc.solve(A, 3));
		Scanner scan = new Scanner(System.in);
	}

}
