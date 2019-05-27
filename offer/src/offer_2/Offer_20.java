package offer_2;
/*
 []:字符集合
 （）；分组
 ？：重复0~1
 +：重复1~n
 *：重复0~n
 .：任意字符
 \\.:转义字符.
 \\d:数字
  
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
