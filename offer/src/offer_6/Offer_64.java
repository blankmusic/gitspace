package offer_6;
//��1+2+3+...+n
//����ʹ�ó˳�����for while if else switch case�ȹؼ��ּ������ж����A?B:C
//ʹ�õݹ���Ҫʹ��������� ���ﲻ����if���
//&&���ж�·����  ��if����ȡ��  �ڶ�����Ϊ�ݹ�����岿��
public class Offer_64 {
	public int Sum_Solution(int n) {
		int sum=n;
		boolean b=(n>0)&&((sum+=Sum_Solution(n-1))>0);
		return sum;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
