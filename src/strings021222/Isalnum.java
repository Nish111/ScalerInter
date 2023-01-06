package strings021222;

import java.util.ArrayList;

public class Isalnum {
	public int solve(char[] A) {
		for(int i=0; i<A.length; i++) {
			if(!((A[i]>='A' && A[i]<='Z') || (A[i]>='a' && A[i]<='z') || (A[i]>='0' && A[i]<='9'))) {
				return 0;
			}
		}
		return 1;
    }
	 public int solveScalerSol(ArrayList<Character> A) {
	        for(Character x: A){
	            if(!Character.isLetterOrDigit(x)){
	                return 0;
	            }
	        }
	        return 1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isalnum ian = new Isalnum();
		char[] A = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
		char[] B = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
		System.out.println(ian.solve(A)); // 1
		System.out.println(ian.solve(B)); //0 
	}

}
