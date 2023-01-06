package modular251122;
// https://www.scaler.com/academy/mentee-dashboard/class/40891/homework/problems/10198/hints?navref=cl_pb_nv_tb
import java.util.Arrays;

public class Concatenate3Numbers {
	public int solve(int A, int B, int C) {
		int sum=0;
		if(A<=B & A<=C & B<=C) sum=A*10000+B*100+C;
		if(A<=B & A<=C & C<=B) sum=A*10000+C*100+B;
		if(B<=A & B<=C & A<=C) sum=B*10000+A*100+C;
		if(B<=A & B<=C & C<=A) sum=B*10000+C*100+A;
		if(C<=B & C<=A & B<=A) sum=C*10000+B*100+A;
		if(C<=B & C<=A & A<=B) sum=C*10000+A*100+B;
		
		return sum;
    }
	public int solveScalerSol(int A, int B, int C) {
        int a[] = {A, B, C};
        Arrays.sort(a);
        return 10000*a[0] + 100*a[1] + a[2];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concatenate3Numbers cn = new Concatenate3Numbers();
		System.out.println(cn.solve(10, 20, 30));
		System.out.println(cn.solve(55, 43, 47));
		System.out.println(cn.solve(10, 20, 20));
	}

}
