package tree211222;
// https://www.scaler.com/academy/mentee-dashboard/class/40885/homework/problems/11878/?navref=cl_pb_nv_tb
public class SumLeftLeaves {
// Given a binary tree, find and return the sum of node value of all left leaves in it.
	public int solve(TreeNode A) {
	        if(A==null) return 0;
	        int count=0;
	        if(A.left != null && A.left.left == null && A.left.right == null) {
	        	count=A.left.data;
	        }
			return solve(A.left) + solve(A.right) + count;
	}
	 public int helperScalerSol(TreeNode A){
	        if(A == null){
	            return 0;
	        }
	        int ans = 0;
	        if(A.left != null && A.left.left == null && A.left.right == null){
	            ans += A.left.data;
	        }
	        else{
	            ans += helperScalerSol(A.left);
	        }
	        ans += helperScalerSol(A.right);
	        return ans;
	    }
	    public int solveScalerSol(TreeNode A) {
	        return helperScalerSol(A);
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
		SumLeftLeaves sll = new SumLeftLeaves();
		System.out.println(sll.solve(four));
	}

}
