package offer_5;
//左旋转字符串
//用交换实现
public class Offer_58_2 {
	 public String LeftRotateString(String str,int n) {
	      
	        if(str==null||n>str.length()||n==0)
	            return str;
	        char[] chars=str.toCharArray();
	        reverse(chars,0,n-1);//翻转0-n-1个字符
	        reverse(chars,n,chars.length-1);//翻转n-str.lrngth()-1个字符
	        reverse(chars,0,chars.length-1);//整个翻转
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
