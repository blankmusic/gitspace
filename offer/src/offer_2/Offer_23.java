package offer_2;

public class Offer_23 {
	 public ListNode EntryNodeOfLoop(ListNode pHead)
	    {
	        if(pHead==null||pHead.next==null)
	            return null;
	       ListNode p=pHead.next;
	        ListNode p1=p;
	        ListNode p2=p.next;
	        while(p1!=p2){
	            p1=p1.next;
	            p2=p2.next.next;
	        }
	        p2=pHead;
	        while(p1!=p2)
	        {
	            p1=p1.next;
	            p2=p2.next;
	            
	        }
	        return p1;
	        
	    }
	 
	 public ListNode EntryNodeOfLope1(ListNode pHead) {
		 
		 if(pHead==null||pHead.next==null)
			 return null;
		 ListNode p1=pHead;
		 ListNode p2=pHead;
		 do {
			 p1=p1.next;
			 p2=p2.next.next;
		 }while(p1!=p2);
		 p2=pHead;
		 while(p1!=p2)
		 {
			 p1=p1.next;
			 p2=p2.next;
		 }
		 return p1;
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
