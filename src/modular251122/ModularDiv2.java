package modular251122;
// https://www.scaler.com/academy/mentee-dashboard/class/40891/assignment/problems/27472/hints?navref=cl_pb_nv_tb
public class ModularDiv2 {
// 1<a<10^9, 1<n<10^5, 1<p<10^9
	public long powerDiv(int a, int n, int p) {
		long ans = 1;
		for(int i=0; i<n; i++) {
			ans = (ans*a)%p;
		}
		return ans%p;
	}
	public int powerDivInt(int a, int n, int p) {
		int ans = 1;
		for(int i=0; i<n; i++) {
			ans = (int) ((ans%p * (long)a%p)%p); // we made 1 long so result is long and have to cast to int
		}
		return (ans%p);
	}
	public int solveScalerSol(int A, int B, int C) {
        long res = 1;
        for(int i = 1 ; i <= B ; i++){
            res = (res * A) % C;
        }
        return (int)res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModularDiv2 md = new ModularDiv2();
		System.out.println(md.powerDiv(3, 4, 7)); // 4
		System.out.println(md.powerDiv(55711, 284, 64649));
	}

}
