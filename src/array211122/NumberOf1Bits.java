package array211122;
//https://www.scaler.com/academy/mentee-dashboard/class/40904/assignment/problems/192/submissions
public class NumberOf1Bits {

	public int numSetBits(int A) {
        int count=0;
        if((A&1) == 1) count++;
        while(A>0){
            if(((A>>1) & 1) == 1) count++;
            A=A>>1;
        }
        return count;
    }
	public int numSetBitsAlternate(int A) {// class 23/11/22
        int count=0;
        while(A>0){
           A=A&(A-1);
           count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOf1Bits nb = new NumberOf1Bits();
		System.out.println(nb.numSetBits(450676354));// 14
		System.out.println(nb.numSetBitsAlternate(450676354)); // 14
		System.out.println(nb.numSetBitsAlternate(43)); // 4
	}

}
