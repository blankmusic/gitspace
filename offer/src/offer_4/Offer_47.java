package offer_4;
//�ҵ������к�����·�� �����Ͻǿ�ʼ ֻ�����һ������ƶ�
public class Offer_47 {
	public int getMost(int[][] values) {
	    if (values == null || values.length == 0 || values[0].length == 0)
	        return 0;//��֤�������Ч��
	    int n = values[0].length;//ȡ���������
	    int[] dp = new int[n];//��̬�滮���� ������
	    for (int[] value : values) {//��б���
	        dp[0] += value[0];//ÿһ�еĵ�һ��Ԫ��
	        for (int i = 1; i < n; i++)//����������
	            dp[i] = Math.max(dp[i], dp[i - 1]) + value[i];
	    }
	    return dp[n - 1];
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
