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
	public ListNode deleteNode(ListNode head,ListNode tobeDelete) {
		if(head==null||tobeDelete==null){
			return null;
		}
		if(tobeDelete.next!=null)
		{
			ListNode node=tobeDelete.next;
			tobeDelete.val=node.val;
			tobeDelete.next=node.next;
			
		}else {
			if(head.next==tobeDelete)
				head=null;
			else {
				
				ListNode cur=head;
				while(cur.next!=tobeDelete)
					cur=cur.next;
				cur.next=null;
				
			}
		}
		return head;
		
		
	}
	//删除链表中的重复节点
	 public ListNode deleteDuplication(ListNode pHead)
	    {



	if (pHead == null || pHead.next == null) { // 只有0个或1个结点，则返回
	            return pHead;
	        }
	        if (pHead.val == pHead.next.val) { // 当前结点是重复结点
	            ListNode pNode = pHead.next;
	            while (pNode != null && pNode.val == pHead.val) {
	                // 跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
	                pNode = pNode.next;
	            }
	            return deleteDuplication(pNode); // 从第一个与当前结点不同的结点开始递归
	        } else { // 当前结点不是重复结点
	            pHead.next = deleteDuplication(pHead.next); // 保留当前结点，从下一个结点开始递归
	            return pHead;
	        }
	    }

	//保留重复节点中的一个
	 public ListNode deleteDup(ListNode head) 
	 {
		 
		 if(head==null||head.next==null)
			 return head;
		 ListNode nexth=head.next;
		 if(head.val==head.next.val) {
			 head.val=nexth.next.val;
			 head.next=nexth.next;
			 return deleteDup(nexth); 
		 }else {
			 head.next=deleteDup(head.next);
			 return head;
			 
		 }
		 
		 
	 }
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
