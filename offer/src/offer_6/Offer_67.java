package offer_6;
//把字符串转换成整数
//第一位是符号位
//迭代相加，使得每一位都是当前的最高位，后一位都是个位
public class Offer_67 {
    public int StrToInt(String str) {
    	 if(str==null||str.length()==0)//判断输入和合法性
             return 0;
         int ret=0;//最后的结果
         boolean isNegative=str.charAt(0)=='-';//判断符号位
         for(int i=0;i<str.length();i++){
             char c=str.charAt(i);//迭代判断字符串中的每一位
             if(i==0&&(c=='-'||c=='+'))//符号位不加入
                 continue;
             if(c<'0'||c>'9')//判断是否是数字
                 return 0;
             ret=ret*10+c-'0';//将字符串的每一位转换成数字的最高位
         }
         //最后加入符号
         return isNegative?-ret:ret;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
