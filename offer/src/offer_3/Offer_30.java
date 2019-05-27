package offer_3;
//°üº¬minº¯ÊýµÄÕ»
import java.util.Stack;
public class Offer_30 {
private  Stack<Integer> dataStack=new Stack<>();
private Stack<Integer> minStack=new Stack<>();

	public void  push(int node) {
		dataStack.push(node);
		minStack.push(minStack.isEmpty()?node:Math.min(minStack.peek(), node));
	}
	public void pop() {
		dataStack.pop();
		minStack.pop();
	}
	public int top()
	{
		return dataStack.peek();
		
	}
	public int mindata() {
		return minStack.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
