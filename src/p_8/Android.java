package p_8;

public class Android extends Phone{

	int date;	//�����Ⱓ
	
	public Android(String name, int price, int number, int date) {
		super(name, price, number);
		this.date = date;
	}

	@Override
	public String call() {
		return "���ֿ��ֿ���~";
	}

}
