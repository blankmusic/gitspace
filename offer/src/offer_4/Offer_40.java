package offer_4;
import java.util.ArrayList;
import java.util.PriorityQueue;
//最小的K个数
public class Offer_40 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length||k<=0)
            return new ArrayList<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((o1,o2)->o2-o1);
        for(int inp:input){
            maxHeap.add(inp);
            if(maxHeap.size()>k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }
	public static void main(String[] args) {
		

	}

}
