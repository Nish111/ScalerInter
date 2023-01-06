package strings021222;

public class SortChar {

	public void sortLower(char[] ch) {
		int[] freq = new int[26];
		for(int i=0; i<26; i++) freq[i]=0;
		for(int i=0; i<ch.length; i++) {
			int index = ch[i]-'a';
			freq[index]++;
		}
		//for(int i=0; i<26; i++) System.out.println(freq[i]);
		for(char c = 'a'; c<='z'; c++) {
			int index = c-'a';
			int count = freq[index];
			for(int i=0;i<count; i++) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortChar sc = new SortChar();
		char[] ch = {'d','a','b','a','c','d','b'};
		sc.sortLower(ch);
		char[] ch1 = {'d','a','b','a','c','d','b', 'e', 's', 's'};
		sc.sortLower(ch1);
	}

}
