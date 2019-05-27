package offer;	
public class Test {

public TreeNode reConstructBinaryTree(int[] pre,int[] in){
		//输入合法性判断，不能为空。先序和中序的长度要一致
		if(pre==null||in==null||pre.length!=in.length)
			{return null;}
		return construct(pre,0,pre.length-1,in,0,in.length-1);
	}	
	
	
	private TreeNode construct(int[] pre,int ps,int pe,int[] in,int is,int ie){
		
		if(ps>pe) return null;
		//取前序遍历的第一数字就是根节点
		int value=pre[ps];
		//在中序遍历中寻找根节点
		int index=is;
		while(index<ie&&value!=in[index])
			index++;
		//如果在中序遍历的数组中没有找到，说明输入是不合法的，抛出异常
		if(index >ie)
			throw new RuntimeException("Invalid Input!");
		//创建当前根节点 并为根节点赋值
		TreeNode node=new TreeNode(value);
		//递归调用构建当前节点的左子树
		node.left=construct(pre,ps+1,ps+index-is,in,is,index-1);
		//递归调用构建当前节点的右子树
		node.right=construct(pre,ps+index-is+1,pe,in,index+1,ie);
		return node;
		
		
	}
	
	private void printTree(TreeNode root){
		if(root!=null){
			printTree(root.left);
			System.out.println(root.data + " ");
             printTree(root.right);
		}
	}
	 public static void main(String[] args) {
        Test test = new Test();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = test.reConstructBinaryTree(pre, in);
        test.printTree(node);
        
    }
	
}

















