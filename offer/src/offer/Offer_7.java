package offer;

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
		if(pre==null||in==null||in.length!=pre.length) {
			return null;
		}
		for(int i=0;i<in.length;i++) {
			index.put(in[i], i);
		}
		
		return reConstruction(pre,0,pre.length-1,0);
	}
	private TreeNode reConstruction(int[] pre, int preL,int preR,int inL) {
		if(preL>preR)
			return null;
		TreeNode root=new TreeNode(pre[preL]);
		int inIndex=index.get(root.data);
		int leftSize=inIndex-inL;
		root.left=reConstruction(pre,preL+1,preL+leftSize,inL);
		root.right=reConstruction(pre,preL+leftSize+1,preR,leftSize+inL+1);
		return root;
		
	}
	public void printTree(TreeNode root) {
		if(root!=null) {
			printTree(root.left);
			System.out.println(root.data+" ");
			printTree(root.right);
		}
	}

	public static void main(String[] args) {
		Offer_7 offer=new Offer_7();
		int [] preorder = {3,9,20,15,7};
	    int[] inorder =  {9,3,15,20,7};
	    TreeNode root=offer.reConstruction(preorder, inorder);
	    offer.printTree(root);

	}

}
