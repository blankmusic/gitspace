package offer_2;
//��������
public class Offer_24 {
//�ݹ鷨
	public ListNode reverseList(ListNode head) {
		
		if(head==null||head.next==null)
			return head;
		ListNode next=head.next;
		head.next=null;
		ListNode newHead=reverseList(next);
		next.next=head;
		return newHead;
		
		
	}
	//������
	public ListNode reverseList1(ListNode head) {
		ListNode pHead=new ListNode(-1);
		while(head!=null){
			ListNode tmp=head.next;
					head.next=pHead.next;
					pHead.next=head;
					head=tmp;
			
		}
		return pHead.next;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
