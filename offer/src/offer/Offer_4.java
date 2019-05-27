package offer;
/*给定一个二维数组，其每一行从左到右递增排序，
从上到下也是递增排序。给定一个数，判断这个数是否在该二维数
组中
*/
//时间复杂度O(M+N) 空间复杂度O(1)
//根据矩阵本身的特性 从右上角的元素开始和target进行比较 下面的都大 左面的都小
public class Offer_4 {
	public boolean searchEle(int[][]a,int target) {
	 if(a==null||a.length==0||a[0].length==0)
		 return false;
		int r=0;
		int c=a[0].length-1;
		while(r<a.length&&c>=0){
		   if(a[r][c]==target)
			   return true;
			else if(a[r][c]<target)
				r++;
			else
				c--;
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
