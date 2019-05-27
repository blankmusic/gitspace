package offer_5;

public class Offer_55_2 {
	  boolean isBalanced=true;
	    public boolean IsBalanced_Solution(TreeNode root) {
	        height(root);
	        return isBalanced;
	    }
	    public int height(TreeNode root){
	        if(root==null||!isBalanced)
	            return 0;
	         int left = height(root.left);
	    int right = height(root.right);
	    if (Math.abs(left - right) > 1)
	        isBalanced = false;
	    return 1 + Math.max(left, right);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
