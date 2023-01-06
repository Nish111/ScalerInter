package linkedlist191222;
// https://www.scaler.com/academy/mentee-dashboard/class/40907/assignment/problems/30536/?navref=cl_pb_nv_tb
public class InsertLinkedListQ { //bookmarked
/*
 * You are given A which is the head of a linked list. Also given is the value B and 
 * position C. Complete the function that should insert a new node with the said 
 * value at the given position.

Notes:

In case the position is more than length of linked list, simply insert the new node 
at the tail only.
In case the pos is 0 or less, simply insert the new node at head only.
Follow 0-based indexing for the node numbering.
 */
	public static Node insertLinkedListK(Node head, int val, int k) {
		if(k>linkedListSize(head)) return insertLinkedListEnd(head, val);
		if(k<=0) return insertLinkedListBegin(head, val);
		Node temp = head;
		for(int i=0; i<(k-1); i++) {
			temp = temp.next;
		}
		Node newNode = new Node(val);
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
		
	}
	public static Node insertLinkedListBegin(Node head, int val) {
		Node newNode = new Node(val);
		newNode.next = head.next;
		head = newNode;
		
		return head;
	}
	public static Node insertLinkedListEnd(Node head, int val) {
		if(head == null) {
			head = new Node(val);
			return head;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(val);
		return head;
	}
	public static int linkedListSize(Node node) {
		Node temp = node;
		int count = 0;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
public ListNode solveScalerSol(ListNode A, int B, int C) {
    ListNode n = new ListNode(B);
    if (C <= 0){
        n.next = A;
        return n;
    }
    
    int i = 0;
    ListNode temp = A;
    while (i < C-1 && temp.next != null){
        i += 1;
        temp = temp.next;
    }
    
    n.next = temp.next;
    temp.next = n;
    return A;
}
	// we are using Node from prev class
	public static Node createLinkedList(int n) {
		Node head = new Node(1);
		Node temp = head;
		for(int i=2; i<=n; i++) {
			temp.next = new Node(i);
			temp = temp.next;
		} 
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = createLinkedList(4);
		Node n1 = insertLinkedListEnd(n, 6);
		System.out.println(n1.val);
		Node n2 = insertLinkedListBegin(n, 6);
		System.out.println(n2.val);
	}
}
