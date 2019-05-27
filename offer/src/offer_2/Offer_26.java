package offer_2;

class TreeNode{
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode(int data){
		this.data=data;
	}
}

//树的子节点
public class Offer_26 {
    //递归法
	public boolean hasSubTree(TreeNode root,TreeNode sub) {
		if(root==null||sub==null)
			return false;
		return isSubOfRoot(root,sub)||hasSubTree(root.left,sub)||hasSubTree(root.right,sub);
		
	}
	private boolean isSubOfRoot(TreeNode root,TreeNode sub) {
		if(root==null)
			return false;
		if(sub==null)
			return true;
		if(root.data!=sub.data)
			return false;
		return isSubOfRoot(root.left,sub.left)&&isSubOfRoot(root.right,sub.right);
		
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
