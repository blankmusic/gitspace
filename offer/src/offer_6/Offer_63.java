package offer_6;
//��Ʊ���������
//ʹ��̰�Ĳ��� �������i�ֽ���������������������۸�Ӧ����i֮ǰ�����Ҽ۸����
public class Offer_63 {
	 public int maxProfit(int[] prices) {
	        if(prices.length==0)
	            return 0;
	        int minp=prices[0];//������С����ֵΪ����ĵ�һ��ֵ
	        int maxp=0;//����ֵ
	        for(int i=1;i<prices.length;i++){
	            
	            minp=Math.min(minp,prices[i]);//����ȡ��С
	            maxp=Math.max(maxp,(prices[i]-minp));//����ȡ���
	            
	        }
	        return maxp;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
