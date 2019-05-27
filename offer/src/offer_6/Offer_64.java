package offer_6;
//求1+2+3+...+n
//不能使用乘除法、for while if else switch case等关键字及条件判断语句A?B:C
//使用递归需要使用条件语句 这里不能用if语句
//&&具有短路特性  将if条件取反  第二部分为递归的主体部分
public class Offer_64 {
	public int Sum_Solution(int n) {
		int sum=n;
		boolean b=(n>0)&&((sum+=Sum_Solution(n-1))>0);
		return sum;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
