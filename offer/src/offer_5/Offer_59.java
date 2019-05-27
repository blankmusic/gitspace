package offer_5;
//滑动窗口的最大值
//给定一个数组和滑动窗口 找出所有滑动窗口数值的最大值
import java.util.ArrayList;
//使用维护一个大小为size的大顶堆的方法
//初始降序的前size个大顶堆 
//反正我是没想出来
import java.util.Queue;
import java.util.PriorityQueue;
public class Offer_59 {
	  public ArrayList<Integer> maxInWindows(int [] num, int size)
	    {
	        Queue<Integer> queue=new PriorityQueue<>((o1,o2)->o2-o1);//建立大顶堆
	        ArrayList<Integer>ret=new ArrayList<>();//存储结果
	         if (size > num.length || size < 1)
	        return ret;

	        for(int i=0;i<size;i++)
	            queue.add(num[i]);//大小为size的大顶堆 对数组的前size个数据降序
	        ret.add(queue.peek());//保存窗中的最大值
	        for(int i=0,j=i+size;j<num.length;j++,i++){
	            queue.remove(num[i]);//依次去除第i个元素 并加入第j个元素
	            queue.add(num[j]);
	            ret.add(queue.peek());
	            
	        }
	        return ret;
	         
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
