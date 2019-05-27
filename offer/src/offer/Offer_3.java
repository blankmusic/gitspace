package offer;


import java.util.Scanner;
//在一个长度为n的数组里所有的数字都在0-n-1的范围内。数组中的某些数字是重复的，
//但不知道有几个数字是重复的，也不知道每个数字重复几次。
//请找出数组中任意一个重复的数字
public class Offer_3 {
	
	public boolean caculatedup(int [] a,int length,int[] duplication) {
		if(a==null||length<=0)
			return false;
		for(int i=0;i<length;i++) {
			while(a[i]!=i) {
				if(a[i]==a[a[i]]) {
					duplication[0]=a[i];
					return true;
				}
				swap(a,i,a[i]);
			}
		}
		return false;
	}
	
	public void swap(int[] a,int i,int j) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	

	public static void main(String[] args) {
		
//		Scanner in=new Scanner(System.in);
//		if(in.hasNextInt()) {
//			int[] a=new int[in.nextInt()];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i]=in.nextInt();
//		}
//		}
		int[] a= {2,3,1,0,2,5};
		int [] duplication=new int[1];
		Offer_3 o=new Offer_3();
		o.caculatedup(a, a.length, duplication);
		System.out.print(duplication[0]);


	}

}
