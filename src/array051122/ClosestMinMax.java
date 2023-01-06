package array051122;
//https://www.scaler.com/academy/mentee-dashboard/class/40896/assignment/problems/986?navref=cl_tt_nv
public class ClosestMinMax { // bookmarked
/*
 * Given an array A, find the size of the smallest subarray such that it contains '
 * at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.
 */
	public int solveScalerSol(int[] A) {
        
        int min_ele = Integer.MAX_VALUE, max_ele = Integer.MIN_VALUE;   
        // min and max value of the array
        int min_Index = -1, max_Index = -1; // index of the last element having value equal to min_ele and max_ele
        
        int ans = Integer.MAX_VALUE;
        for(int x:A){
            min_ele = Math.min(min_ele, x);
            max_ele = Math.max(max_ele, x);
        }
        
        for(int i=0 ; i<A.length ; i++){
            if(A[i] == min_ele) min_Index = Math.max(min_Index, i);
            if(A[i] == max_ele) max_Index = Math.max(max_Index, i);
            
            if(min_Index != -1 && max_Index != -1){
                int len = Math.abs(max_Index - min_Index) + 1;
                ans = Math.min(ans, len);
            }
        }
        
        return ans;
    }
	public int solve(int[] A) {
		int max = A[0];
		int min = A[0];
		for(int i=0; i<A.length; i++) {
			if(max < A[i]) max = A[i];
			if(min>A[i]) min = A[i];
		}
		//System.out.println(min + " " +max);
		int index_max = -1;
		int index_min = -1;
		int length=0;
		for(int i=0; i<A.length; i++) {
			if(A[i]==max) {
				index_max = i;
				if(index_min != -1) {
					if(length == 0) {
						length = Math.abs(index_max-index_min)+1;
					} else if(length >(Math.abs(index_max-index_min)+1)){
						length = Math.abs(index_max-index_min)+1;
					}
					
					//System.out.println(length);
				}
			}
			if(A[i]==min) {
				index_min = i;
				if(index_max != -1) {
					if(length == 0) {
						length = Math.abs(index_max-index_min)+1;
					} else if(length >(Math.abs(index_max-index_min)+1)){
						length = Math.abs(index_max-index_min)+1;
					}
					//System.out.println(length);
				}
			}
			/*
			 * System.out.println(i + " i " + A[i] + " " + index_min + " index_min " +
			 * index_max + " index_max " + length + " length ");
			 */
		}
		return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClosestMinMax cmm = new ClosestMinMax();
		int []A = {1, 3};
		System.out.println(cmm.solve(A));// 2
		int []B = {2};
		System.out.println(cmm.solve(B)); // 1
		int []C = {1, 2, 6,1,3,4,6,4,6,3};
		System.out.println(cmm.solve(C)); // 2
		int []D = {2,4,2,3,5,3,2,3,5};
		System.out.println(cmm.solve(D)); // 3
		int []E = {1, 2, 3,1,3,4,6,4,6,3};
		System.out.println(cmm.solve(E)); // 4
	}

}
