package offer_4;
//连续子数组的的最大和
public class Offer_42 {
	 private int SumOfDigit=Integer.MIN_VALUE;
	    public int FindGreatestSumOfSubArray(int[] array) {
	        if(array.length<=0)
	            return 0;
	         int sum=0;
	        for(int a:array){
	             sum=sum<=0?a:sum+a;
	            SumOfDigit=Math.max(sum,SumOfDigit);
	        }
	        return SumOfDigit;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
