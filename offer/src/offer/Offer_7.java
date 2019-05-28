package offer;
//根据二叉树的前序遍历和中序遍历的结果。重建出该二叉树
//，假设输入的前序遍历和中序遍历的结果中都不含重复的数字
//根据前序和中序遍历的结果特性 
//前序的第一个元素一定是根节点 根节点后面是左子树的节点 左子树遍历完是右子树
//中序遍历 根节点位于中心
//根据前序找中序中的根节点 根据根节点划分前序中的左右子树 再找根节点 再划分
//递归的过程

import java.util.HashMap;
import java.util.Map;

class TreeNode{
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode(int data){
		this.data=data;
	}
}
public class Offer_7 {
	
	private Map<Integer,Integer> index=new HashMap<>();
	
	public TreeNode reConstruction(int [] pre,int[] in) {
		if(pre==null||in==null)
			return pre;
		for(int i=0;i<in.length;i++){
		    index.put(in[i],i);
		}
		return reConstruction(pre,0,pre.length-1,0);
	}
	private TreeNode reConstruction(int[] pre, int preL,int preR,int inL) {
		if(preL>preR)
			return null;
		TreeNode root=new TreeNode(pre[preL]);
		int inIn=index.get(root.data);
		int leftsize=inIn-inl;
		root.left=reConstruction(pre,preL+1,preL+leftSize,inL);
		root.right=reConstruction(pre,prelL+leftSize,PreR+1,inIn+1)
		reurn root;
	}
	public void printTree(TreeNode root) {
		if(root==null)
			return;
		printTree(root.left);
		System.out.println(root.data);
		printTree(root.right);
	}
//测试
	public static void main(String[] args) {
		Offer_7 offer=new Offer_7();
		int [] preorder = {3,9,20,15,7};
	    int[] inorder =  {9,3,15,20,7};
	    TreeNode root=offer.reConstruction(preorder, inorder);
	    offer.printTree(root);

	}

}
