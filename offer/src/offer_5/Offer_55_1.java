package offer_5;
//返回二叉树的深度
public class Offer_55_1 {
	 public int TreeDepth(TreeNode root) {
	        return root==null?0:Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
