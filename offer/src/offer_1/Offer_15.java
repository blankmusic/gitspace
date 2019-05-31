package offer_1;
//二进制中一的个数
public class Offer_15 {
  //  按位与算法 双1才是1 
	
	 public void binaryToDecimal(int n){
		       int t = 0;  //用来记录位数
		       int bin = 0; //用来记录最后的二进制数
		       int r = 0;  //用来存储余数
		       while(n != 0){
		           r = n % 2;
		           n = n / 2;
		           bin += r * Math.pow(10,t);
		         t++;  
		      }
		          System.out.println(bin);
		  }

	 
	 public int countB(int n) {
		int cnt=0;
		 while(n！=0){
		         cnt++
			 n&=n-1;
	         
		 }
		 return cnt;
		 
	 }
	 public int countB2(int n) {
		 
		 return Integer.bitCount(n);
	 }
	public static void main(String[] args) {
		

	}

}
