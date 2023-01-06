package modular251122;
// https://www.scaler.com/academy/mentee-dashboard/class/40891/homework/problems/10351/hints?navref=cl_pb_nv_tb
public class LeapYear {
	public int solve(int A) {
		if((A%400==0) ||((A%4==0) & (A%100!=0))) {
			return 1;
		} else return 0;
		
    }
	public int solveScalerSol(int A) {
        if(A%400 == 0){
            return 1;
        }
        if(A%100 == 0){
            return 0;
        }
        if(A%4 == 0){
            return 1;
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear ly = new LeapYear();
		System.out.println(ly.solve(2000));// 1
		System.out.println(ly.solve(2020));// 1
		System.out.println(ly.solve(1999));// 0
		System.out.println(ly.solve(1600));// 1
		System.out.println(ly.solve(1700));// 0
		System.out.println(ly.solve(1996));// 1
		System.out.println(ly.solve(1800));// 0
				
	}

}
