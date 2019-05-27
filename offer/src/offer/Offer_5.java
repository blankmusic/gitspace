package offer;
//替换空格
//讲一个字符串中的空格替换成“%20”

//解题思路
/*
使用额外数组的方法增加了算法的空间复杂度，这里不增加额外的数字控 在原数组上进行改变
设置两个指针 指针p1指向字符数组的原长度的末位，指针P2 指向在末尾增加空格额外空间的末位
从后往前遍历  当胖
指针所对应的的元素是空格 p2对应的指针元素填入%02（因为是倒序）这样做的目的是防止p2改变数组时 改变了胖
指针所对应的的元素的值
*/
public class Offer_5 {
	public String replaceSpace(StringBuffer str){
		int p1=str.length()-1;
		for(int i=0;i<=p1;i++){
		 if(str.charAt(i)==‘ ’){
		 str.append("  ");//里面是两个空格
		 }
		}
		int p2=str.length()-1;
		while(p1>=0&&p1<p2){
		    char c=str.charAt(p1--);
			if(c==' '){
			str.setCharAt(p2--,'%');
		  	str.setCharAt(p2--,'0');
			str.setCharAt(p2--,'2');
			}else
			{
				str.setCharAt(p2--,c);
			}
		}
		return str.toString();
		
	}

	public static void main(String[] args) {
		Offer_5 offer=new Offer_5();
		StringBuffer str=new StringBuffer();
		str.append("A");
		str.append(" ");
		str.append("B");	
		System.out.println(str);
		String s=offer.replaceSpace(str);
		System.out.println(s);
	}

}
