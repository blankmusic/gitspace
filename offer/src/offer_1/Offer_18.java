package offer_1;

class ListNode{
	
	ListNode next;
	int val;
	ListNode(int val){
		this.val=val;
	}
	
}
public class Offer_18 {
	//ɾ��������ĳ���ڵ�
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
	//ɾ�������е��ظ��ڵ�
	 public ListNode deleteDuplication(ListNode pHead)
	    {



	if (pHead == null || pHead.next == null) { // ֻ��0����1����㣬�򷵻�
	            return pHead;
	        }
	        if (pHead.val == pHead.next.val) { // ��ǰ������ظ����
	            ListNode pNode = pHead.next;
	            while (pNode != null && pNode.val == pHead.val) {
	                // ����ֵ�뵱ǰ�����ͬ��ȫ�����,�ҵ���һ���뵱ǰ��㲻ͬ�Ľ��
	                pNode = pNode.next;
	            }
	            return deleteDuplication(pNode); // �ӵ�һ���뵱ǰ��㲻ͬ�Ľ�㿪ʼ�ݹ�
	        } else { // ��ǰ��㲻���ظ����
	            pHead.next = deleteDuplication(pHead.next); // ������ǰ��㣬����һ����㿪ʼ�ݹ�
	            return pHead;
	        }
	    }

	//�����ظ��ڵ��е�һ��
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
