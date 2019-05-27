package offer_6;
//扑克牌顺子
import java.util.Arrays;
public class Offer_61 {
	public boolean isContinuous(int [] numbers) {
        if(numbers.length==0)//判断输入
            return false;
        int cnt=0;//鬼的数量
        Arrays.sort(numbers);//将数组排序
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0)
                cnt++;//计算鬼的数量
        }
        for(int i=cnt;i<numbers.length-1;i++){
            if(numbers[i]==numbers[i+1])//有相等的不为顺子
                return false;
            cnt-=numbers[i+1]-numbers[i]-1;
        }
        return cnt<0?false:true;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
