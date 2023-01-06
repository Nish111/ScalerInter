package linkedlist191222;
// https://www.scaler.com/academy/mentee-dashboard/class/40907/assignment/problems/30667/hints?navref=cl_pb_nv_tb
public class DeleteLinkedList {
/*
 * You are given the head of a linked list A and an integer B. Delete the B-th node 
 * from the linked list.

Note : Follow 0-based indexing for the node numbering.
 */
	public ListNode solve(ListNode A, int B) {
		ListNode temp = A;
		if(B==0) return A.next;
		else {
			int count=0;
			while(count != B-1) {
				count++;
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		return A;
	}
	public ListNode solveScalersol(ListNode A, int B) {
        if(B == 0){
            return A.next;
        }
        ListNode temp = A;
        int curr = 0;
        while(curr < B - 1){
            curr += 1;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
