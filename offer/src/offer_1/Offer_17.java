package offer_1;
//打印从1到最大的n位数
//因为数值可能会非常大所以不用int用char
public class Offer_17 {
	
	
	public void  print1ToMax(int n) {
		if(n<=0)
			return;
		char[] number=new char[n];
		print1ToMax(number,0);
		
	}
	private void print1ToMax(char[] number,int digit) {
		if(digit==number.length)
		{
			printNumber(number);
			return;
		}
		for(int i=0;i<10;i++)
		{
			number[digit]=(char)(i+'0');
			print1ToMax(number, digit+1);
		}
	}
	private void printNumber(char[] number) {
		int index=0;
		while(index<number.length&&number[index]=='0')
			index++;
		while(index<number.length)
			 System.out.print(number[index++]);
	    System.out.println();
	}
 
	public static void main(String[] args) {
		Offer_17 offer=new Offer_17();
		offer.print1ToMax(3);

	}

}
