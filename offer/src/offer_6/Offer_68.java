package offer_6;

//���������ڵ����͹����ڵ�
//�������1 ��������� 2 һ��Ķ����� 3 ˫��ڵ�Ķ����� �൱���� �������������ཻ�ĵ�һ���ڵ�
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
