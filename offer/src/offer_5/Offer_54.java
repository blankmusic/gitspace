package offer_5;
//二叉查找树的第k个节点
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Offer_54 {
	 private int cnt=0;
	   private TreeNode ret=null;
	    TreeNode KthNode(TreeNode pRoot, int k)
	    {
	      inorder(pRoot,k);
	        return ret;
	    }
	    private void inorder(TreeNode root,int k){
	        if(root==null||cnt>=k)
	            return;
	        inorder(root.left,k);
	        cnt++;
	        if(cnt==k)
	            ret=root;
	        inorder(root.right,k);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
