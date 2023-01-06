package hashing071222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
// https://www.scaler.com/academy/mentee-dashboard/class/40888/homework/problems/10640/?navref=cl_pb_nv_tb
public class PairWithGivenXOR {
	public int solve(int[] A, int B) {
		HashSet<Integer> hs = new HashSet<>();
		int count=0;
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b=a^B; // XOR ing property a^b = B, then a^B = b and b^B=A
			if(hs.contains(b)) {
				count++; 
				//System.out.println(a+" " +b);
			}
			else hs.add(a);
		}
		return count;
    }
	public int solveScalerSol(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int x: A){
            if(mp.containsKey(x^B)){
                ++ans;
            }
            mp.put(x, 1);
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairWithGivenXOR pwgx = new PairWithGivenXOR();
		int[] A = {5, 4, 10, 15, 7, 6};
		int[] B = {3, 6, 8, 10, 15, 50};
		System.out.println(pwgx.solve(A, 5));
		System.out.println(pwgx.solve(B, 5));
		
		
		
	}

}
