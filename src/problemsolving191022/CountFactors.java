package problemsolving191022;
// https://www.scaler.com/academy/mentee-dashboard/class/40900/assignment/problems/29028/?navref=cl_pb_nv_tb
public class CountFactors {
/*
 * Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6
 */
	public int solve(int A) {
        int ans = 0;
		for(int i=1; i<=Math.sqrt(A); i++) {
			if(A%i==0)
				ans=ans+2;
			if(i*i == A) {
				ans--;
			}
		}
		return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountFactors cf = new CountFactors();
		System.out.println(cf.solve(5)); // 2
		System.out.println(cf.solve(10)); // 4

	}

}
