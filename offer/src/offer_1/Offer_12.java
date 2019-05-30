package offer_1;
//没有梳理清楚
//在矩阵中寻找路径
/*
判断在一个矩阵中是否存在一条包含某字符串所有字符的路径，路径可以从矩阵中的任意一个格子开始，每一步可以
在矩阵中上下左右移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子    

使用暴力搜索的方法，每次搜索结束后需要进行回溯
本题的输入是数组而不是矩阵（二维数组），因此需要先将数组转换成矩阵
*/
public class Offer_12 {
	//method1
	 private final staic int[][] next={{0,-1},{0,1},{-1,0},{1,0}};
	private int rows;
	private int cols;
	public boolean hasPath(char[] array,int rows,int cols,char[] str){
	  if(array.length<str.length||rows==0||cols==0)
		  return false;
		this.cols=cols;
		this.rows=rows;
		boolean[][] marked =new boolean[rows][cols];
		char[][] matrix=makeMatrix[cols][rows];
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
			{  
				if(hasPath(martrix,i,j,str,0,marked))
					return true;
			}
		return false;
	
	}
	//递归
	private boolean hasPath(char[][] matrix,int r,int j,char[] str,int pathLen,boolean[][] marked){
	      if(pathLen==str.length)
		      return true;
		if(r<0||r>=rows||c<0||c>=rows||str[pathLen]!==matrix[r][c]||marked[r][c])
			return false;
		marked[r][c]=true;
		for(int[] n:next)
		if(hasPath(matrix,r+n[0],c+n[1],str,pathLen+1,marked))
		return true;
		marked[r][c]=false;
		return false;
		
	
	}
	public char[][] makeMatrix(char[] array,int rows,int cols ){
	      char[][] matrix=new char[rows][cols]
	     for(int i=0,index=0;i<rows;i++)
		     for(int j=0;j<cols;j++){
		      matrix[i][j]=array[index++];
		     }
		return matrix;
	
	}
	
	
	
	
	
	
	
	
	//method2
	/*public boolean hasPath(char[]matrix,int rows,int cols,char[] str) {
		
		boolean[] flag=new boolean[matrix.length];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				return isHasPath(matrix,i,j,rows,cols,str,0,flag);
			}
		}
		return false;
		
	}
	public boolean isHasPath(char[] matrix,int i,int j,int rows,int cols,char[] str,int k,boolean[] flag) {
	
		int index=i*cols+j;
		if(i<0||j<0||i>=rows||j>=cols||matrix[index]!=str[k]||flag[index]==true)
			return false;
		 if(k==str.length-1)
			 return true;
		 flag[index]=true;
		 if(isHasPath(matrix,i-1,j,rows,cols,str,k+1,flag)||
				 isHasPath(matrix,i+1,j,rows,cols,str,k+1,flag)||
				 isHasPath(matrix,i,j-1,rows,cols,str,k+1,flag)||
				 isHasPath(matrix,i,j+=1,rows,cols,str,k+1,flag))
			 return true;
		 flag[index]=false;
		 return false;
		
		
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
