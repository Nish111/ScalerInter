package hashing051222;

import java.util.HashMap;
import java.util.Map;
//https://www.scaler.com/academy/mentee-dashboard/class/40889/homework/problems/27543/hints?navref=cl_pb_nv_tb
public class UniqueElements {
	public int solve(int[] A) {
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
        int count=0;
        for(int i=0; i<A.length; i++) {
			int value = mp.get(A[i]);
			if(value==1) count++;
		}
        return count;
    }
	public int solveScalerSol(int[] A) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0 ; i < A.length ; i++){
            if(freq.containsKey(A[i])){
                freq.put(A[i], freq.get(A[i]) + 1);
            } 
            else{
                freq.put(A[i], 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueElements ue = new UniqueElements();
		int[] A = {3, 4, 3, 6, 6};
		int[] B = {3, 3, 3, 9, 0, 1, 0};
		System.out.println(ue.solve(A)); // 1
		System.out.println(ue.solve(B)); // 2
		System.out.println(ue.solveScalerSol(A)); // 1
		System.out.println(ue.solveScalerSol(B)); // 2
		
	}

}
