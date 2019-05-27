package offer;

public class Offer_5 {
	public String replaceSpace(StringBuffer str){
		
		int p1=str.length()-1;
		
		for(int i=0;i<=p1;i++){
		if(str.charAt(i)==' ')
		str.append("  ");	
		}
		
		int p2=str.length()-1;
		while(p2>p1&&p1>=0){
			char c=str.charAt(p1--);
			if(c==' '){
				str.setCharAt(p2--,'0');
				str.setCharAt(p2--,'2');
				str.setCharAt(p2--,'%');
			}
			else
				str.setCharAt(p2--,c);
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
