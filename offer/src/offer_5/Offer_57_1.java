package offer_5;
//����һ����������������һ������S���������в�����������
//ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
import java.util.ArrayList;
import java.util.Arrays;
//����ȡ�õĽ���Ļ�һ������С��
public class Offer_57_1 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	      if(array.length==0)
	          return new ArrayList<Integer>();//�ж���Ч��
	        ArrayList<Integer> ret=new ArrayList<>();
	        Arrays.sort(array);//������������
	        int i=0;//ͷ���
	        int j=array.length-1;//β�ڵ�
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
	
	
	
	//������д��
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
