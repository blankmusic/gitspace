package offer_3;
import java.util.ArrayList;
import java.util.Arrays;
public class Offer_38 {
	
	private ArrayList<String> ret=new ArrayList<>();
	
	public ArrayList<String> Permutation(String str){
		if(str.length()==0)
			return null;
		char[] chars=str.toCharArray();
		Arrays.sort(chars);
		Permu(chars,new boolean[chars.length],new StringBuffer());
		return ret;		
	}
	
	
	
	private void Permu(char[] chars,boolean[] marked,StringBuffer s) {
		if(s.length()==ret.size()) {
			ret.add(s.toString());
		}
		
		for(int i=0;i<chars.length;i++) {
			
			if(marked[i])
				continue;
			if(i!=0&&chars[i]==chars[i-1]&&!marked[i-1])//±ÜÃâÖØ¸´
				continue;
			marked[i]=true;
			s.append(chars[i]);
			Permu(chars, marked, s);
			s.deleteCharAt(s.length()-1);
			marked[i]=false;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     
     
	}

}
