package offer_2;
import java.util.ArrayList;
public class Offer_29 {
    public ArrayList<Integer> printMartix(int[][] a){ 
    	if(a==null||a.length<=0||a[0].length<=0)
    		return null;
	ArrayList<Integer> ret=new ArrayList<>();
	int r0=0;
	int r1=a.length-1;
	int c0=0;
	int c1=a[0].length-1;
	while(r0<=r1&&c0<=c1) {
		for(int i=c0;i<=c1;i++) {
			ret.add(a[r0][i]);
		}
		for(int i=r0+1;i<=r1;i++) {
			ret.add(a[i][c1]);
		}
		if(r0!=r1)
		for(int i=c1-1;i>=c0;i--) {
			ret.add(a[r1][i]);
		}
		if(c0!=c1)
			for(int i=r1-1;i>r0;i--) {
			ret.add(a[i][c0]);
		}
		r0++;
		r1--;
		c0++;
		c1--;	
	}
	return ret;
	
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
