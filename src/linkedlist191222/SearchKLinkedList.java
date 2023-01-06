package linkedlist191222;
// https://www.scaler.com/academy/mentee-dashboard/class/40907/homework/problems/30666/submissions
public class SearchKLinkedList {

	public int solve(ListNode A, int B) {
		ListNode temp = A;
		if(B==0) return A.val;
		int count=1;
		while(count <= B) {
			temp = temp.next;
			count++;
		}
		return temp.val;
	}
	 public int solveScalerSol(ListNode A, int B) {
	        int curr = 0;
	        while(curr < B){
	            A = A.next;
	            curr += 1;
	        }
	        return A.val;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchKLinkedList sll = new SearchKLinkedList();
		ListNode A = new ListNode(1);
		System.out.println(sll.solve(A, 5));
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