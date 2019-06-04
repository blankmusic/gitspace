package offer_1;

class ListNode{
	
	ListNode next;
	int val;
	ListNode(int val){
		this.val=val;
	}
	
}
public class Offer_18 {
	//删除链表中某个节点
	//时间复杂度为O(1)
       //分为两种情况 一种是被删除的节点是尾节点
	//一种是一般节点非尾部
	public ListNode deleteNode(ListNode head,ListNode tobeDelete) {
		if(head==null||tobeDelete==null)
			return head;
		if(tobeDelte.next!=null){
		       ListNode node=tobeDelete.next;
			tobeDelete.val=node.val;
			tobeDelete.next=node.next;
		
		}else{if(head==tobeDelete)
			head=null;
		      ListNode cur=head;
		      while(cur.next!=tobeDelete)
			      cur=cur.next;
		      cur.next=null;
		}
		
		return head;
		
		
	}
	//删除链表中的重复节点
	 public ListNode deleteDuplication(ListNode pHead)
	    {
		 if(pHead==null||pHead.next==null)
			 return pHead;
		 //如果当前节点是重复节点
		 if(pHead.val==pHead.next.val){
		  
			 ListNode node=pHead;
			 while(node.val==pHead.val&&node!=null)
				 node=node.next;
			 return deleteDuplication(node);
		 }else{
		     pHead.next=deleteDuplication(pHead.next);
			 return pHead;
		 }



	    }

	
		 
		 
	 }
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
