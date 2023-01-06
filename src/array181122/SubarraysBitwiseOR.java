package array181122;
// https://www.scaler.com/academy/mentee-dashboard/class/40892/homework/problems/17868/?navref=cl_pb_nv_tb
public class SubarraysBitwiseOR {
	public Long solve(int A, int[] B) {
        long count = 0;
        for(int i = 0; i < B.length; i++) {
            if(B[i]==1) {
                count += (B.length - i);
            } else {
                for(int j = i+1; j < B.length; j++) {
                    if(B[j]==1) {
                        count += (B.length - j);
                        break;
                    }
                }      
            }
        }

        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraysBitwiseOR sbo = new SubarraysBitwiseOR();
		int[] B = {1,0,1};
		System.out.println(sbo.solve(3, B));// 5 
		int[] C = {1, 0};
		System.out.println(sbo.solve(2, C)); // 2
		int[] D = {1, 1};
		System.out.println(sbo.solve(2, D));// 3
	}

}
