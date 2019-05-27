package offer_5;
//输入一个递增排序的数组和一个数字S，在数组中查找两个数，
//使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
import java.util.ArrayList;
import java.util.Arrays;
//这样取得的结果的积一定是最小的
public class Offer_57_1 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	      if(array.length==0)
	          return new ArrayList<Integer>();//判断有效性
	        ArrayList<Integer> ret=new ArrayList<>();
	        Arrays.sort(array);//递增排序数组
	        int i=0;//头结点
	        int j=array.length-1;//尾节点
	        while(i<j){
	            if(array[i]+array[j]==sum){
	             ret.add(array[i]);
	                ret.add(array[j]);
	                return ret;  }
	            if(array[i]+array[j]>sum)
	                j--;
	             if(array[i]+array[j]<sum)
	                 i++;
	        }
	        return ret;
	    }
	
	
	
	//更简洁的写法
	public ArrayList<Integer> FindNumbersWithSum1(int[] array, int sum) {
	     int i=0;
	     int j=array.length-1;
	     while(i<j) {
	    	 int s=array[i]+array[j];
	    	 if(s==sum)
	    		 return new ArrayList<Integer>(Arrays.asList(array[i],array[j]));
	    	 
	    	 if (s < sum)
	             i++;
	         else
	             j--;

	    	 
	     }
	
	     return new ArrayList<>();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
