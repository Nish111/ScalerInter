package linkedlist191222;
// https://www.scaler.com/academy/mentee-dashboard/class/40907/homework/problems/30665/submissions
public class SortedLinkedList {
/*
 * You are given the head of a linked list A. Check if the data inside it exists in 
 * non-decreasing order.


 */
	public int solve(ListNode A) {
		ListNode temp = A;
		while(temp.next != null) {
			if(temp.next.val < temp.val) return 0;
			temp = temp.next;
		}
		return 1;
    }
	 public int solveScalersol(ListNode A) {
	        while(A != null){
	            if(A.next != null){
	                if(A.next.val < A.val){
	                    return 0;
	                }
	            }
	            A = A.next;
	        }
	        return 1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
