package recursion141222;

public class IsMagic {

	public int solve(int A) {
		if(A<10) {
			if(A%10==1) return 1;
			else return 0;
		}
		int sum=0;
		while(A>0) {
			sum += A%10;
			A=A/10;
		}
		return solve(sum);
	}
	public int solveScalersol(int A) {
        if(A%9 == 1){
            return 1;
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsMagic im = new  IsMagic();
		System.out.println(im.solve(83557)); // 1
		System.out.println(im.solve(1291)); // 0

	}

}
