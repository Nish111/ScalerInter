package tree211222;
// https://www.scaler.com/academy/mentee-dashboard/class/40885/assignment/problems/11757/submissions
public class HeightOfTree {
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
	
	public int heightTree(TreeNode root) { // classwise -1, submitted with 0
		if(root == null) return -1;
		int leftH = heightTree(root.left);
		int rightH = heightTree(root.right);
		
		return Math.max(leftH, rightH)+1;
	}
	public int solve(TreeNode root) { // classwise -1, submitted with 0
		if(root == null) return 0;
		int leftH = solve(root.left);
		int rightH = solve(root.right);
		
		return Math.max(leftH, rightH)+1;
	}
	public int solveScalerSol(TreeNode A) {
        if(A == null)
            return 0;
        return 1 + Math.max(solveScalerSol(A.left), solveScalerSol(A.right));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
