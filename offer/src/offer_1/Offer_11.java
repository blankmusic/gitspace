package offer_1;
//旋转数组的最小数字
//把一个数组的最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素
//对半 将算法的时间复杂度变为logN
//问题的关键在于对半分之后哪一半是旋转数组
//不能排除数组中存在相等的元素
//二分查找法 和顺序查找法
public class Offer_11 {
	public int MinRotate(int[]a) {
		if(a==null|a.length==0)
			return 0;
		int l=0;
		int h=a.length-1;
		while(l<h){
		int m=l+(h-l)/2;
			if(a[l]==a[m]&&a[m]==a[h])
				return MinInorder(a,l,h);
			else if(a[m]>a[h])
				l=m+1;
			else 
				h=m;
		}
		return a[l];
	
	}
	public int MinInOrder(int[] a) {
		for(int i=l;i<h;i++)
			if (a[i]>a[i+1])
				return a[i+1];
		return a[l];
	}
	
	public static void main(String[] args) {
		
	}

}
