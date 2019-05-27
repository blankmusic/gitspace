package offer_6;

//树中两个节点的最低公共节点
//三种情况1 二叉查找数 2 一般的二叉树 3 双向节点的二叉树 相当于求 两个单向链表相交的第一个节点
class TreeNode{
	
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode (int val){
		this.val=val;
		
	}
	
}
public class Offer_68 {
	//1
	public TreeNode nearestR(TreeNode root) {
		
		if(root==null||root==root.left||root==root.right) 
			return root;
		if(root.val>root.left.val&&root.val>root.right.val)
			nearestR(root.right);
		if(root.val<root.left.val&&root.val<root.right.val)
			nearestR(root.left);
		return root;
	}
	
	//2
	public TreeNode nearst(TreeNode root) {
		if(root==null||root==root.left||root==root.right)
			return root;
		TreeNode left=nearst(root.left);
	    TreeNode right=nearst(root.right);
		return left==null?right:right==null?left:root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
