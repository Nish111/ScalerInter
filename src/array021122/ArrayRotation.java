package array021122;
// https://www.scaler.com/academy/mentee-dashboard/class/40901/assignment/problems/29098?navref=cl_tt_nv
public class ArrayRotation {
	/*
	 * Given an integer array A of size N and an integer B, you have to return the same array after 
	 * rotating it B times towards the right.
	 */
	public int[] solve(int[] A, int B) {
		B=B%A.length;
        reversePart(A, 0, A.length-B-1); // we reverse the part 0 to B
        reversePart(A,A.length-B, A.length-1); // we reverse the part B to A
        reversePart(A, 0, A.length-1); // we reverse the whole
        return A;
    }
    public int[] reversePart(int[] A, int B, int C) {
        while(C>B){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++ ;
            C--;
        }
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation aro = new ArrayRotation();
		int[] A = {1, 2, 3, 4, 5, 6};
		aro.solve(A, 2); // 5 6 1 2 3 4 
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
/*
 * 0----------B-1B-----A
 * B-1----------0B-----A
 * B-1----------0A-----B
 * B-------A0--------B-1 -> thus getting rotation
 */
}
