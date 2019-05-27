package offer_2;
//链表中的倒数第K个节点
class ListNode{
	ListNode next;
	int val;
	ListNode(int val){
		this.val=val;
	}
}

public class Offer_22 {
	public ListNode  tailN(ListNode head,int k) {
		if(head==null||k<0)
			return null;
		ListNode p1=head;
		while(p1!=null&&k-->0)
			p1=p1.next;
		ListNode p2=head;
		if(k>0)
			return null;
		while(p1!=null) {
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
		
		
	}

	public static void main(String[] args) {
		Offer_22 offer=new Offer_22();
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		int k=2;
		System.out.print(offer.tailN(node1, k).val);
		

	}

}
