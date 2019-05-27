package offer_5;

public class Offer_51 {
	 private long  cnt;
	    private int[] tmp;
	    public int InversePairs(int [] array) {
	        

	        if(array.length==0)
	            return 0;
	          tmp = new int[array.length];
	        mergeSort(array,0,array.length-1);
	        return (int)(cnt%1000000007);
	        
	    }
	    private void mergeSort(int [] array,int l,int h){
	        int m=l+(h-l)/2;
	        if(h-l<1)
	            return;
	        mergeSort(array,l,m);
	        mergeSort(array,m+1,h);
	        merge(array,l,m,h);
	    }
	    private void merge(int [] array,int l,int m,int h){
	        int i=l;
	        int j=m+1;
	        int k=l;
	        while(i<=m||j<=h){
	            if(i>m)
	                tmp[k]=array[j++];
	            else if(j>h)
	                tmp[k]=array[i++];
	            else if(array[i]<=array[j])
	                tmp[k]=array[i++];
	                else{
	                    tmp[k]=array[j++];
	                    this.cnt+=m-i+1;// nums[i] > nums[j]，说明 nums[i...mid] 都大于 nums[j]

	                    
	                }
	            k++;
	        }
	         for (k = l; k <= h; k++)
	           array[k] = tmp[k];

	        
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
