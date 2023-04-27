package array211122;
// https://www.scaler.com/academy/mentee-dashboard/class/40904/homework/problems/4531/submissions
public class HelpFromSam {
	public int solveScalerSol(int A) {
        int ans = 0;
        while(A > 0){
            if((A&1) > 0){
                ++ans;
            }
            A >>= 1;
        }
        return ans;
    }
	public int solve(int A) {
		// same as finding set bits in A
		int count=0;
        if((A&1) == 1) count++;
        while(A>0){
            if(((A>>1) & 1) == 1) count++;
            A=A>>1;
        }
        return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelpFromSam hfs = new HelpFromSam();
		System.out.println(hfs.solve(5)); //2
		System.out.println(hfs.solve(3)); // 2
		System.out.println(hfs.solve(13));//3
		System.out.println(hfs.solve(19));// 3
	}

}
