package tree211222;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

// https://www.scaler.com/academy/mentee-dashboard/class/40885/assignment/problems/229/hints?navref=cl_pb_nv_tb
public class PostOrderTraversal {
// Given a binary tree, return the Postorder traversal of its nodes values.
// NOTE: Using recursion is not allowed.
	public ArrayList<Integer> postOrderTraversal(TreeNode A) {
		// need stack LIFO
		ArrayList<Integer> result = new ArrayList<>();
		if(A == null) return result;
		Stack<TreeNode> stackTrack = new Stack<>();
		while((A != null) || !stackTrack.empty()) {
			while(A != null) {
				//result.add(A.data); 
				stackTrack.push(A);
				result.add(A.data);
				A = A.right;
			}
			A = stackTrack.pop();
			A = A.left;
		}
		Collections.reverse(result);
		return result;
    }
	public ArrayList<Integer> postOrderTraversal2(TreeNode A) { // used this
		// need stack LIFO
		ArrayList<Integer> result = new ArrayList<>();
		if(A == null) return result;
		Stack<TreeNode> stackTrack = new Stack<>();
		while((A != null) || !stackTrack.empty()) {
			if(A != null) {
				result.add(A.data); // moved here for pre order
				stackTrack.push(A);
				A = A.right;
			}
			else {
				A = stackTrack.peek();
				stackTrack.pop();
				A = A.left;
			}
		}
		Collections.reverse(result);
		return result;
    }
	public ArrayList<Integer> postorderTraversalScalerSol(TreeNode A) {
	    Stack<TreeNode> stack1, stack2;
	    ArrayList<Integer> postorder;
	    TreeNode node;
	    stack1 = new Stack<>();
	    stack2 = new Stack<>();
	    postorder = new ArrayList<>();
	    if (A == null)
	        return null;
	    stack1.push(A);
	    while (!stack1.isEmpty()) {
	        node = stack1.pop();
	        stack2.push(node);
	        if (node.left != null)
	            stack1.push(node.left);
	        if (node.right != null)
	            stack1.push(node.right);
	    }
	    while (!stack2.isEmpty()) {
	        node = stack2.pop();
	        postorder.add(node.data);
	    }
	    return postorder;
	}
	public void traversePostOrderRecursion(TreeNode root) {
		if(root == null) return;
		traversePostOrderRecursion(root.left);
		traversePostOrderRecursion(root.right);
		System.out.print(root.data + " ");
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
		PostOrderTraversal iot = new PostOrderTraversal();
		iot.traversePostOrderRecursion(four);
		System.out.println();
		ArrayList<Integer> ar = iot.postOrderTraversal(four);
		for(int i=0; i<ar.size(); i++) System.out.print(ar.get(i) +" ");
		System.out.println();
		ArrayList<Integer> ar2 = iot.postOrderTraversal2(four);
		for(int i=0; i<ar2.size(); i++) System.out.print(ar2.get(i) +" ");
		System.out.println();
		/*
	    4
	   / \
	  5   2
	     / \
	    3   6 -> should give 5 3 6 2 4 
			 * 
			 */
	}

}
