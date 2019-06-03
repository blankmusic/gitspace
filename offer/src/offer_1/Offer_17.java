package offer_1;
//打印从1到最大的n位数
//因为数值可能会非常大所以不用int用char
//使用回溯算法
public class Offer_17 {
	public void print1ToMaxOfDigits(int n){
	if(n<=0)
		return ;
		char[] number=new char[n];
		printNumber(number,0);
	
	}
	public void printNumber(char[] number,int digit){
	
		if(digit==number.length){
			printNum(number);
		       return;
	}
		for(int i=0;i<10;i++){
		
			number[digit]=(char)(i+'0');
			printNumber(number,digit+1);
		}
	
	}
	public void printNum(char[] number){
	
		int index=0;
		
		while(index<number.length&&number[index]==0)
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
