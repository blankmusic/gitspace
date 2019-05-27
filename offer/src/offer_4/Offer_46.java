package offer_4;
// 
public class Offer_46 {
//	����һ�����֣��������¹�������ַ�����1 ����ɡ�a����2 ����ɡ�b��...
//	26 ����ɡ�z����һ�������ж��ַ�����ܣ����� 12258 һ���� 5 �֣�
//	�ֱ��� abbeh��lbeh��aveh��abyh��lyh��ʵ��һ����������������һ
//	�������ж����ֲ�ͬ�ķ��뷽����
	public int numDecodings(String s) {
	    if (s == null || s.length() == 0)
	        return 0;//ȷ��������Ч��
	    int n = s.length();
	    int[] dp = new int[n + 1];
	    dp[0] = 1;
	    dp[1] = s.charAt(0) == '0' ? 0 : 1;
	    for (int i = 2; i <= n; i++) {
	        int one = Integer.valueOf(s.substring(i - 1, i));//����ҿ�
	        if (one != 0)
	            dp[i] += dp[i - 1];
	        if (s.charAt(i - 2) == '0')
	            continue;
	        int two = Integer.valueOf(s.substring(i - 2, i));
	        if (two <= 26)
	            dp[i] += dp[i - 2];
	    }
	    return dp[n];
	}
	public static void main(String[] args) {
	 String s=new String("1256");
	 Offer_46 offer=new Offer_46();
	 System.out.println(offer.numDecodings(s));
	 

	}

}
