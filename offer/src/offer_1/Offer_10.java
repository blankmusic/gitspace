package offer_1;

import java.util.Arrays;
public class Offer_10 {
	/*
	 * //�ռ临�Ӷ�O(N) public int Fibonacci(int n) { if(n<=1) return n; int [] fib=new
	 * int[n+1]; for(int i=2;i<=n;i++) { fib[i]=fib[i-1]+fib[i-2]; } return fib[n];
	 * } //�ռ临�Ӷ�1 //���ǵ�i��ֻ���i-1��i-2���йأ����ֻҪ�洢ǰ�����ֵ��������i� //�Ӷ����Ϳռ临�Ӷ� public int
	 * Fibonacci1(int n) { if(n<=1) return n; int pre2=0; int pre1=1; int fib=0;
	 * for(int i=2;i<=n;i++) { fib=pre2+pre1; pre2=pre1; pre1=fib; } return fib;
	 * 
	 * }
	 */
	//���ڴ�����nС��40����˿��Խ�ǰ40��Ľ���Ƚ��м��㣬
	//֮�������O(1)��ʱ�临�Ӷȵõ���n���ֵ��
	private int[] fib=new int[40];
	public Offer_10() {
		fib[1]=1;
		for(int i=2;i<fib.length;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		
	}
	public int Fibonacci(int n) {
		return fib[n];
	}
	//���θ�������
	public int RectCover(int n) {
		
		if(n<=2)
			return n;
		int pre2=1;
		int pre1=2;
		int result=0;
		for(int i=3;i<=n;i++) {
			result=pre2+pre1;
			pre2=pre1;
			pre1=result;
		}
		return result;
	}
	//��̨������
	public int JumpFloor(int n) {
		if(n<=2)
			return n;
		int pre1=2;
		int pre2=1;
		int result=1;
		for(int i=2;i<n;i++) {
			result=pre1+pre2;
			pre2=pre1;
			pre1=result;
		}return result;
		
		
	}
	//��̬��̨��
	//��̬�滮�ķ���
	public int JumpFloorI(int target) {
		int[] dp=new int[target];
		Arrays.fill(dp,1);
		for(int i=1;i<target;i++)
			for(int j =0;j<i;j++)
				dp[i]+=dp[j];
		return dp[target-1];
	}
	//��̬��̨��
	//��ѧ���㷨
	public int JummpFloorII(int target) {
		
		return (int)Math.pow(2,target-1);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
