package offer_1;
//机器人的运动范围
/*
地上有一个m*n的方格，一个机器人从坐标0，0的个字开始移动，每次只能向上下左右四个方向移动一格，
但是不能进行航坐标和列坐标的数位之和大于k的格子
请问该机器人能够到达多少格子

使用深度优先搜索Depth first search dfs
回溯是深度优先的特例 ，回复需要设置局部状态并清除状态 而普通的深度优先搜索并不需要

*/
public class Offer_13 {
	 private int cnt;//可以演奏的各自的数目
	private  int[][] digitSum ;//行和列的每一位之和
	private int cols;//矩阵的列
	private int rows;//矩阵的行
	private int thredshold;//阈值
	public int movingCount(int thredshold ,int cols,int rows ){
	     this.cols=cols;
		this.rows=rows;
		this.thredshold=thredshold;
		boolean [][]mark=new boolean [rows][cols];
		initDigitSum();
		dfs(mark,0,0);
		return cnt;	
	}
	
	//迭代
	public void dfs(boolean[][] mark,int r,int c){
	 if(mark[r][c]||r<0||r>=rows||c<0||c>=cols)
		 return;
		mark[r][c]=true;
		if(digitSum[r][c]>this.threshold)
			return ;
		cnt++;
		for(int[]n=:next){
		 dfs(mark,r+n[0],c+n[1]);
		}
	
	
	}
	
	public void initDigitSum(){
	   int [] digitSumone=new int[Math.max(rows,cols)];
		int len=digitSumone,length;
		for(int i=0;i<len;i++ )
		{  int n=i;
		 do{
	           digitSumone[n]+=i%10;
		    
		}while((i=i/10)>0);
		}
		
		for(int i=0;i<this.rows;i++)
			for(int j=0;j<this.cols;j++)
				this.digitSum[i][j] = digitSumone[i] + digitSumone[j];
	  
	
	}
	
	
	/*//链接：https://www.nowcoder.com/questionTerminal/6e5207314b5241fb83f2329e89fdecc8
	//	来源：牛客网

		 public int movingCount(int threshold, int rows, int cols) {
		        int flag[][] = new int[rows][cols]; //记录是否已经走过
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
		 //取整再取余，将i的每一位相加求和
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

	}*/

}
