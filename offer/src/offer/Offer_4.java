package offer;

public class Offer_4 {
	public boolean searchEle(int[][]a,int target) {
		//a.length:ÐÐ
		//a[0].length:ÁÐ
	if(a==null||a.length<0||a[0].length<0)
		return false;
	int c=a[0].length-1;
	int r=0;
	while(c>=0&&r<a.length) {
		if(target>a[r][c])
			r++;
		else
			if(target<a[r][c])
				c--;
			else
				return true;
	}
	return false;
	}
	
	
	public static void main(String[] args) {
		Offer_4 offer=new Offer_4();
		int[][] a= {{1,4,7,11,15 },
				    {2,5,8,12,19},
				    {3,6,9,16,22},
				    {10,13,14,17,24},
				    {18,21,23,26,30}};
		
	boolean b=	offer.searchEle(a,5);
	boolean c=	offer.searchEle(a,20);
	System.out.println(b);
	System.out.println(c);

	}

}
