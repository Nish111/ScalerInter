package array161122;

public class MajorityElement {
	public static int majorityBrute(int[] A) { // O(N^2) SC (1)
		for(int i=0; i<A.length; i++) {
			int val = A[i];
			int count=0;
			for(int j=0; j<A.length; j++) {
				if(A[j]==val) count++;
			}
			if(count>A.length/2) return val;
		}
		return -1;
	}
	public static int majorityLogic(int[] A) { // O(N) SC (1)
		int maj = A[0];
		int count=1;
		for(int i=1; i<A.length; i++) {
			if(A[i]==maj) count++;
			else {
				if(count == 0) {
					maj = A[i];
					count=1;
				} else count--;
			}
		}
		count=0;
		for(int i=0; i<A.length; i++) {
			if(A[i]==maj) count++;
		}
		if(count>A.length/2) return maj;
		else return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,6,1,1,2,1};
		System.out.println(majorityBrute(A));// 1
		int[] B = {4,6,5,3,4,5};
		System.out.println(majorityBrute(B));// -1
		int[] C = {3,4,3,6,1,3,2,5,3,3,3};
		System.out.println(majorityBrute(C));//3
		System.out.println(majorityLogic(A));// 1
		System.out.println(majorityLogic(B));// -1
		System.out.println(majorityLogic(C));//3
	}

}
