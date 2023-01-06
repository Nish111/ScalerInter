package array051122;

import java.util.ArrayList;

// https://www.scaler.com/academy/mentee-dashboard/class/40896/homework/problems/320/submissions
public class Bulbs {
	public int bulbsScalerSol(ArrayList < Integer > A) {
	    int state = 0, ans = 0;
	    // state variable will represent the state which we have to change.
	    for (int i = 0; i < A.size(); i++) {
	      if (A.get(i) == state) {
	        ans++;
	        // As we will switch this, all the bulbs on right side will also change. 
	        //So, change state = 1 - state
	        state = 1 - state;
	      }
	    }
	    return ans;
	}
	
	public int bulbs(int[] A) {
		int count=0;
		for(int i=0; i<A.length; i++) {
			if((A[i]==0 && count%2==0) || (A[i]==1 && count%2 != 0)) {
				count++;
			}	
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulbs b = new Bulbs();
		int[] A = {0, 1, 0, 1};
		System.out.println(b.bulbs(A)); // 4 
		int[] B = {1, 1, 1, 1};
		System.out.println(b.bulbs(B)); // 0
		int[] C= {1,0,0,1,0};
		System.out.println(b.bulbs(C)); // 3 
		int[] D = {1, 1, 0, 0, 1, 1, 0, 0, 1};
		System.out.println(b.bulbs(D));// 4
	}
/*
 * if index is 0 then check how many times we have switched
 * if no of switched is even it is going to reset to 0 and so need to be switched
 * if index is 1 then check same
 * if we have switched odd times then we need to switch
 */
}
