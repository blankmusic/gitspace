package offer;

import java.util.ArrayList;
import java.util.Stack;

class ListNode{
	int data;
	ListNode next=null;
	ListNode(int data){
		this.data=data;
	}
	
}

public class Offer_6 {
	//������
	public void printListFromTaiToHead(ListNode listNode){
	
		if(listNode.next!=null) {
			printListFromTaiToHead(listNode.next);
		}
		System.out.println(listNode.data);
		
	
	}
	//��ջ��
	public void printStack(ListNode listNode) {
		Stack<ListNode> stack=new Stack<>();
		while(listNode!=null) {
			stack.push(listNode);
			listNode=listNode.next;
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().data);
		}
		
	}
	//ͷ���ķ���
	//ͷ���ʵ��ͷ���뷨��ʹ�õ�һ������Ľڵ㣬����ڵ㲻�洢ֵ
	//��һ���ڵ��������ĵ�һ�������洢�Ľڵ�
	public void printHeadNode(ListNode listNode) {
		ListNode head=new ListNode(-1);
		while(listNode!=null) {
			ListNode memo=listNode.next;
			listNode.next=head.next;
			head.next=listNode;
			listNode=memo;
		}
		
		 ArrayList<Integer> ret = new ArrayList<>();
		    head = head.next;
		    while (head != null) {
		        ret.add(head.data);
		        head = head.next;
		    }
		    for(Integer a:ret) {
		    	System.out.println(a);
		    }
		
	}
	

	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		Offer_6 offer=new Offer_6();
        offer.printListFromTaiToHead(node1);//����
        System.out.println("#############");
        offer.printStack(node1);//��ջ
        System.out.println("#############");
        offer.printHeadNode(node1);//ͷ���

	}

}
