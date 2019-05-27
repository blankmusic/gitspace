package offer;



public class Offer_8 {
	public TreeLinkNode getNext(TreeLinkNode pNode) {
		
		if(pNode.right!=null) {
			TreeLinkNode node=pNode.right;
			while(node.left!=null)
				node=node.left;
			return node;
		}else {
			while(pNode.next!=null) {
				TreeLinkNode parent=pNode.next;
				if(parent.left==pNode)
					return parent;
				pNode=pNode.next;
			}
			
			
		}
		return null;
		
		
	}

	public static void main(String[] args) {
	
		
	}

}
