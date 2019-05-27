package offer_3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class	TreeNode{
	TreeNode right=null;
	TreeNode left=null;
	int val=0;
	TreeNode(int val){
		this.val=val;
	}	
}

//从上到下按层打印二叉树
public class Offer_32_1 {
	/*public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	    Queue<TreeNode> queue = new LinkedList<>();
	    ArrayList<Integer> ret = new ArrayList<>();
	    queue.add(root);
	    while (!queue.isEmpty()) {
	        int cnt = queue.size();
	        while (cnt-- > 0) {
	            TreeNode t = queue.poll();
	            if (t == null)
	                continue;
	            ret.add(t.val);
	            queue.add(t.left);
	            queue.add(t.right);
	        }
	    }
	    return ret;
	}*/
	public void PrintFromTopToBottom(TreeNode root) {
	    Queue<TreeNode> queue = new LinkedList<>();
	    ArrayList<Integer> ret = new ArrayList<>();
	    queue.add(root);
	    while (!queue.isEmpty()) {
	        int cnt = queue.size();
	        System.out.println();
	        while (cnt-- > 0) {
	            TreeNode t = queue.poll();
	            if (t == null)
	                continue;
	            ret.add(t.val);
	            queue.add(t.left);
	            queue.add(t.right);
	            System.out.print(t.val);
	        }
	    }
	 
	}

	public static void main(String[] args) {
		Offer_32_1 offer=new Offer_32_1();
		TreeNode root=new TreeNode(1);
		TreeNode left1=new TreeNode(2);
		TreeNode right1=new TreeNode(3);
		TreeNode left2=new TreeNode(2);
		TreeNode right2=new TreeNode(3);
		TreeNode left3=new TreeNode(2);
		TreeNode right3=new TreeNode(3);
		root.left=left1;
		root.right=right1;
		left1.left=left2;
		left1.right=right2;
		right1.left=left3;
		right1.right=right3;
//		ArrayList<Integer>ret=offer.PrintFromTopToBottom(root);
//		for(int n:ret)
//		System.out.print(n);
	   offer.PrintFromTopToBottom(root);	
	
	}

}
