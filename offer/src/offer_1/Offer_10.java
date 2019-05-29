package offer_1;
//Fibonacci数列系列问题
import java.util.Arrays;
public class Offer_10 {
	/*因为递归求解会重复计算子问题，但并不保存结果，对于需要的重复利用的元素
	  使用动态规划避免重复求解
	 * //空间复杂度O(N) 
	 public int Fibonacci(int n) { 
	 if(n<=1) return n; 
	 int [] fib=new int[n+1]; 
	 for(int i=2;i<=n;i++) { fib[i]=fib[i-1]+fib[i-2]; } 
	 return fib[n];
	 * } //空间复杂度1 //考虑第i项只与第i-1和i-2项有关，因此只要存储前两项的值就能求解第i项， 
	 //从而降低空间复杂度 
	 public int Fibonacci1(int n) { 
	 if(n<=1) return n;
	 int pre2=0;
	 int pre1=1; 
	 int fib=0;
	 * for(int i=2;i<=n;i++) { fib=pre2+pre1; pre2=pre1; pre1=fib; }
	 return fib;
	 * 
	 * }
	 */
	//由于待求解的n小于40，因此可以将前40项的结果先进行计算，
	//之后就能以O(1)的时间复杂度得到第n项的值了
	private int[] fib=new int[40];
	public Offer_10() {
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<fib.length;i++)
			fib[i]=fib[i-1]+fib[i-2];
		
	}
	public int Fibonacci(int n) {
		return fib[n];
	}
	//矩形覆盖问题
	/*
	我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
	请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩
          形，总共有多少种方法？
	
	*/
	public int RectCover(int n) {
		if(n<=2)
		   return n;
		int pre2=1;
		int pre1=2;
		int result=0;
		for(int i=3;i<=n;i++)
		{  result=pre2+pre1;
		   pre2=pre1;
		   pre1=result;
		}
		return result;
		
	}
	//跳台阶问题
	/*
	一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。*/
	public int JumpFloor(int n) {
		if(n<=2)
		   return n;
		int pre2=1;
		int pre1=2;
		int result=0;
		for(int i=3;i<=n;i++)
		{  result=pre2+pre1;
		   pre2=pre1;
		   pre1=result;
		}
		return result;
	}
	//变态跳台阶
	/*
	一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共有多少
        种跳法。*/
	//动态规划的方法
	public int JumpFloorI(int target) {
	        int [] dp=new int[target];
		Arrays.fill(dp,1);
		for(int i=1;i<target;i++)
			for(int j=0;j<i;j++)
				dp[i]+=dp[j];
	}
	//变态跳台阶
	//数学推算法
	public int JummpFloorII(int target) {
		
		return (int)Math.pow(2,target-1);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
