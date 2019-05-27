package offer_6;
//写一个函数，求两个整数之和，要求在函数体内
//不得使用四则运算符号
//int c=(a&b)<<1
public class Offer_65 {
    
	public int Add(int num1,int num2) {
		
		return num2==0?num1:Add(num1^num2, (num1&num2)<<1);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
