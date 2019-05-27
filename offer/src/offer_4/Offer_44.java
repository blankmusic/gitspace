package offer_4;
// ���������е�ĳһλ����
public class Offer_44 {

	public int getDigitAtIndex(int index) {
		if(index<0)
			return -1;
		int place=1;//��ʾλ��
		while(true) {
			int amount=getAmountOfPlace(place);
			int totalAmount=amount*place;
			if(index<totalAmount)
				return getDigitAtIndex(index,place);
			index-=totalAmount;
			place++;
	}
		}
//	placeλ����������ɵ��ַ����ĳ���
	private int getAmountOfPlace(int place) {
		
		if(place==1)
			return 10;
		return (int)Math.pow(10, place-1)*9;//���place��2 ��10~90
		//���place��3 ��100~900

	}
	/**
	 * place λ������ʼ����
	 * 0, 10, 100, ...
	 */
	private int getBeginNumberOfPlace(int place) {
	    if (place == 1)
	        return 0;
	    return (int) Math.pow(10, place - 1);
	}
	/**
	 * �� place λ����ɵ��ַ����У��� index ����
	 */
	private int getDigitAtIndex(int index, int place) {
	    int beginNumber = getBeginNumberOfPlace(place);
	    int shiftNumber = index / place;
	    String number = (beginNumber + shiftNumber) + "";
	    int count = index % place;
	    return number.charAt(count) - '0';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
