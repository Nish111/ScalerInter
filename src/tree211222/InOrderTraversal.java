package tree211222;

import java.util.ArrayList;
import java.util.Stack;

// https://www.scaler.com/academy/mentee-dashboard/class/40885/assignment/problems/214?navref=cl_tt_lst_nm
public class InOrderTraversal {
// Given a binary tree, return the inorder traversal of its nodes' values.
// NOTE: Using recursion is not allowed.
	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		// need stack LIFO
		ArrayList<Integer> result = new ArrayList<>();
		if(A == null) return result;
		Stack<TreeNode> stackTrack = new Stack<>();
		while((A != null) || !stackTrack.empty()) {
			if(A != null) {
				stackTrack.push(A);
				A = A.left;
			}
			else {
				A = stackTrack.peek();
				stackTrack.pop();
				result.add(A.data);
				A = A.right;
			}
		}
		return result;
    }
	public ArrayList<Integer> inorderTraversalScalerSol(TreeNode A) {
	    TreeNode current, node;
	    ArrayList<Integer> res = new ArrayList<>();
	    current = A;
	    while (current != null) {
	        if (current.left == null) {
	            res.add(current.data);
	            current = current.right;
	        } else {
	            node = current.left;
	            while (node.right != null && !current.equals(node.right))
	                node = node.right;
	            
	            if (node.right == null) {
	                node.right = current;
	                current = current.left;
	            } else {
	                current = node.right;
	                node.right = null;
	                res.add(current.data);
	                current = current.right;
	            }
	        }
	    }
	    return res;
	}
	public void traverseInOrderRecursion(TreeNode root) {
		if(root == null) return;
		traverseInOrderRecursion(root.left);
		System.out.println(root.data);
		traverseInOrderRecursion(root.right);
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
		InOrderTraversal iot = new InOrderTraversal();
		ArrayList<Integer> ar = iot.inorderTraversal(four);
		for(int i=0; i<ar.size(); i++) System.out.print(ar.get(i) +" ");
		System.out.println();
		/*
	    4
	   / \
	  5   2
	     / \
	    3   6 -> should give 5,4,3,2,6
			 * 
			 */
	}

}
