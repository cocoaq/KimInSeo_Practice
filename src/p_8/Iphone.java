package p_8;

public class Iphone extends Phone{
	
	int Pnumber;	//생산번호

	public Iphone(String name, int price, int number, int pnumber) {
		super(name, price, number);
		Pnumber = pnumber;
	}
	
	@Override
	public String call() {
		return "사과사과사과~";
	}

	@Override
	public String toString() {
		return "Iphone [Pnumber=" + Pnumber + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
