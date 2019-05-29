package offer;
//使用两个栈实现队列
import java.util.Stack;

public class Offer_9 {
Stack<Integer> in=new Stack<>();
Stack<Integer> out=new Stack<>();

public void push(int node) {
	in.push(node);
}
public int pop() throws Exception{
	if(out.isEmpty()){
	while(!in.isEmpty()){
	 out.push(in.pop());
	}
	}
	if(out.isEmpty()){
	throw new Exception("队列为空")
	}
	 return out.pop();
}
	
	
	//测试
	public static void main(String[] args) throws Exception {
		Offer_9 offer=new Offer_9();
		offer.push(1);
		offer.push(2);
		offer.push(3);
	System.out.println(offer.pop());
	System.out.println(offer.pop());
	System.out.println(offer.pop());
	}

}
