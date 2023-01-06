package tree211222;

public class TreeRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
	}

}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
