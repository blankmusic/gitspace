package offer_6;
//股票的最大利润
//使用贪心策略 ，假设第i轮进行卖出操作，买入操作价格应该在i之前，并且价格最低
public class Offer_63 {
	 public int maxProfit(int[] prices) {
	        if(prices.length==0)
	            return 0;
	        int minp=prices[0];//定义最小并赋值为数组的第一个值
	        int maxp=0;//最大差值
	        for(int i=1;i<prices.length;i++){
	            
	            minp=Math.min(minp,prices[i]);//迭代取最小
	            maxp=Math.max(maxp,(prices[i]-minp));//迭代取最大
	            
	        }
	        return maxp;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
