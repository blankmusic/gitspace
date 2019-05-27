package offer_5;
//数字在排序数组中出现的次数
public class Offer_53 {
	public int GetNumberOfK(int [] array , int k) {
	       int first=BinarSearch(array,k);
	        int last=BinarSearch(array,k+1);
	        return first==array.length||array[first]!=k?0:last-first;
	    }
	    private int BinarSearch(int[] array,int k){
	        int l=0;
	        int h=array.length;
	        while(l<h){
	            int m=l+(h-l)/2;
	            if(array[m]>=k)
	                h=m;
	            else
	                l=m+1;
	        }
	        return l;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
