package hashing051222;

import java.util.HashMap;
// problem 1
public class ElementFrequency {
	public void elementFreq(int[] A, int[] q) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(mp.containsKey(A[i])) {
				int value = mp.get(A[i]);
				mp.put(A[i], value+1);
				//mp.replace(A[i], value, value+1);
			} else {
				mp.put(A[i], 1);
			}
		}
		for(int i=0; i<q.length; i++) {
			if(mp.containsKey(q[i])) {
				System.out.println(mp.get(q[i]));
			} else {
				System.out.println(0);
			}
		}
	}
	public int[] solveScalerSol(int[] A, int[] B) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0 ; i < A.length ; i++){
            if(freq.containsKey(A[i])){
                freq.put(A[i], freq.get(A[i]) + 1);
            }
            else{
                freq.put(A[i], 1);
            }
        }
        int[] ans = new int[B.length];
        for(int i = 0 ; i < B.length ; i++){
            if(freq.containsKey(B[i])){
                ans[i] = freq.get(B[i]);
            }
            else{
                ans[i] = 0;
            }
        }
        return ans;
    }
	public int[] elementFreq2(int[] A, int[] B) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(mp.containsKey(A[i])) {
				int value = mp.get(A[i]);
				mp.put(A[i], value+1);
				//mp.replace(A[i], value, value+1);
			} else {
				mp.put(A[i], 1);
			}
		}
		int[] q1 = new int[B.length];
		for(int i=0; i<B.length; i++) {
			if(mp.containsKey(B[i])) {
				q1[i]=mp.get(B[i]);
				//System.out.println(mp.get(q[i]));
			} else {
				q1[i]=0;
				//System.out.println(0);
			}
		}
		return q1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementFrequency ef = new ElementFrequency();
		int[] A = {2,4,2,1,4,4,3};
		int[] q = {2,4,3,1, 5};
		ef.elementFreq(A, q);// 2 3 1 1 0
		System.out.println();
		int[] C = {1, 2, 1, 1};
		int[] D = {1, 2};
		ef.elementFreq(C, D);// 3 1
		System.out.println();
		int[] E = {2, 5, 9, 2, 8};
		int[] F = {3, 2};
		ef.elementFreq(E, F);// 0 2
		System.out.println();
		int[] val=ef.elementFreq2(E, F);
		for(int i=0; i<val.length; i++) System.out.print(val[i] + " ");
		System.out.println();
	}

}
