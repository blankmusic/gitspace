package offer_2;
//�ж�һ�����Ƿ�Ϊ�ԳƵ�
public class Offer_28 {
public boolean isSymmetric(TreeNode root) {
	
	 if (root == null)
	        return true;
	return symm(root.left,root.right);
	
}
public boolean symm(TreeNode left,TreeNode right)
{
	if (left == null && right == null)
        return true;
    if (left == null || right == null)
        return false;
	if(left.data!=right.data)
		return false;
	return symm(left.left,right.right)&&symm(left.right,right.left);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
