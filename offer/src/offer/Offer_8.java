package offer;
//二叉树的下一个节点
//给定一个二叉树和其中的一个节点，请找出中序遍历顺序下的下一个节点并返回，注意树中的节点不仅包含左右节点
//同时包含指向父节点的指针
//此题包含两种情况 若 当前节点有右节点 则它的下一节点的最后一个左节点为当前节点的下一节点
//若 当前节点没有右节点 则当前节点的下一节点为根节点 要往上遍历
//

class TreeNode{
    TreeNode left=null;
    TreeNode right=null;
    TreeNode up=null;
	int val=0
		TreeNode(int val){
	this.val=val;
	}
}
public class Offer_8 {
	public TreeLinkNode getNext(TreeLinkNode pNode) {
	if(pNode.right!=null){
		TreeNode node=pNode.right;
		while(node.left!=null)
			node=node.left;
		return node;
	}else{
		while(pNode.up!=null){
			TreeNode node=pNode.up;
		     if(node==pNode)
			return node;
		pNode=pNode.up;
		}
		
	}
	
	return null;
	}
		

	public static void main(String[] args) {
	
		
	}

}
