package array141122;

public class InterviewProb1 {
	public static int consecutiveOnesPrefix(int[] A) {// incomplete
		int l=0; int r=0; int ans=0;
		boolean flag=false;
		for(int i=0; i<A.length; i++) {
			if(A[i]==0) {
				l=0;
				flag=true;
			}
			if(flag==true) {
				if(A[i]==1) {
					r++;
				}
			}else {
				l++;
			}
		}
		return ans;
	}
	public static int consecutiveOnesHis(int[] A) {
		int l=0; int r=0;
		int ans=0;
		if(A.length==0) return 0;
		for(int i=0; i<A.length; i++) {
			if(A[i]==0) {
				l=0;
				for(int j=i-1; j>=0; j--) {
					if(A[j]==1) {
						l++;
					} else {
						break;
					}
				}
				//System.out.println(l + " " + i);
				r=0;
				for(int j=i+1; j<A.length; j++) {
					if(A[j]==1) {
						r++;
					} else {
						break;
					}
				}
				//System.out.println(r);
				ans = Math.max(ans, l+r+1);
			}
			
		}
		if(ans==0) return A.length;
		else return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,0,1,1,0,1,1,1,0};
		System.out.println(consecutiveOnesHis(A));// 6
		int[] B = {1,1,1,1,0,1,1,0,1,1,1,0};
		System.out.println(consecutiveOnesHis(B));// 7
		int[] C = {1,1,1,1,1};
		System.out.println(consecutiveOnesHis(C));// 5
		int[] D = {0,1,1,1,1,0,1,1,1,0,1};
		System.out.println(consecutiveOnesHis(D));// 8

	}

}
