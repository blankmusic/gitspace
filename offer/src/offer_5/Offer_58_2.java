package offer_5;
//����ת�ַ���
//�ý���ʵ��
public class Offer_58_2 {
	 public String LeftRotateString(String str,int n) {
	      
	        if(str==null||n>str.length()||n==0)
	            return str;
	        char[] chars=str.toCharArray();
	        reverse(chars,0,n-1);//��ת0-n-1���ַ�
	        reverse(chars,n,chars.length-1);//��תn-str.lrngth()-1���ַ�
	        reverse(chars,0,chars.length-1);//������ת
	        return new String(chars);
	    }
	    private void reverse(char[] chars,int i,int j){
	        while(i<j){
	            swap(chars,i++,j--);
	        }}
	    private void swap(char[] chars,int i,int j){
	        char tmp=chars[i];
	        chars[i]=chars[j];
	        chars[j]=tmp;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
