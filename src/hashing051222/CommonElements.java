package hashing051222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;

public class CommonElements { //pending
	public int[] solve(int[] A, int[] B) {
		HashMap<Integer, Integer> mpA = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(mpA.containsKey(A[i])) {
				mpA.put(A[i], (mpA.get(A[i]))+1);
				//mp.replace(A[i], value, value+1);
			} else {
				mpA.put(A[i], 1);
			}
		}
		//HashMap<Integer, Integer> mpB = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<B.length; i++) {
			if(mpA.containsKey(B[i])) {
					if(mpA.get(B[i])>0) {
						arr.add(B[i]);
						mpA.put(B[i], mpA.get(B[i])-1);
					}
			}
			
		}
		int[] count = new int[arr.size()];
		for(int j=0; j<arr.size(); j++) {
			count[j]=arr.get(j);
		}
		
		return count;
    }
	public ArrayList<Integer> solveScaleSol(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
        for(int x: A){
            a.put(x, a.getOrDefault(x, 0)+1);
        }
        for(int x: B){
            b.put(x, b.getOrDefault(x, 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int k: a.keySet()){
            if(b.containsKey(k)){
                for(int i = 0; i < Math.min(a.get(k), b.get(k)); ++i){
                    ans.add(k);
                }
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		CommonElements ce = new CommonElements();
		int[] A = {1, 2, 2, 1};
		int[] B = {2, 3, 1, 2};
		int[] E = ce.solve(A, B);// 2 1 2
		int[] C = {2, 1, 4, 10};
		int[] D = {3, 6, 2, 10, 10};
		int[] F = ce.solve(C, D); // 2 10
		for(int i=0; i<E.length; i++) System.out.print(E[i] + " ");
		System.out.println();
		for(int i=0; i<F.length; i++) System.out.print(F[i] + " ");
		System.out.println();
		
	}
}
