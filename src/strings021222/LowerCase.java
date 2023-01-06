package strings021222;

import java.util.ArrayList;
// https://www.scaler.com/academy/mentee-dashboard/class/40905/assignment/problems/10696/hints?navref=cl_pb_nv_tb
public class LowerCase {

	 public ArrayList<Character> to_lowerScalerSol(ArrayList<Character> A) {
	        for(int i = 0; i < A.size(); ++i){
	            A.set(i, Character.toLowerCase(A.get(i)));
	        }
	        return A;
	    }
	public char[] to_lower(char[] A) {
		for(int i=0; i<A.length; i++) {
			if(A[i] >= 'A' && A[i] <='Z') A[i] = (char) (A[i] +32);
		}
		return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerCase lc = new LowerCase();
		char[] A = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
		char[] B = {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'};
		char[] C = lc.to_lower(A); //  ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
		char[] D = lc.to_lower(B); // ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
		for(int i=0; i<C.length; i++) System.out.print(C[i]);
		System.out.println();
		for(int i=0; i<D.length; i++) System.out.print(D[i]);
		System.out.println();
	}
	

}
