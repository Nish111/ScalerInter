package tree211222;

public class Traversal {

	public void traversePreOrder(TreeNode root) {
		if(root == null) return;
		System.out.println(root.data);
		traversePreOrder(root.left);
		traversePreOrder(root.right);
	}
	public void traverseInOrder(TreeNode root) {
		if(root == null) return;
		traverseInOrder(root.left);
		System.out.println(root.data);
		traverseInOrder(root.right);
	}
	public void traversePostOrder(TreeNode root) {
		if(root == null) return;
		traversePostOrder(root.left);
		traversePostOrder(root.right);
		System.out.println(root.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
