package offer_6;
//�����˻�����
//����b�е�Ԫ��ʱ����a��ͬ��λ�õ����ҳ˻��۳�
public class Offer_66 {
	 public int[] multiply(int[] A) {
	        if(A.length==0)//�ж�����ĺϷ���
	            return new int[1];
	        int n=A.length;
	        int[]B=new int[n];//����������A�ȳ�������B�����洢�۳ɽ��
	        for(int i=0,ret=1;i<n;ret*=A[i],i++)
	            B[i]=ret;//���۳�ÿһλ�����
	        for(int i=n-1,ret=1;i>=0;ret*=A[i],i--)
	            B[i]*=ret;//���۳���ߵĽ�����ұ��۳˴�������B
	        return B;//���ؽ��
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
