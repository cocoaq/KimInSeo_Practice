package p_8;

public class Android extends Phone{

	int date;	//焊刘扁埃
	
	public Android(String name, int price, int number, int date) {
		super(name, price, number);
		this.date = date;
	}

	@Override
	public String call() {
		return "快林快林快林~";
	}

}
