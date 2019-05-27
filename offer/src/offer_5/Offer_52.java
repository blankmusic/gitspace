package offer_5;
//输入两个链表，找出它们的第一个公共结点。
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Offer_52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	
    ListNode p1=pHead1;
    ListNode p2=pHead2;
    while(p1!=p2){
        p1=p1==null?pHead2:p1.next;
        p2=p2==null?pHead1:p2.next;
        
    }
    return p1;
    	
    	
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
