package offer_1;
//��������һ�ĸ���
public class Offer_15 {
  //  ��λ���㷨 ˫1����1 
	
	 public void binaryToDecimal(int n){
		       int t = 0;  //������¼λ��
		       int bin = 0; //������¼���Ķ�������
		       int r = 0;  //�����洢����
		       while(n != 0){
		           r = n % 2;
		           n = n / 2;
		           bin += r * Math.pow(10,t);
		         t++;  
		      }
		          System.out.println(bin);
		  }

	 
	 public int countB(int n) {
		 int cnt=0;
		 while(n!=0) {
			 cnt++;
			 n=n&(n-1);
		 }
		 return cnt;
		 
	 }
	 public int countB2(int n) {
		 
		 return Integer.bitCount(n);
	 }
	public static void main(String[] args) {
		

	}

}
