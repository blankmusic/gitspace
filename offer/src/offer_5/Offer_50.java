package offer_5;
import java.util.BitSet;

public class Offer_50 {
	public int FirstNotRepeatingChar(String str) {
        if(str.length()==0)
            return -1;
        BitSet s1=new BitSet(256);//初始都为false
        BitSet s2=new BitSet(256);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!s1.get(c)&&!s2.get(c))
                s1.set(c);//第一次遍历到c将bit1中的相应位置设为true
            else
                if(s1.get(c)&&!s2.get(c))
                    s2.set(c);//第二次遍历到同一个c 把bit2位置上也设置为true；
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(s1.get(c)&!s2.get(c))//最后只有出现一次的在两个数组中不为true true
                return i;
        }
        return -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
