package hashing071222;

import java.util.HashSet;
// https://www.scaler.com/academy/mentee-dashboard/class/40888/homework/problems/11836/submissions
public class PairWithGivenDifference {
	public int solve(int[] A, int B) {
		HashSet<Integer> hs = new HashSet<>();
		int count=0;
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = B+A[i];
			int c = A[i]-B;
			if(hs.contains(b)) {
				count++; 
				//System.out.println(a+" " +b+" "+c);
				return 1;
			}
			else if(hs.contains(c)) {
				count++;
				System.out.println(a+" " +b+ " "+c);
				return 1;
			}
			else hs.add(a);
		}
		return 0;
    }
	 public int solveScalerSol(int[] A, int B) {
	        HashSet<Integer> set = new HashSet<>();
	        for(int i = 0 ; i < A.length ; i++){
	            if(set.contains(A[i] + B) || set.contains(A[i] - B)){
	                return 1;
	            }
	            set.add(A[i]);
	        }
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairWithGivenDifference pwgd = new PairWithGivenDifference();
		int[] A = {5, 10, 3, 2, 50, 80};
		int[] B = {-10, 20};
		int[] C = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 
				942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 
				538, 869, 912, 667, -701, 35, 894, -297, 811, 322 };
		System.out.println(pwgd.solve(A, 78));// 1
		System.out.println(pwgd.solve(B, 30)); // 1
		System.out.println(pwgd.solve(C, 369)); // 1
	}

}
