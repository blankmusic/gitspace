package fortest;

import java.util.BitSet;

public class Test {
public  int sum(int i) {
	  int s=0;
	  do {
		   s+=i%10;//i��λ����
	  }while((i=i/10)>0);
	  return s;
  }

//����������ֵ
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
 * ���ӣ�https://www.nowcoder.com/questionTerminal/6aa9e04fc3794f68acf8778237ba065b
��Դ��ţ����

*˵��˼·�����p�ǳ�������ôp=2^x * 3^y * 5^z��ôֻҪ����x,y,z��ͬ��ֵ���ܵõ���ͬ�ĳ�����
*���Ҫ˳���ҳ�������Ҫ֪�����漸���أ�fei���㣨hua����
*�����κγ���p����һ����ô2*p,3*p,5*p���ǳ���������2*p<3*p<5*p
*���������p<q, ��ô2*p<2*q,3*p<3*q,5*p<5*q����˵˵
*�㷨˼�룺    ����1����С�ĳ�������ô��1��ʼ����2*1��3*1��5*1�����бȽ�
*���ó���С�ľ���1����һ��������Ҳ����2*1��    ���ʱ�򣬶���һ��������2����
*Ҳ���ֶ���3�����ԱȽϵĳ�����2*2��3*2��5*2�����ʱ��Ͱ�֮ǰ��1��
*���ɵĳ����͡�2�����ɵĳ����ӽ���Ҳ����(3*1,5*1,2*2��3*2��5*2)���бȽϣ�
*�ҳ���С�ġ����������ѭ����ȥ�ͻᷢ�֣�ÿ��ѡ����һ���������ó����ֻ�����3���µĳ������бȽϡ�
*    ����ı�������ҲӦ���ܽ����������������Թ������ַ������������Թ�ֻ��ҡͷ�ɡ�����˵һ��O��n�����㷨��  
*      ��������أ�fei���㣨hua���У���Ȼ��p<q, ��ô2*p<2*q����ô���ҡ���ǰ�����С������û��ѡ�ϣ�
*      ����������µĳ���һ���ȡ��ҡ���ɣ���ô���2���ɵĳ���һ�����ҳ�2�Ĵ�ɣ���ô����ѡ��֮������л���ѡ�ϡ�
*      ��ʵÿ������ֻ�ñȽ�3���������ڳ�2����С���������ڳ�3����С���������ڳ�5����С������Ҳ���ǱȽ�(2*x , 3*y, 5*z) 
*      ��x>=y>=z�ģ�
*�ص�˵˵���������p�����ã�int p[] = new int[] { 0, 0, 0 }; p[0]��ʾ��С���ڳ�2�Ƚ���������a�еġ�λ�á��� */

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
		
		
		
		BitSet s1=new BitSet(256);//Ĭ�ϳ�ʼ��false
		System.out.println(s1.get(5));
		System.out.println(s1.get(256));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
