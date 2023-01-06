package strings021222;

import java.util.ArrayList;
//https://www.scaler.com/academy/mentee-dashboard/class/40905/assignment/problems/10697/hints?navref=cl_pb_nv_tb
public class UpperCase {

	 public ArrayList<Character> to_upper(ArrayList<Character> A) {
	        for(int i = 0; i < A.size(); ++i){
	            A.set(i, Character.toUpperCase(A.get(i)));
	        }
	        return A;
	    }
	public char[] to_upper(char[] A) {
		for(int i=0; i<A.length; i++) {
			if(A[i] >= 'a' && A[i] <='z') A[i] = (char) (A[i] - 32);
		}
		return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperCase lc = new UpperCase();
		char[] A = {'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
		char[] B = {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'};
		char[] C = lc.to_upper(A); // ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']
		char[] D = lc.to_upper(B); // ['S', 'C', 'A', 'L', 'E', 'R', '#', '2', '0', '2', '0']
		for(int i=0; i<C.length; i++) System.out.print(C[i]);
		System.out.println();
		for(int i=0; i<D.length; i++) System.out.print(D[i]);
		System.out.println();
	}
	

}
