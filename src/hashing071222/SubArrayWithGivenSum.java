package hashing071222;

import java.util.ArrayList;
import java.util.HashMap;
//https://www.scaler.com/academy/mentee-dashboard/class/40888/homework/problems/4116/hints?navref=cl_pb_nv_tb
public class SubArrayWithGivenSum {

	public int[] solveBrute(int[] A, int B) {
		HashMap<Long, Integer> mp = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		int sum=0;
		int count=0;
		for(int i=0; i<A.length; i++) {
			sum=A[i];
			for(int j=i+1; j<A.length; j++) {
				sum+=A[j];
				if(sum==B) {
					al.add(A[i]);
					al.add(A[j]);
				}
			}
		}
		int[] list = new int[al.size()];
		for(int i=0; i<list.length; i++) list[i]=al.get(i);	
		if(al.isEmpty()) {
			int[] list1 = {-1};
			return list1;
			
		}
		return list;
	}
	public int[] solve(int[] A, int B) {
		int left=0; int right =0;
		long sum = A[left];
		while(right<A.length) {
			if(sum<B) {
				right++;
				if(right<A.length) {
					sum+=A[right];
				}
			} else if(sum==B) {
				int[] list = new int[right-left+1];
				int counter=0;
				for(int i=left; i<=right; i++) {
					list[counter]=A[i];	
					//System.out.println(A[i]);
					counter++;
				}
				return list;
			} else {
				sum -=A[left];
				left++;
			}
		}
		return new int[] {-1};
	}
	public int[] solveScalerSol(int[] A, int B) {
        long n = A.length;
        int l = 0, r = 0;
        long sum = A[l];
        while (r < n) {
            if (sum == B) {
                // current window sum = B
                int[] ans = new int[r - l + 1];
                for (int i = l; i <= r; i++) ans[i - l] = A[i];
                return ans;
            } else if (sum < B) {
                // current window sum < B
                r++;
                if (r < n) sum += A[r];
            } else {
                // current window sum > B
                sum -= A[l];
                l++;
                if (l > r && l < n - 1) {
                    r++;
                    sum += A[r];
                }
            }
        }
        int ans[] = new int[1];
        ans[0] = -1;
        return ans;
    }
	public static void main(String[] args) {
		SubArrayWithGivenSum sawgs = new SubArrayWithGivenSum();
		int[] A = {1, 2, 3, 4, 5};
		int[] B = sawgs.solveBrute(A, 5);
		int[] E = sawgs.solve(A, 5);
		int[] C = {5, 10, 20, 100, 105};
		int[] D = sawgs.solveBrute(C, 110);
		int[] F = sawgs.solve(C, 110);
		for(int i=0; i<E.length; i++) System.out.print(E[i] + " "); // 2 3
		System.out.println();
		for(int i=0; i<F.length; i++) System.out.print(F[i] + " "); // -1
		System.out.println();
	}

}
