package strings021222;
// https://www.scaler.com/academy/mentee-dashboard/class/40905/homework/problems/189/hints?navref=cl_pb_nv_tb
public class AddBinaryStrings { // check again
	public String addBinary1(String A, String B) {// doesn't work for large String
		long a = Long.parseLong(A);
		long b = Long.parseLong(B);
		long c = a+b;
		return String.valueOf(c);
    }
	public String addBinary(String A, String B) {// doesn't work for large String
		String min; String max;
		max = (A.length()>B.length())?A:B;
		min = (A.length()<=B.length())?A:B; // not catering for both length same, so considered it here
		int Max = max.length()-1;
		int Min = min.length()-1;
		StringBuilder sb= new StringBuilder();
		int car=0; int sum=0;
		for(int i=1; i<=max.length(); i++) {
			sum = (max.charAt(Max)-48)+car; // to convert char to int
			if(Min>=0) sum+= min.charAt(Min)-48;
			sb.insert(0, (sum&1)==1?'1':'0');
			car = sum>>1;
			Max--; Min--;
		}
		if(car>0) sb.insert(0, '1');
		return sb.toString();
    }
	public String addBinaryScalerSol(String A, String B) {
	    int nA, nB;
	    char res[];
	    int i, j, k;
	    nA = A.length();
	    nB = B.length();
	    res = new char[Math.max(nA, nB) + 1];
	    k = Math.max(nA, nB);
	    i = nA - 1;
	    j = nB - 1;
	    int sum = 0, carry = 0;
	    // we add bits from the rightmost bit to the leftmost bit
	    while (i >= 0 || j >= 0 || carry != 0) {
	        sum = carry;
	        if (i >= 0)
	            sum += (A.charAt(i) - '0');
	        if (j >= 0)
	            sum += (B.charAt(j) - '0');
	        res[k] = (char) ((sum % 2) + '0');
	        carry = sum / 2;
	        i--;
	        j--;
	        k--;
	    }
	    if (res[0] == '1')
	        return new String(res);
	    int len = Math.max(nA, nB);
	    return new String(res, 1, len);
	}
	 public String addBinary2(String A, String B) 
	 {
	        String min;
	        String max;
	        if(A.length()<B.length())
	        {
	            max = B;
	            min = A;
	        }
	        else
	        {
	            max = A;
	            min = B;
	        }
	        
	        StringBuilder ans = new StringBuilder();

	        int carry = 0;
	        int sum = 0;

	        int pMax = max.length()-1;
	        int pMin = min.length()-1;
	        for(int i=1; i<=max.length(); i++) {
	        	sum=(max.charAt(pMax)-48)+carry;
	        	if(pMin>=0) sum += (min.charAt(pMin)-48);
	        	ans.insert(0, (sum&1)==1?'1':'0');
	        	carry=sum>>1;
	        	pMax--;
	        	pMin--;
	        }
	        if(carry > 0)
	            ans.insert(0, '1');
	        return ans.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBinaryStrings abs = new AddBinaryStrings();
		String A = "100"; String B = "11";
		String C = "110"; String D = "10";
		System.out.println(abs.addBinary(A, B));// 111
		System.out.println(abs.addBinary(C, D));//1000
		String E = "1010110111001101101000";
		String F = "1000011011000000111100110";
		System.out.println(abs.addBinary(E, F)); // 1001110001111010101001110
		System.out.println(abs.addBinary2(E, F)); 
		String G = "11101011000011100100101111";
		String H = "11011111111010101101101110";
		System.out.println(abs.addBinary(G, H)); // 110111111110101011011011100-- 111001010111110010010011101
		System.out.println(abs.addBinary2(G, H)); 
	}

}
