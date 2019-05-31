package offer_1;
//剪绳子
public class Offer_14 {
	//贪心算法
	public int solution(int n) {
		
		if(n<2)
			return 0;
		if(n==2)
			return 1;
		if(n==3)
			return 2;
		int timesOf3=n/3;
		if(n-timesOf3*3==1)
			timesOf3--;
		int timesOf2=(n-timesOf3*3)/2;
		return (int)(Math.pow(2, timesOf2))*(int)(Math.pow(3,timesOf3));
	}
	
	//动态规划的算法
	//要求n 分m段的最大乘积。可先求n-1,n-2....乘积最大的分段方式
	//i是一整段的长度
	//j是分段的每一段的长度
	public int solution2(int n) {
		 
		int dp=new int[n+1];
		dp1[1]=1;
		for(int i=2;i<=n;i++)
			for(int j=1;j<i;j++)
				dp[i]=Math.max(dp[i],Math.max(dp[j]*(i-j),j*(i-j)));
		return dp[n];
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
