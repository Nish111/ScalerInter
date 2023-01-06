package modular251122;
// https://www.scaler.com/academy/mentee-dashboard/class/40891/assignment/problems/31879/hints?navref=cl_pb_nv_tb
public class ModArray {

	public int modArray(int[] A, int p) {
		int ans=0;
		for(int i=0; i<A.length; i++) {
			//ans = (int) (ans+(A[i]*Math.pow(10, A.length-i-1))%p)%p;
			ans = (int) (ans+(A[i]%p *calMod(10, A.length-i-1, p)))%p;
		}
		return ans;
	}
	public int modArray2(int[] A, int p) { // O(N2)
		long ans=0;
		for(int i=0; i<A.length; i++) {
			int temp = A[i]%p;
			temp = temp * calMod(10, A.length-i-1, p);
			temp = temp%p;
			ans = (ans+temp)%p;
		}
		return (int) ans;
	}
	public int modArray3(int[] A, int B) { // O(N)
		long ans=0; long exp=1;
		for(int i=A.length-1; i>=0; i--) {
			long temp = A[i]%B;
			temp = temp * exp;
			temp = temp%B;
			ans = (ans+temp)%B;
			exp = (exp*10)%B;
		}
		return (int) ans;
	}
	 public int solveScalerSol(int[] A, int B) {
	        long ans = 0;
	        long mod = B;
	        int n = A.length;
	        long curr = 1;
	        for(int i = n - 1; i >= 0; i--){
	            long dig = A[i];
	            long term = (dig * curr) % mod;
	            ans = (ans + term) % mod;
	            curr = (curr * 10) % mod;
	        }
	        return (int)ans;
	    }
	public int calMod(int a, int n, int p) {
        long res = 1;
        for(int i = 1 ; i <= n ; i++){
            res = (res * a) % p;
        }
        return (int)res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModArray ma = new ModArray();
		int[] A = {4,5,6};
		System.out.println(ma.modArray(A, 5));
		System.out.println(ma.modArray2(A, 5));
		System.out.println(ma.modArray3(A, 5));
		int[] B = {3,5,6,1,6};
		System.out.println(ma.modArray(B, 7));
		System.out.println(ma.modArray2(B, 7));
		System.out.println(ma.modArray3(B, 7));
		int[] C = { 4, 5, 8, 9, 0, 8, 8, 2, 2, 5, 8, 4, 1, 5, 8, 9, 1, 1, 2, 4, 4, 0, 5, 5, 7, 8, 3, 5, 8, 9, 3, 7, 8, 6, 8, 7, 8, 6, 8, 0, 7, 5, 3, 9, 6, 0, 3, 9, 4, 8, 8, 4, 7, 6, 6, 1, 3, 4, 6, 8, 8, 0, 6, 3, 8, 5, 1, 5, 4, 8, 8, 2, 2, 1, 9, 5, 3, 5, 5, 1, 8, 1, 7, 7, 8, 0, 8, 1, 9, 2, 9, 7, 0, 8, 1, 7, 7, 5, 7, 8, 9, 3, 9, 4, 7, 1, 5, 4, 8, 1, 4, 6, 1, 9, 9, 0, 8, 3, 0, 3, 9, 7, 6, 6, 4, 7, 6, 2, 2, 4, 4, 7, 0, 1, 2, 8, 9, 8, 4, 9, 7, 8, 8, 4, 0, 7, 3, 1, 2, 5, 8, 4, 4, 2, 3, 7, 1, 1, 8, 1, 7, 6, 7, 4, 9, 2, 0, 5, 8, 3, 0, 0, 9, 8, 1, 3, 0, 3, 3, 0, 4, 2, 7, 3, 7, 1, 1, 2, 7, 1, 6, 5, 3, 8, 6, 6, 2, 9, 5, 0, 2, 8, 3, 2, 5, 9, 4, 4, 5, 5, 1, 4, 4, 2, 3, 0, 2, 0, 1, 6, 2, 5, 4, 1, 3, 3, 2, 6, 7, 5, 7, 4, 9, 1, 2, 4, 9, 9, 8, 5, 9, 7, 6, 2, 9, 3, 6, 3, 2, 0, 7, 2, 0, 8, 5, 0, 9, 3, 7, 2, 1, 0, 1, 9, 1, 5, 6, 6, 9, 8, 5, 5, 3, 2, 1, 4, 0 };
		System.out.println(ma.modArray(C, 52));
		System.out.println(ma.modArray2(C, 52));
		System.out.println(ma.modArray3(C, 52));
	}

}
