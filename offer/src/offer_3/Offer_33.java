package offer_3;
//二叉搜索树的后序遍历数列
public class Offer_33 {

	public boolean VerifySqueOfBTS(int [] squence) {
		if(squence==null||squence.length==0)
			return false;
		return Verify(squence,0,squence.length-1);
}
	private boolean Verify(int [] squence,int first,int last) {
		if(last-first<=1)
			return true;
		int rootVal=squence[last];
		int cutIndex=first;
		while(cutIndex<last&&squence[cutIndex]<rootVal)
			cutIndex++;
		for(int i=cutIndex;i<last;i++) {
			if(squence[i]<rootVal)
				return false;
		}
		return Verify(squence,first,cutIndex-1)&&Verify(squence,cutIndex,last-1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
