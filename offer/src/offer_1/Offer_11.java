package offer_1;
//旋转数组中的最小数字
public class Offer_11 {
	public int MinRotate(int[]a) {
		if(a==null||a.length<=0)
		return 0;
	    int l=0;
		int h=a.length-1;
		while(l<h) {
		int	m=1+(h-1)/2;
		if(a[l]==a[m]&&a[m]==a[h])
			return MinInOrder(a);
		else if(a[m]<=a[h])
			m=h;
		else
			l=m+1;	
		return a[m];
		}
		return a[0];
	
	}
	public int MinInOrder(int[] a) {
		for(int i=0;i<a.length;i++)
			if(a[i]>a[i+1])
				return a[i+1];
		return a[0];
		
		
	}
	
	public static void main(String[] args) {
		
	}

}
