package offer_1;
//没有梳理清楚
//在矩阵中寻找路径
public class Offer_12 {
	public boolean hasPath(char[]matrix,int rows,int cols,char[] str) {
		
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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
