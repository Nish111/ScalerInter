package hashing051222;
//https://www.scaler.com/academy/mentee-dashboard/class/40889/homework/problems/275/hints?navref=cl_pb_nv_tb
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Colorful {

	public int color(int A) {
		ArrayList<Integer> digits = new ArrayList<>();
		while(A>0) {
			int temp = A%10;
			digits.add(temp);
			A=A/10;
		}
		if(digits.size()>=9) return 0;
		HashSet<Integer> data=new HashSet<Integer>();
		for(int i=0; i<digits.size(); i++) {
			int prd = 1;
			for(int j=i; j<digits.size(); j++) {
				prd = prd* digits.get(j);
				if(data.contains(prd)) return 0;
				else data.add(prd);
			}
		}
		return 1;
	
	}
	public int colorfulScalerSol(int A) {
        HashSet < Integer > hashSet = new HashSet < > ();
        ArrayList < Integer > numbers = new ArrayList < > ();
        while (A != 0) {
            int num = A % 10;
            numbers.add(num);
            A /= 10;
        }
        Collections.reverse(numbers);
        int n = numbers.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                // prod stores the product of every digit in the range [i..j]
                for (int k = i; k <= j; k++) {
                    prod *= numbers.get(k);
                }
                // check if the product is unique
                if (hashSet.contains(prod))
                    return 0;
                hashSet.add(prod);
            }
        }
        return 1;
    }
	 public int colorful(int A) {
	        ArrayList<Integer> digits=new ArrayList<Integer>();
	        while(A>0){
	            int rem=A%10;
	            digits.add(rem);
	            A=A/10;
	        }
	        HashSet<Integer> set=new HashSet<Integer>();
	        if(digits.size()>=9)  // we for sure know that there exists repeating digits or 0 or 1 which will not make it non0-colorful
	        return 0;      
	        for(int i=0;i<digits.size();i++){
	            int prod=1;
	            for(int j=i;j<digits.size();j++){
	                prod*=digits.get(j);
	                if(set.contains(prod))
	                return 0;
	                else set.add(prod);
	            }
	        }return 1;
	    }
	 public int colorful2(int A) {
	        String S = Integer.toString(A);
	       
	        HashSet<Long> set = new HashSet<>();
	        long noOfSubAr = (S.length()*(S.length() + 1 ))/2;
	        for(int i = 0 ; i < S.length() ; i++){
	            long prd = 1;
	            for(int j = i ; j < S.length(); j++){
	            set.add(prd*(S.charAt(j) - '0'));
	            prd = prd * (S.charAt(j) - '0');
	            }
	        }
	        if(set.size() == noOfSubAr){
	            return 1;
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colorful c = new Colorful();
		System.out.println(c.color(23));// 1
		System.out.println(c.color(236));// 0
		System.out.println(c.colorful(23));// 1
		System.out.println(c.colorful(236));// 0
		System.out.println(c.color(235781));// 0

	}

}
