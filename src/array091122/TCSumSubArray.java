package array091122;

// https://www.scaler.com/academy/mentee-dashboard/class/40902/assignment/problems/30355/?navref=cl_pb_nv_tb
public class TCSumSubArray {

	public void printSums(int ar[]){ // TC = O(N^2) , SC = O(N)
		int N = ar.length;
		int pf[] = new int[N];
		pf[0] = ar[0];
		for(int i = 1 ; i < N ; i++){
			pf[i] = pf[i - 1] + ar[i];
		}
		for(int i = 0 ; i < N ; i++){
			for(int j = i ; j < N ; j++){
				if(i == 0) System.out.print(pf[j] + " ");
				else System.out.print(pf[j] - pf[i-1] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,4,5,6,3,8,9};
		TCSumSubArray tcs = new TCSumSubArray();
		tcs.printSums(A);
	}
/*
 * 1 4 8 13 19 22 30 39 
3 7 12 18 21 29 38 
4 9 15 18 26 35 
5 11 14 22 31 
6 9 17 26 
3 11 20 
8 17 
9 

 */
}
