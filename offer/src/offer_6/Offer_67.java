package offer_6;
//���ַ���ת��������
//��һλ�Ƿ���λ
//������ӣ�ʹ��ÿһλ���ǵ�ǰ�����λ����һλ���Ǹ�λ
public class Offer_67 {
    public int StrToInt(String str) {
    	 if(str==null||str.length()==0)//�ж�����ͺϷ���
             return 0;
         int ret=0;//���Ľ��
         boolean isNegative=str.charAt(0)=='-';//�жϷ���λ
         for(int i=0;i<str.length();i++){
             char c=str.charAt(i);//�����ж��ַ����е�ÿһλ
             if(i==0&&(c=='-'||c=='+'))//����λ������
                 continue;
             if(c<'0'||c>'9')//�ж��Ƿ�������
                 return 0;
             ret=ret*10+c-'0';//���ַ�����ÿһλת�������ֵ����λ
         }
         //���������
         return isNegative?-ret:ret;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
