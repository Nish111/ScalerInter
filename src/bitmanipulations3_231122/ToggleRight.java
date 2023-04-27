package array231122;

public class ToggleRight {
	public int toggleAllStartingFromRightMostSet(int A) {
		return A-1;
		/*
		 * int x=0; while(A>0) { if((A&1)==1) { break; } x++; A>>=1; }
		 * System.out.println(x); return (A^((1<<(x+1))-1));//(A^((1<<(x+1))-1));
		 */	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToggleRight tr = new ToggleRight();
		System.out.println(tr.toggleAllStartingFromRightMostSet(20));// 19
		System.out.println(tr.toggleAllStartingFromRightMostSet(20));
		System.out.println(tr.toggleAllStartingFromRightMostSet(20));

	}

}
