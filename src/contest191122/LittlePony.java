package contest191122;

public class LittlePony {
	public static int solve(int[] A, int B) {
        int count=0;
        int val=0;
        for(int i=0; i<A.length; i++){
            if(A[i]>B) count++;
            if(A[i]==B) val++;
        }
        if(val>0) return count;
        else return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,4,3,1,5};
		System.out.println(solve(A, 3)); // 2
		int[] B = {1,4,2};
		System.out.println(solve(B, 3)); // -1
	}

}
