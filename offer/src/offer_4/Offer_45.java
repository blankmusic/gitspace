package offer_4;
//����һ�����������飬����������������ƴ�������ų�һ������
//��ӡ��ƴ�ӳ���������������С��һ����
//������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
import java.util.ArrayList;
import java.util.Arrays;
public class Offer_45 {
	 public String PrintMinNumber(int [] numbers) {
         if(numbers==null||numbers.length<=0)
             return "";
    int n=numbers.length;
    String[] nums=new String[n];
    for(int i=0;i<n;i++)
        nums[i]=numbers[i]+"";
    Arrays.sort(nums,(s1,s2)->(s1+s2).compareTo(s2+s1));
    String ret="";
    for(String str:nums)
        ret+=str;
    return ret;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
