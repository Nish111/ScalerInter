package tree211222;
// https://www.scaler.com/academy/mentee-dashboard/class/40885/assignment/problems/11755/submissions
public class NodesInTree {
// You are given the root node of a binary tree A. You have to find the number of nodes in this tree.
	public int total_nodes(TreeNode root) {
		if(root==null) return 0;
		return total_nodes(root.left) + total_nodes(root.right) + 1;
	}
	public int dfsScalerSol(TreeNode cur){
        if(cur == null) return 0;
        return 1 + dfsScalerSol(cur.left) + dfsScalerSol(cur.right);
    }
    public int solveScalerSol(TreeNode A) {
        return dfsScalerSol(A);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
