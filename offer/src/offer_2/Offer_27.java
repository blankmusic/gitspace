package offer_2;
//�õ��������ľ���
public class Offer_27 {
public void Mirror(TreeNode root) {
	if(root==null)
		return ;
	swap(root.left,root.right);
	 Mirror(root.right);
	 Mirror(root.left);
	
}
public void swap(TreeNode t1,TreeNode t2) {
	TreeNode tmp=t2;
	t2=t1;
	t1=tmp;
	
}
	
	
	
	public static void main(String[] args) {
		

	}

}
