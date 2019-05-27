package offer_2;

public class Offer_21 {
	public void reOrderArray(int [] nums) {
        
		 // ÆæÊý¸öÊý
	    int oddCnt = 0;
	    for (int val : nums)
	        if (val % 2 == 1)
	            oddCnt++;
	    int[] copy = nums.clone();
	    int i = 0, j = oddCnt;
	    for (int num : copy) {
	        if (num % 2 == 1)
	            nums[i++] = num;
	        else
	            nums[j++] = num;
	    }
		
    }

	public static void main(String[] args) {
		Offer_21 offer=new Offer_21();
		int[] array= {1,2,3,4,5,6,7};
		offer.reOrderArray(array);

	}

}
