package fortest;

import java.util.BitSet;

public class Test {
public  int sum(int i) {
	  int s=0;
	  do {
		   s+=i%10;//i的位数和
	  }while((i=i/10)>0);
	  return s;
  }

//求礼物的最大值
public int getMost(int[][] values) {
	
	if(values==null||values.length==0||values[0].length==0)
		return 0;
	int n=values[0].length;
	int[] dp=new int[n];
	for(int[] value:values) {
		dp[0]+=value[0];
		for(int i=1;i<n;i++) {
			dp[i]=Math.max(dp[i], dp[i-1])+value[i];
		}
	}
	return dp[n-1];
	
	
}



/*
 * 链接：https://www.nowcoder.com/questionTerminal/6aa9e04fc3794f68acf8778237ba065b
来源：牛客网

*说下思路，如果p是丑数，那么p=2^x * 3^y * 5^z那么只要赋予x,y,z不同的值就能得到不同的丑数。
*如果要顺序找出丑数，要知道下面几个特（fei）点（hua）。
*对于任何丑数p：（一）那么2*p,3*p,5*p都是丑数，并且2*p<3*p<5*p
*（二）如果p<q, 那么2*p<2*q,3*p<3*q,5*p<5*q现在说说
*算法思想：    由于1是最小的丑数，那么从1开始，把2*1，3*1，5*1，进行比较
*，得出最小的就是1的下一个丑数，也就是2*1，    这个时候，多了一个丑数‘2’，
*也就又多了3个可以比较的丑数，2*2，3*2，5*2，这个时候就把之前‘1’
*生成的丑数和‘2’生成的丑数加进来也就是(3*1,5*1,2*2，3*2，5*2)进行比较，
*找出最小的。。。。如此循环下去就会发现，每次选进来一个丑数，该丑数又会生成3个新的丑数进行比较。
*    上面的暴力方法也应该能解决，但是如果在面试官用这种方法，估计面试官只会摇头吧。下面说一个O（n）的算法。  
*      在上面的特（fei）点（hua）中，既然有p<q, 那么2*p<2*q，那么“我”在前面比你小的数都没被选上，
*      你后面生成新的丑数一定比“我”大吧，那么你乘2生成的丑数一定比我乘2的大吧，那么在我选上之后你才有机会选上。
*      其实每次我们只用比较3个数：用于乘2的最小的数、用于乘3的最小的数，用于乘5的最小的数。也就是比较(2*x , 3*y, 5*z) 
*      ，x>=y>=z的，
*重点说说下面代码中p的作用：int p[] = new int[] { 0, 0, 0 }; p[0]表示最小用于乘2比较数在数组a中的【位置】。 */

public void print(int i) {
	
	System.out.println(i);
}


public void FindNumsAppearOnce(int[] nums, int num1[], int num2[]) {
    int diff = 0;
    for (int num : nums)
        diff ^= num;
    diff &= -diff;
    for (int num : nums) {
        if ((num & diff) == 0)
            num1[0] ^= num;
        else
            num2[0] ^= num;
    }
    System.out.println(num1[0]+":"+num2[0]);
}


	public static void main(String[] args) {
	Test offer=new Test();
//	offer.print(offer.sum(0));
//	offer.print(offer.sum(2));
//	offer.print(offer.sum(45));
//	offer.print(offer.sum(58));
//		int[][] a= {{1,2,3},{4,5,6}};
//		for(int [] n:a) {
//			System.out.println(n[2]);
//		}
		int[]a= {1,1,2,2,3,3,4,5,4,6,7,6,8,9,8,9};
		int[] a1= new int[1];
		int[] a2= new int[1];
		offer.FindNumsAppearOnce(a,a1,a2);
		System.out.println("f="+(-9&9));
		
		
		
		BitSet s1=new BitSet(256);//默认初始化false
		System.out.println(s1.get(5));
		System.out.println(s1.get(256));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
