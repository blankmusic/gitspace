package offer_6;
//构建乘积数组
//数组b中的元素时数组a中同样位置的左右乘积累乘
public class Offer_66 {
	 public int[] multiply(int[] A) {
	        if(A.length==0)//判断输入的合法性
	            return new int[1];
	        int n=A.length;
	        int[]B=new int[n];//创建和数组A等长的数组B用来存储累成结果
	        for(int i=0,ret=1;i<n;ret*=A[i],i++)
	            B[i]=ret;//先累乘每一位的左边
	        for(int i=n-1,ret=1;i>=0;ret*=A[i],i--)
	            B[i]*=ret;//将累成左边的结果和右边累乘存入数组B
	        return B;//返回结果
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
