package strings021222;

public class StringOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		System.out.println(s);
		s.replace('a', 'e');// = 'e';
		System.out.println(s);
		System.out.println(s.replace('a', 'e'));
		//s[0]="f"; // works for array but s is string
		//s.charAt(0);// returns char value
		// java does not have anything to change the value or set in String
		
		StringBuilder sb = new StringBuilder();
		sb.append("abcde");
		System.out.println(sb);
		sb.setCharAt(0, 'e');
		System.out.println(sb);
	}

}
