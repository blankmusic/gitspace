package offer_3;


//ÐòÁÐ»¯¶þ²æÊ÷
public class Offer_37 {

	private String deserializeStr;
	public String serilize(TreeNode node) {
		if(node==null)
			return "#";
		return node.val+" "+serilize(node.left)+" "+serilize(node.right);
		
		
	}
	public TreeNode deserial(String str) {
      deserializeStr=str;
      return dese();
	}
	private   TreeNode dese() {
		if(deserializeStr.length()==0)
			return null;
		int index=deserializeStr.indexOf(" ");
		String node=index==-1?deserializeStr:deserializeStr.substring(0, index);
		deserializeStr=index==-1?"":deserializeStr.substring(index+1);
		if(node=="#")
			return null;
		TreeNode t=new TreeNode(Integer.valueOf(node));
		t.left=dese();
		t.right=dese();
		return t;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
