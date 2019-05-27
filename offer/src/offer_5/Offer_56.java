package offer_5;
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
//diff &= -diff 得到出 diff 最右侧不为 0 的位，也就是不存在重复的两个元素在位级表示上最右侧不同的那一位，
//利用这一位就可以将两个元素区分开来。
public class Offer_56 {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        int diff=0;//零异或任何一个数都为这个数本身
	        for(int arr:array)
	            diff^=arr;
	        diff&=-diff;//z得到第一个不同的位数根据这个位数为diff或不为区分两个只出现一次的树
	        for(int arr:array){
	            if((arr&diff)==0)//位数不相同
	                num1[0]^=arr;
	            else 
	                num2[0]^=arr;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
