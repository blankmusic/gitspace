package offer_5;
//�������ڵ����ֵ
//����һ������ͻ������� �ҳ����л���������ֵ�����ֵ
import java.util.ArrayList;
//ʹ��ά��һ����СΪsize�Ĵ󶥶ѵķ���
//��ʼ�����ǰsize���󶥶� 
//��������û�����
import java.util.Queue;
import java.util.PriorityQueue;
public class Offer_59 {
	  public ArrayList<Integer> maxInWindows(int [] num, int size)
	    {
	        Queue<Integer> queue=new PriorityQueue<>((o1,o2)->o2-o1);//�����󶥶�
	        ArrayList<Integer>ret=new ArrayList<>();//�洢���
	         if (size > num.length || size < 1)
	        return ret;

	        for(int i=0;i<size;i++)
	            queue.add(num[i]);//��СΪsize�Ĵ󶥶� �������ǰsize�����ݽ���
	        ret.add(queue.peek());//���洰�е����ֵ
	        for(int i=0,j=i+size;j<num.length;j++,i++){
	            queue.remove(num[i]);//����ȥ����i��Ԫ�� �������j��Ԫ��
	            queue.add(num[j]);
	            ret.add(queue.peek());
	            
	        }
	        return ret;
	         
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
