package offer_4;

import java.util.Arrays;

//����һ���ַ�����ֻ���� a~z ���ַ���������������ظ��ַ������ַ����ĳ��ȡ�
//������� arabcacfr��������ظ��ַ������ַ���Ϊ acfr������Ϊ 4��
public class Offer_48 {
	//������ظ��ַ����ַ���
	public int numDecodings(String str){
		if(str.length()==0||str==null)
			return 0;
		int curlen=0;
		int maxlen=0; 
		int[] preIndex=new int[26];
		Arrays.fill(preIndex,-1);//������ʾû�г��ֹ�
		for(int i=0;i<str.length();i++){
			int c=str.charAt(i);
			int preI=preIndex[c];
			//i-preI��ʾ��ǰ�ַ�����һ�γ��ֵ�λ��֮��ľ���
			//������ڵ�ǰ���ظ��ַ��ĳ�����ɼ��뵽���ظ��ַ�
			if(preI==-1||i-preI>curlen)
				curlen++;
			else{
				maxlen=Math.max(maxlen,curlen);
				curlen=i-preI;
			}
			preIndex[c]=i;//����ѳ����ַ���λ��
			
			
			
		}
		maxlen=Math.max(maxlen,curlen);
		
		return maxlen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
