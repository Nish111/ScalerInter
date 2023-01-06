package problemsolving191022;
// https://www.scaler.com/academy/mentee-dashboard/class/40900/assignment/problems/16066?navref=cl_tt_nv
public class IsPrime {
// Given an Integer A. Return 1 if A is prime and return 0 if not.
	public int solve(Long A) {
        if(A==1){
            return 0;
        }
        if(A==2){
            return 1;
           }
		for(int i=2; i<=Math.sqrt(A); i++) {
            
            if(A%i == 0){
                return 0;
            }
		}
        return 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime ip = new IsPrime();
		System.out.println(ip.solve(5L));// 1
		System.out.println(ip.solve(10L)); // 0
	}

}
