package array141122;
// https://www.scaler.com/academy/mentee-dashboard/class/40903/assignment/problems/4256/?navref=cl_pb_nv_tb
public class InterviewProb2 {
	public static int maximum_oneScalerSol(String s)
    {
        // To count all 1's in the string
        int cnt_one = 0;
        int n=s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
                cnt_one++;
        }
        // To store cumulative 1's
        int left[] = new int[n];
        int right[] = new int[n];
        if (s.charAt(0) == '1')
            left[0] = 1;
        else
            left[0] = 0;
    
        if (s.charAt(n-1) == '1')
            right[n - 1] = 1;
        else
            right[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1')
                left[i] = left[i - 1] + 1;
            else
                left[i] = 0;
        }
    
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '1')
                right[i] = right[i + 1] + 1;
    
            else
                right[i] = 0;
        }
    
        int cnt = 0, max_cnt = 0;
        for(int i=0; i<n; ++i )
        max_cnt=Math.max(max_cnt,Math.max(right[i],left[i]));
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                int sum = left[i - 1] + right[i + 1];
    
                if (sum < cnt_one)
                    cnt = sum + 1;
    
                else
                    cnt = sum;

                max_cnt = Math.max(max_cnt, cnt);
                cnt = 0;
            }
        }
    
        return max_cnt;
    }
    public int solveScalerSol(String A) {
        return maximum_oneScalerSol(A);
        
    }
	public static int solve(String A) {
		int l=0; int r=0;
		int ans=0; int len=0; int total_ones=0;
		if(A.length()==0) return 0;
		for(int i=0; i<A.length(); i++) {
			if(A.charAt(i)=='1') total_ones++;
			//System.out.println(A.charAt(i));
		}
		//System.out.println(total_ones);
		for(int i=0; i<A.length(); i++) {
			if(A.charAt(i)=='0') {
				l=0;
				for(int j=i-1; j>=0; j--) {
					if(A.charAt(j)=='1') l++;
					else break;
				}
				//System.out.println(l + " " + i);
				r=0;
				for(int j=i+1; j<A.length(); j++) {
					if(A.charAt(j)=='1')	r++;
					else break;
				}
				//System.out.println(r);
				if(l+r <total_ones) len = l+r+1;
				else len = l+r;
				ans = Math.max(ans, len);
			}
		}
		if(ans==0 && total_ones>0) return A.length();
		else return ans;
	}
	public static int consecutiveOnesSwapHis(int[] A) {
		int l=0; int r=0;
		int ans=0; int len=0; int total_ones=0;
		if(A.length==0) return 0;
		for(int i=0; i<A.length; i++) {
			if(A[i]==1) total_ones++;
		}
		//System.out.println(total_ones);
		for(int i=0; i<A.length; i++) {
			if(A[i]==0) {
				l=0;
				for(int j=i-1; j>=0; j--) {
					if(A[j]==1) l++;
					else break;
				}
				//System.out.println(l + " " + i);
				r=0;
				for(int j=i+1; j<A.length; j++) {
					if(A[j]==1)	r++;
					else break;
				}
				//System.out.println(r);
				if(l+r <total_ones) len = l+r+1;
				else len = l+r;
				ans = Math.max(ans, len);
			}
		}
		if(ans==0 ) return A.length;
		else return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,0,1,1,0,1,1,1,0};
		//System.out.println(consecutiveOnesSwapHis(A));// 6
		int[] B = {1,1,1,1,0,1,1,0,1,1,1,0};
		//System.out.println(consecutiveOnesSwapHis(B));// 7
		int[] C = {1,1,0,1,1,1};
		//System.out.println(consecutiveOnesSwapHis(C));// 5
		int[] D = {0,1,1,1,1,0,1,1,1,0,1};
		///System.out.println(consecutiveOnesSwapHis(D));// 8
		String E = "111111";
		//System.out.println(solve(E));// 6
		String F = "000000000";
		//System.out.println(solve(F));// 9
		System.out.println(solve("11010110000000000"));// 1 - 4


	}

}
