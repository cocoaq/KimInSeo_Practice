package p_8;

public class Iphone extends Phone{
	
	int Pnumber;	//�����ȣ

	public Iphone(String name, int price, int number, int pnumber) {
		super(name, price, number);
		Pnumber = pnumber;
	}
	
	@Override
	public String call() {
		return "���������~";
	}

	@Override
	public String toString() {
		return "Iphone [Pnumber=" + Pnumber + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
