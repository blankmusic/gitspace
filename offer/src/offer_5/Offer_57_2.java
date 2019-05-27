package offer_5;
//和为s的连续正数序列
import java.util.ArrayList;
public class Offer_57_2 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	      ArrayList<ArrayList<Integer> > ret=new ArrayList<>();
	        int start=1;
	        int end=2;
	        int s=3;
	        while(end<sum){
	            if(s<sum)
	            {
	                end++;
	                s+=end;
	            }
	           else if(s>sum){
	                s-=start;
	                start++;
	            }
	            else{
	                 ArrayList<Integer> list=new ArrayList<>();
	                for(int i=start;i<=end;i++)
	                    list.add(i);
	                ret.add(list);
	                s-=start;
	                start++;
	                end++;
	                s+=end;  
	            }  
	        }
	        return ret;
	        
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
