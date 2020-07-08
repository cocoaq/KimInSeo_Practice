package p_8;

public class Phone {
	String name;	//이름
	int price;	//가격

	
	public Phone(String name, int price, int number) {
		this.name = name;
		this.price = price;

	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	public String call() {
		return "띠리리리링~";
	}

}
