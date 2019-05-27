package offer_3;
import java.util.ArrayList;
public class Offer_34 {
 private ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
 public ArrayList<ArrayList<Integer>> sumT(TreeNode root,int target){
	 if(root==null)
		 return null;
	 sumTree(root,target,new ArrayList<Integer>() );
	 return ret;
 }

 private void sumTree(TreeNode root,int target,ArrayList<Integer> path) {
	 
	 if(root==null)
		 return;
	 path.add(root.val);
	 target-=root.val;
	 if(target==0&&root.left==null&&root.right==null)
		 ret.add(new ArrayList<>(path));
	 else {
		 sumTree(root.left,target,path);
		 sumTree(root.right,target,path);
	 }
	 path.remove(path.size()-1);
	 
 }
 
 
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
