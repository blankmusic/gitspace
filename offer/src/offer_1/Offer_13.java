package offer_1;

public class Offer_13 {
	//���ӣ�https://www.nowcoder.com/questionTerminal/6e5207314b5241fb83f2329e89fdecc8
	//	��Դ��ţ����

		 public int movingCount(int threshold, int rows, int cols) {
		        int flag[][] = new int[rows][cols]; //��¼�Ƿ��Ѿ��߹�
		        return helper(0, 0, rows, cols, flag, threshold);
		    }
		 
		    private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
		        if (i < 0 || i >= rows || j < 0 || j >= cols || numSum(i) + numSum(j)  > threshold || 
		        		flag[i][j] == 1) return 0;    
		        flag[i][j] = 1;
		        return helper(i - 1, j, rows, cols, flag, threshold)
		            + helper(i + 1, j, rows, cols, flag, threshold)
		            + helper(i, j - 1, rows, cols, flag, threshold)
		            + helper(i, j + 1, rows, cols, flag, threshold)
		            + 1;
		    }
		 //ȡ����ȡ�࣬��i��ÿһλ������
		    private int numSum(int i) {
		        int sum = 0;
		        do{
		            sum += i%10;
		        }while((i = i/10) > 0);
		        return sum;
		    }
	public static void main(String[] args) {
		 Offer_13 offer=new Offer_13();
		 int rows=50;
		 int cols=50;
		 int threshold=15;
		 offer.movingCount(threshold, rows, cols);

	}

}
