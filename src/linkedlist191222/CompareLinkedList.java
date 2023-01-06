package linkedlist191222;
// https://www.scaler.com/academy/mentee-dashboard/class/40907/homework/problems/30866/submissions
public class CompareLinkedList {
/*
 * Given heads of two linked lists A and B, check if they are identical i.e. each 
 * of their corresponding nodes should contain the same data. The two given linked 
 * lists may or may not be of the same length.
 */
	public int solve(ListNode A, ListNode B) {
		while(A != null & B != null) {
			if(A.val != B.val) return 0;
			A = A.next;
			B = B.next;
		}
		if(A ==null & B != null) return 0;
		if(B ==null & A != null) return 0;
		return 1;
    }
	public int solveScalerSol(ListNode A, ListNode B) {
        while(A != null && B != null){
            if(A.val != B.val){
                return 0;
            }
            A = A.next;
            B = B.next;
        }
        if(A == null && B == null){
            return 1;
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
