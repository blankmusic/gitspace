package offer_6;
//�˿���˳��
import java.util.Arrays;
public class Offer_61 {
	public boolean isContinuous(int [] numbers) {
        if(numbers.length==0)//�ж�����
            return false;
        int cnt=0;//�������
        Arrays.sort(numbers);//����������
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0)
                cnt++;//����������
        }
        for(int i=cnt;i<numbers.length-1;i++){
            if(numbers[i]==numbers[i+1])//����ȵĲ�Ϊ˳��
                return false;
            cnt-=numbers[i+1]-numbers[i]-1;
        }
        return cnt<0?false:true;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
