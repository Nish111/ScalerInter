package linkedlist191222;

public class SizeLinkedList {

	public static int linkedListSize(Node node) {
		Node temp = node;
		int count = 0;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(7);
		Node n2 = new Node(4);
		Node n3 = new Node(1);
		n1.next = n2;
		n2.next = n3;
		System.out.println(linkedListSize(n1));
		System.out.println(linkedListSize(n2));
		
	}
}
class Node {
	int val;
	Node next;
	Node (int val) {
		this.val = val;
		this.next = null;
	}
}