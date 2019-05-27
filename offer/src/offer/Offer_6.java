package offer;
import java.util.ArrayList;
import java.util.Stack;
//从尾到头打印链表
//有三种方法 递归  堆栈  头结点
class ListNode{
	int data;
	ListNode next=null;
	ListNode(int data){
		this.data=data;
	}
	
}

public class Offer_6 {
	//迭代法
	public void printListFromTaiToHead(ListNode listNode){
	 while(listNode!=null){
	 printListFromTailToHead(listNode.next);
	 }
		System.out.print(listNode.data);
	}
	//堆栈法
	public void printStack(ListNode listNode) {
		Stack<ListNode> s=new Stack<>();
		while(listNode!=null){
		s.push(listNode.next);
		}
		while(!s.isEmpty()){
		System.out.print(s.poll().data);
		}
		
		
	}
	//头结点的方法
	//头结点实在头插入法中使用的一个额外的节点，这个节点不存储值
	//第一个节点就是链表的第一个真正存储的节点
	public void printHeadNode(ListNode listNode) {
		
		ListNode pNode=new ListNode(-1);//头结点
		while(listNode!=null){
		    ListNode tmp=listNode.next;
			     listNode.next=pNode.nenxt;
			pNode.next=listNode;
			listNode=tmp;}
		
		pNode=pNode.next;
		while(pNode!=null){
		System.out.println(pNode.next);
		}
		
		
	}
	

	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		Offer_6 offer=new Offer_6();
        offer.printListFromTaiToHead(node1);//迭代
        System.out.println("#############");
        offer.printStack(node1);//堆栈
        System.out.println("#############");
        offer.printHeadNode(node1);//头结点

	}

}
