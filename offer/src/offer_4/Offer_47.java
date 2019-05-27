package offer_4;
//找到矩阵中和最大的路径 从左上角开始 只能往右或往下移动
public class Offer_47 {
	public int getMost(int[][] values) {
	    if (values == null || values.length == 0 || values[0].length == 0)
	        return 0;//验证矩阵的有效性
	    int n = values[0].length;//取矩阵的列数
	    int[] dp = new int[n];//动态规划矩阵 按列数
	    for (int[] value : values) {//铵行遍历
	        dp[0] += value[0];//每一行的第一个元素
	        for (int i = 1; i < n; i++)//遍历党的行
	            dp[i] = Math.max(dp[i], dp[i - 1]) + value[i];
	    }
	    return dp[n - 1];
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
