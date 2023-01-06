package linkedlist191222;

public class LinkedListN {

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
		System.out.println(n.val);
		
	}
}
