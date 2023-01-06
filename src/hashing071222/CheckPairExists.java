package hashing071222;

import java.util.HashMap;
import java.util.HashSet;
// https://www.scaler.com/academy/mentee-dashboard/class/40888/assignment/problems/21202/hints?navref=cl_pb_nv_tb
public class CheckPairExists {

	public boolean bruteForce(int[] A, int k) {
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = k-A[i];
			for(int j=i+1; j<A.length; j++) {
				if(A[j]==b) return true;
			}
		}
		return false;
	}
	public boolean checkIfPairExists(int[] A, int k) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(mp.containsKey(A[i])) mp.put(A[i], mp.get(A[i])+1);
			else mp.put(A[i], 1);
		}
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = k-A[i];
			if( a != b && mp.containsKey(b)) return true;
			else if(a==b && mp.get(b)>1) return true;
		}
		return false;
	}
	public boolean checkIfPairExistsSetHis(int[] A, int k) {// works because i am check validation for only b
		// inserting a whenever we get a and insert a in HashSet, when we encounter the b part
		// we check if a is already present in hashset
		// thus when we have duplicate case ie k/2 - 22, 11, 11 case
		// here 1st 11 will be inserted and if we encounter 2nd 11 only then it will return true
		// if no 2nd 11 then this case is not even reached
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = k-A[i];
			if(hs.contains(b)) return true; 
			else hs.add(a);
		}
		return false;
	}
	public int solveScalerSol(int A, int[] B) {
	        HashSet < Integer > set = new HashSet < Integer > ();
	        for(int i = 0 ; i < B.length ; i++){
	            if(set.contains(A - B[i])){
	                return 1;
	            }
	            set.add(B[i]);
	        }
	        return 0;
	    }
	public boolean checkIfPairExistsSet(int[] A, int k) {// failing
		HashSet<Integer> ms = new HashSet<>();
		for(int i=0; i<A.length; i++) {
			ms.add(A[i]);
		}
		int val=0; int count=0;
		for(int i=0; i<A.length; i++) {
			int a = A[i];
			int b = k-A[i];
			System.out.println(b);
			if( (a != b) && ms.contains(b)) return true;// failing but still not correct approach as 
			else if(a==b) val=a;//i am just storing 1st k/2 so should work.. need to try
		}
		for(int i=0; i<A.length; i++) {
			if(val==A[i]) count++;
		}
		if(count>=val) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPairExists cpe = new CheckPairExists();
		int[] A = {8,9,1,-2,4,5,11,-6,7,5,11};
		int[] B = {8,9,1,-2,4,5,11,-6,7,5};
		System.out.println(cpe.checkIfPairExists(A, 22)); // true
		System.out.println(cpe.checkIfPairExists(A, 23)); // false
		System.out.println(cpe.checkIfPairExists(A, 18)); /// true
		System.out.println(cpe.checkIfPairExistsSetHis(B, 22)); // false
		System.out.println(cpe.checkIfPairExistsSetHis(B, 10)); // true
		System.out.println(cpe.checkIfPairExistsSetHis(A, 18)); /// true
		System.out.println(cpe.bruteForce(B, 22)); // false
		System.out.println(cpe.bruteForce(B, 10)); // true
		System.out.println(cpe.bruteForce(A, 18)); /// true
	}

}
