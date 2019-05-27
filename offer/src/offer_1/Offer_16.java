package offer_1;
//��ֵ�����η�
public class Offer_16 {
	public double solution(double base,int exponent) {
		
		return Math.pow(base, exponent);
		
	}
	
//	���ӣ�https://www.nowcoder.com/questionTerminal/1a834e5e3e1a4b7ba251417554e07c00
//		��Դ��ţ����

		/**
		 * 1.ȫ�濼��ָ���������������Ƿ�Ϊ��������
		 * 2.д��ָ���Ķ����Ʊ�����13���Ϊ������1101��
		 * 3.����:10^1101 = 10^0001*10^0100*10^1000��
		 * 4.ͨ��&1��>>1����λ��ȡ1101��Ϊ1ʱ����λ����ĳ����۳˵����ս����
		 */
		public double Power(double base, int n) {
		    double res = 1,curr = base;
		    int exponent;
		    if(n>0){
		        exponent = n;
		    }else if(n<0){
		        if(base==0)
		            throw new RuntimeException("��ĸ����Ϊ0"); 
		        exponent = -n;
		    }else{// n==0
		        return 1;// 0��0�η�
		    }
		    while(exponent!=0){
		        if((exponent&1)==1)
		            res*=curr;
		        curr*=curr;// ����
		        exponent>>=1;// ����һλ
		    }
		    return n>=0?res:(1/res);       
		}

		
		public double Power1(double base, int exponent) {
		    if (exponent == 0)
		        return 1;
		    if (exponent == 1)
		        return base;
		    boolean isNegative = false;
		    if (exponent < 0) {
		        exponent = -exponent;
		        isNegative = true;
		    }
		    double pow = Power1(base * base, exponent / 2);
		    if (exponent % 2 != 0)
		        pow = pow * base;
		    return isNegative ? 1 / pow : pow;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
