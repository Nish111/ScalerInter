package array211122;
// https://www.scaler.com/academy/mentee-dashboard/class/40904/homework/problems/9412/submissions
public class FindingGoodDays {
	public int solveScalerSol(int A) {
        //We need to find the number of set bits in binary representation of A
        int ans = 0;
        while(A>0){
            if(A%2==1) ans++;
            A /= 2;
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
		FindingGoodDays fgd = new FindingGoodDays();
		System.out.println(fgd.solve(5)); // 2
		System.out.println(fgd.solve(8)); // 1
	}

}
