package offer_4;
import java.util.Queue;
import java.util.LinkedList;
public class Offer_41_2 {
	private int[] cnts = new int[256];
	private Queue<Character> queue = new LinkedList<>();

	public void Insert(char ch) {
	    cnts[ch]++;
	    queue.add(ch);
	    while (!queue.isEmpty() && cnts[queue.peek()] > 1)
	        queue.poll();
	}

	public char FirstAppearingOnce() {
	    return queue.isEmpty() ? '#' : queue.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
