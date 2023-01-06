package array091122;

import java.util.ArrayList;
// https://www.scaler.com/academy/mentee-dashboard/class/40902/homework/problems/16123/?navref=cl_pb_nv_tb
public class AlternatingSubarrays {
/*
 * You are given an integer array A of length N comprising of 0's & 1's, and an 
 * integer B.
You have to tell all the indices of array A that can act as a center of 2 * B + 1 
length 0-1 alternating subarray.
A 0-1 alternating array is an array containing only 0's & 1's, and having no 
adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 
alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.
 */
	public int[] solveVideo(int[] A, int B) {
		int len = 2*B +1;
		ArrayList<Integer> ans = new ArrayList();
		int N = A.length;
		for(int i=0; i<N-len+1; i++) {
			int prev = -1; int flag = 1;
			for(int j=i; j<i+len; j++) {
				if(A[j]==prev) {
					flag=0;
					break;
				}
				prev=A[j];
			}
			if(flag==1) {
				ans.add(i+B);
			}
		}
		/*
		 * int[] ret = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) ret[i] = l1.get(i);
        return ret; */
		return ans.stream().mapToInt(Integer::intValue).toArray();
	}
	public int[] solve(int[] A, int B) { // not able to understand
		ArrayList<Integer> indexes = new ArrayList();
		int aSize = A.length;
		int windowSize = 2 * B + 1;
		for (int out = 0; out<= aSize - windowSize; out++) {
			int windowStart = out;
			int windowEnd = out + windowSize - 1;
			int temp = A[windowStart];
			while (windowStart<= windowEnd) {
				if (windowStart - out == 0) {
					temp = A[windowStart];
					//System.out.println(temp);
				}
				if ((A[windowStart] == A[windowEnd]) && (temp == A[windowStart])) {
					temp = A[windowEnd] ^ 1;
				} else
					break;
				windowStart++;
				windowEnd--;
			}

			if (windowStart > windowEnd) {
				indexes.add(windowStart - 1);
			}
		}
		for(Integer ival:indexes) {
			//System.out.println(ival);
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}
	public ArrayList<Integer> solveOne(ArrayList<Integer> A, int B) {
/*For an element to be a center of alternating subarray we can consider each element as valid 
 * and validate whether is it indeed a valid one if at any point we find it to be incorrect we 
 * just break out and don`t increment our count We need to linearly traverse on the 
 * array(or list whatever) */
	        ArrayList<Integer> correctElements=new ArrayList<>();
	        for(int i=0;i<A.size();i++){
	            int currentElement=A.get(i);
/* Now that we have a current element we need to ensure that the elements to left and right are 
alternating So we can go b steps to left and b steps to right and at every check the element 
should be alternate to the previous encountered and also the left and right part should be same 
which we can validate with two pointers Which means we need a loop which goes from 0 to b-1 and 
we need to check both neighbours on left and right */
	            int j=1;
	            int lookingFor=1^currentElement;
	            while(j!=B+1){
	                // One side goes on left and one side goes on right
	                int leftIndex=j+i;
	                int rightIndex=i-j;
	                if((leftIndex<0||leftIndex>=A.size())||(rightIndex<0||rightIndex>=A.size())){
	                    // Handling out of  bounds.
	                    break;
	                }
	                // Left index and right index are both side pointers obviously we need to break if we find
	                // idex if out of bound.
	                if(A.get(leftIndex)==A.get(rightIndex)&&A.get(leftIndex)==lookingFor){
	                    // Now that both sides are matching and are equal to the element we are looking for,
	                    // in the next iteration we are looking for the toggle of that and move both pointers.
	                    lookingFor=1^lookingFor;
	                    j++;
	                }
	                else{
	                    // Anywhere we find either differing elements on both sides or not matching to our alternate
	                    // element there is no point going forward hence we break.
	                    break;
	                }
	               
	            }
	            if(j==B+1){
	                // If we somehow reached till B+1 this means that all elements were correct and this can
	                // be added to our list
	                correctElements.add(i);
	            }
	        }
	        return correctElements;
	    }
	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int c = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(B == 0)  res.add(0);
        for(int i = 1; i<A.size(); i++){            
            if(B == 0){
                res.add(i);
            }else{
                if(A.get(i) != A.get(i-1)){
                    c++;  
                    if(c >=  B*2)
                        res.add(i-B);                    
                }else{
                    c = 0;
                }
            }
        }
        return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlternatingSubarrays as = new AlternatingSubarrays();
		int[] A = {1,0,1,0,1};
		int[] B = as.solveVideo(A, 1); // 1 2 3
		int[] C = {0, 0, 0, 1, 1, 0, 1};
		int[] D = as.solveVideo(C, 0); // 0 1 2 3 4 5 6
		int[] E = {0, 0, 0, 1, 1, 0, 1};
		int[] F = as.solveVideo(E, 1); // 5
		for(int i=0; i<B.length;i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		for(int i=0; i<D.length;i++) {
			System.out.print(D[i] + " ");
		}
		System.out.println();
		for(int i=0; i<F.length;i++) {
			System.out.print(F[i] + " ");
		}
		System.out.println();
	}

}
