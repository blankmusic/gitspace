package offer_3;

public class Offer_39 {
	
	public int FindHalf(int[] array) {
		int majority=array[0];
		for(int i=1,cnt=0;i<array.length;i++) {
			cnt=majority==array[i]?cnt++:cnt--;
			if(cnt<0) {
				majority=array[i];
				cnt=1;
			}
		}
		
		int cnt=0;
		for(int n:array) {
			if(n==majority)
				cnt++;
		}
		
		return cnt>array.length/2?majority:0;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
