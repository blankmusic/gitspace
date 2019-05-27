package offer_5;
//翻转单词顺序列
//以空格为间隔 先翻转每个空格间的字符
//再整个翻转以实现单词的倒序
public class Offer_58_1 {
	
	public String ReverseSentence(String str) {
		if(str.length()==0)
			return str;
		char[] chars=str.toCharArray();
		int i=0;
		int j=0;
		while(j<=chars.length) {
			if(j==chars.length||chars[j]==' ') {
				reverse(chars, i, j-1);
				i=j+1;
			}
			j++;
			
			
		}
		reverse(chars, 0, chars.length-1);
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
