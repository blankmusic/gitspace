package offer_6;
//Ȧ�����ʣ�µ���
//Լɪ��
//ԲȦ����Ϊ n �Ľ���Կ��ɳ���Ϊ n-1 
//�Ľ��ټ��ϱ����ĳ��� m����Ϊ��ԲȦ�����������Ҫ�� n ȡ�ࡣ
public class Offer_62 {
	public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0)/*��������Ĵ���*/
            return -1;
        if(n==1)/*�ݹ鷵������*/
            return 0;
        return (LastRemaining_Solution(n-1,m)+m)%n;
    }
  
	//����2
	public int  LastRemain(int n,int m) {
		  if(n<1||m<1) return -1;    
	        int[] array = new int[n];  
	        int i = -1,step = 0, count = n;    
	        while(count>0){   //����ѭ��ʱ�����һ��Ԫ��Ҳ����Ϊ��-1  
	            i++;          //ָ����һ����ɾ���������һ��Ԫ�ء�   
	            if(i>=n) i=0;  //ģ�⻷��         
	            if(array[i] == -1) continue; //������ɾ���Ķ���   
	            step++;                     //��¼���߹��ġ�      
	            if(step==m) {               //�ҵ���ɾ���Ķ���       
	                array[i]=-1;             
	                step = 0;           
	                count--;         
	            }            
	        }     
	        return i;//��������ѭ��ʱ��i,�����һ��������Ϊ-1��Ԫ��
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
