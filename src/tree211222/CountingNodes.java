package tree211222;
// https://www.scaler.com/academy/mentee-dashboard/class/40885/homework/problems/8719/?navref=cl_pb_nv_tb
public class CountingNodes {
// Given the root of a tree A with each node having a certain value, find the count of nodes with more value than all its ancestor.
	public int solveBranches(TreeNode A) {
        if(A==null) return 0;
		int count = 0;
		if(A.left != null) {
			if(A.left.data>A.data) count++;
			else A.left.data = A.data;
		}
		if(A.right != null) {
			if(A.right.data>A.data) count++;
			else A.right.data = A.data;
		}
		return count + solveBranches(A.left) + solveBranches(A.right);
    }
    public int solve(TreeNode A){
        return solveBranches(A)+1;
    }
    int dfsScalersol(TreeNode cur, int mx){
        if(cur == null){
            return 0;
        }
        int ans = dfsScalersol(cur.left, Math.max(mx, cur.data)) + dfsScalersol(cur.right, Math.max(mx, cur.data));
        if(cur.data > mx){
            ++ans;
        }
        return ans;
    }
    public int solveScalerSol(TreeNode A) {
        return dfsScalersol(A, 0);
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
		CountingNodes cn = new CountingNodes();
		System.out.println(cn.solve(four)); // 3
		/*
    4
   / \
  5   2
     / \
    3   6 -> should give 3 as nodes 4,5,6
		 * 
		 */
		
	}

}
