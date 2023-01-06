package array141122;
// https://www.scaler.com/academy/mentee-dashboard/class/40903/assignment/problems/27363/submissions
public class InterviewProb3 {
	public int solveScalerSol(int[] A) {
        int n = A.length , ans = 0;
        for(int i = 0 ; i < n ; i++){
            int l = 0 , r = 0;
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    l += 1;
                }
            }
            for(int j = i + 1 ; j < n ; j++){
                if(A[i] < A[j]){
                    r += 1;
                }
            }
            ans += (l * r);
        }
        return ans;
    }
	public int solve(int[] A) {
		int left_small=0; int right_big=0;
		int sum=0; int total=0; 
		if(A.length==0) return 0;
		for(int j=1; j<A.length-1; j++) {
			sum=0; left_small=0; right_big=0;
			for(int i=0; i<j; i++) {
				if(A[i]<A[j]) left_small++;
			}
			for(int k=j+1; k<A.length; k++) {
				if(A[j]<A[k]) right_big++;
			}
			sum =(left_small*right_big);
			//System.out.println(sum);
			total += sum;
		}
		return total;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewProb3 iv3 = new InterviewProb3();
		int[] A = {3,6,9,12,5,16,8,7};
		System.out.println(iv3.solve(A));
		int[] B = { 17, 23, 30, 19, 8, 17, 17};
		System.out.println(iv3.solve(B));

	}

}
