package offer_2;
//合并两个排序的链表
public class Offer_25 {

	//递归法
	
	 public ListNode merge(ListNode list1,ListNode list2) {
		 
		 if(list1==null)
			 return list2;
		 if(list2==null)
			 return list1;
		 if(list1.val<=list2.val) {
			 merge(list1.next,list2);
			 return list1;
		 }else {
			 merge(list1,list2.next);
			 return list2;
		 }
	 }
	 //迭代法
	 public ListNode Merge(ListNode list1,ListNode list2) {
		ListNode head=new ListNode(-1);
		ListNode cur=head;
		while(cur!=null) {
			if(list1.val<=list2.val)
			{
				cur.next=list1;
				list1=list1.next;
			}
			else {
				cur.next=list2;
				list2=list2.next;
			}
			cur=cur.next;
		}
		if(list1!=null)
			cur.next=list1;
		if(list2!=null)
			cur.next=list2;
		return head.next;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
