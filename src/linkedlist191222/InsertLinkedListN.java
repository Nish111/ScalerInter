package linkedlist191222;

public class InsertLinkedListN {

	public static Node insertLinkedListBegin(Node head, int val) {
		Node newNode = new Node(val);
		newNode.next = head.next;
		head = newNode;
		
		return head;
	}
	public static Node insertLinkedListK(Node head, int val, int k) {
		if(k>linkedListSize(head)) return head;
		if(k==0) return insertLinkedListBegin(head, val);
		Node temp = head;
		for(int i=0; i<(k-1); i++) {
			temp = temp.next;
		}
		Node newNode = new Node(val);
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
		
	}
	public static Node insertLinkedList(Node head, int val) {
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
		Node n1 = insertLinkedList(n, 6);
		System.out.println(n1.val);
		Node n2 = insertLinkedListBegin(n, 6);
		System.out.println(n2.val);
	}
}
