package tree211222;

import java.util.ArrayList;
import java.util.Stack;

// https://www.scaler.com/academy/mentee-dashboard/class/40885/assignment/problems/222/submissions
public class PreOrderTraversal {
// Given a binary tree, return the preorder traversal of its nodes values.
// NOTE: Using recursion is not allowed.
	public ArrayList<Integer> preOrderTraversal(TreeNode A) {
		// need stack LIFO
		ArrayList<Integer> result = new ArrayList<>();
		if(A == null) return result;
		Stack<TreeNode> stackTrack = new Stack<>();
		while((A != null) || !stackTrack.empty()) {
			if(A != null) {
				result.add(A.data); // moved here for pre order
				stackTrack.push(A);
				A = A.left;
			}
			else {
				A = stackTrack.peek();
				stackTrack.pop();
				A = A.right;
			}
		}
		return result;
    }
	public ArrayList < Integer > preorderTraversalScalerSol(TreeNode A) {
	    ArrayList < Integer > res = new ArrayList < Integer > ();
	    Stack < TreeNode > stack = new Stack < > ();
	    if (A == null)
	      return res;
	    stack.push(A);
	    TreeNode node;
	    while (!stack.isEmpty()) {
	      node = stack.pop();
	      res.add(node.data);
	      if (node.right != null)
	        stack.push(node.right);
	      if (node.left != null)
	        stack.push(node.left);
	    }
	    return res;
	  }
	public void traversePostOrderRecursion(TreeNode root) {
		if(root == null) return;
		traversePostOrderRecursion(root.left);
		traversePostOrderRecursion(root.right);
		System.out.println(root.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		four.left = five;
		four.right = two;
		two.left = three;
		two.right = six;
		PreOrderTraversal iot = new PreOrderTraversal();
		ArrayList<Integer> ar = iot.preOrderTraversal(four);
		for(int i=0; i<ar.size(); i++) System.out.print(ar.get(i) +" ");
		System.out.println();
		/*
	    4
	   / \
	  5   2
	     / \
	    3   6 -> should give 4 5 2 3 6 
			 * 
			 */
	}

}
