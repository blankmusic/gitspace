package offer_5;
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
//һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
//diff &= -diff �õ��� diff ���Ҳ಻Ϊ 0 ��λ��Ҳ���ǲ������ظ�������Ԫ����λ����ʾ�����Ҳ಻ͬ����һλ��
//������һλ�Ϳ��Խ�����Ԫ�����ֿ�����
public class Offer_56 {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        int diff=0;//������κ�һ������Ϊ���������
	        for(int arr:array)
	            diff^=arr;
	        diff&=-diff;//z�õ���һ����ͬ��λ���������λ��Ϊdiff��Ϊ��������ֻ����һ�ε���
	        for(int arr:array){
	            if((arr&diff)==0)//λ������ͬ
	                num1[0]^=arr;
	            else 
	                num2[0]^=arr;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
