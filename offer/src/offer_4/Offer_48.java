package offer_4;

import java.util.Arrays;

//输入一个字符串（只包含 a~z 的字符），求其最长不含重复字符的子字符串的长度。
//例如对于 arabcacfr，最长不含重复字符的子字符串为 acfr，长度为 4。
public class Offer_48 {
	//最长不含重复字符的字符串
	public int numDecodings(String str){
		if(str.length()==0||str==null)
			return 0;
		int curlen=0;
		int maxlen=0; 
		int[] preIndex=new int[26];
		Arrays.fill(preIndex,-1);//负数表示没有出现过
		for(int i=0;i<str.length();i++){
			int c=str.charAt(i);
			int preI=preIndex[c];
			//i-preI表示当前字符和上一次出现的位置之间的距离
			//距离大于当前不重复字符的长度则可加入到不重复字符
			if(preI==-1||i-preI>curlen)
				curlen++;
			else{
				maxlen=Math.max(maxlen,curlen);
				curlen=i-preI;
			}
			preIndex[c]=i;//标记已出现字符的位置
			
			
			
		}
		maxlen=Math.max(maxlen,curlen);
		
		return maxlen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
