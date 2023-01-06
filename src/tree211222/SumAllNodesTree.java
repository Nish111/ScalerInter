package tree211222;
// https://www.scaler.com/academy/mentee-dashboard/class/40885/assignment/problems/31046?navref=cl_tt_nv
public class SumAllNodesTree {
	/**
	 * Definition for binary tree
	 * class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) {
	 *      val = x;
	 *      left=null;
	 *      right=null;
	 *     }
	 * }
	 */
// Given the root of a binary tree A. Return the sum of all the nodes of the binary tree.
	public int sumNodes(TreeNode root) {
		if(root==null) return 0;
		return sumNodes(root.left) + sumNodes(root.right) + root.data;
	}
	public int sumScalersol(TreeNode A){
        if(A == null){
            return 0;
        }
        return A.data + sumScalersol(A.left) + sumScalersol(A.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
