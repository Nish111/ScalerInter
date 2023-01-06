package linkedlist191222;

public class SearchLinkedList {

	public int solve(ListNode A, int B) {
		ListNode temp = A;
		while(temp != null) {
			if(temp.val == B) return 1;
			temp = temp.next;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchLinkedList sll = new SearchLinkedList();
		ListNode A = new ListNode(1);
		System.out.println(sll.solve(A, 5));
	}
	 public int solveScalerSol(ListNode A, int B) {
	        while(A != null){
	            if(A.val == B){
	                return 1;
	            }
	            A = A.next;
	        }
	        return 0;
	    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */