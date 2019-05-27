package offer_5;
import java.util.BitSet;

public class Offer_50 {
	public int FirstNotRepeatingChar(String str) {
        if(str.length()==0)
            return -1;
        BitSet s1=new BitSet(256);//��ʼ��Ϊfalse
        BitSet s2=new BitSet(256);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!s1.get(c)&&!s2.get(c))
                s1.set(c);//��һ�α�����c��bit1�е���Ӧλ����Ϊtrue
            else
                if(s1.get(c)&&!s2.get(c))
                    s2.set(c);//�ڶ��α�����ͬһ��c ��bit2λ����Ҳ����Ϊtrue��
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(s1.get(c)&!s2.get(c))//���ֻ�г���һ�ε������������в�Ϊtrue true
                return i;
        }
        return -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
