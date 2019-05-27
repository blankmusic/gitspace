package offer_6;
//圈中最后剩下的数
//约瑟夫环
//圆圈长度为 n 的解可以看成长度为 n-1 
//的解再加上报数的长度 m。因为是圆圈，所以最后需要对 n 取余。
public class Offer_62 {
	public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0)/*特殊输入的处理*/
            return -1;
        if(n==1)/*递归返回条件*/
            return 0;
        return (LastRemaining_Solution(n-1,m)+m)%n;
    }
  
	//方法2
	public int  LastRemain(int n,int m) {
		  if(n<1||m<1) return -1;    
	        int[] array = new int[n];  
	        int i = -1,step = 0, count = n;    
	        while(count>0){   //跳出循环时将最后一个元素也设置为了-1  
	            i++;          //指向上一个被删除对象的下一个元素。   
	            if(i>=n) i=0;  //模拟环。         
	            if(array[i] == -1) continue; //跳过被删除的对象。   
	            step++;                     //记录已走过的。      
	            if(step==m) {               //找到待删除的对象。       
	                array[i]=-1;             
	                step = 0;           
	                count--;         
	            }            
	        }     
	        return i;//返回跳出循环时的i,即最后一个被设置为-1的元素
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
