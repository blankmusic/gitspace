package offer_2;
/*
 []:�ַ�����
 ����������
 �����ظ�0~1
 +���ظ�1~n
 *���ظ�0~n
 .�������ַ�
 \\.:ת���ַ�.
 \\d:����
  
  */
public class Offer_20 {

	public boolean matchWord(char[] str) {
		if(str==null||str.length==0)
			return false;
		return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
		
	}
	public static void main(String[] args) {		// TODO Auto-generated method stub

	}

}
