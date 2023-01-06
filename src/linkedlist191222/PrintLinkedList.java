package linkedlist191222;

public class PrintLinkedList {

	public void solve(ListNode A) {
		ListNode temp = A;
		int count = 0;
		while(temp != null) {
			System.out.print(temp.val +" ");
			temp = temp.next;
			count++;
		}
		System.out.println();
	}
	 public void solveScalerSol(ListNode A) {
	        while(A != null){
	            System.out.print(A.val + " ");
	            A = A.next;
	        }
	        System.out.print("\n");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintLinkedList pll = new PrintLinkedList();
		ListNode A = new ListNode(1);
		pll.solve(A);
	}

}
class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}