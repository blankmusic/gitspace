package offer_6;
//дһ������������������֮�ͣ�Ҫ���ں�������
//����ʹ�������������
//int c=(a&b)<<1
public class Offer_65 {
    
	public int Add(int num1,int num2) {
		
		return num2==0?num1:Add(num1^num2, (num1&num2)<<1);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
