package offer_3;
import java.util.Stack;
//栈的压入弹出序列
public class Offer_31 {

	public boolean stackpopSeq(int [] s1,int s2[]) {
		Stack<Integer> stack=new Stack<>();
		for(int n=0,m=0;n<s1.length;n++) {
			stack.push(s1[n]);
			while(stack.peek()==s2[m]) {
				stack.pop();
				m++;
			}
		}		
		return stack.isEmpty();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
