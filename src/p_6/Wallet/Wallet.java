package p_6.Wallet;

public class Wallet {

//	<<객체>>
//	  목표 : 오버로딩 만들기
//	  요구 : 간단히 지갑 객체를 추상화하고, 오버로딩을 3가지 이상 만들어 보자.
//	  
//	  		-Run과 Wallet의 두 클래스를 생성한다. 
//	  		-Wallet에는 getter와 setter를 만들고, toString 메소드도 오버라이드한다.
//	  		-변수는 이와 같이 넣는다.
//	 			private int card;	//카드
//	 			private final int money = 0;	//돈
//	 			private String bill;	//영수증
//	 			private String id;	//신분증
//	 
//			-만들 오버로딩은 3개로, 각각 매개변수를 다르게 받는다.
//				int card, String bill, String id
//	            int card, String bill
//	            String bill, String id
//			-Run클래스에서 인자를 넣어 Wallet을 호출하면 출력예시와 같은 출력문을 출력하도록한다.
//	 		-이 외는 출력 예시를 참고한다.
//	 
//	  출력 예시 : 
//	원할매는 3번 카드를 썼다. 현금이 0원 밖에 없었다. 왕족발보쌈에서 썼다.
//	1번 카드 카페에서 씀.
//	홍길동씨가 옷가게에서 쏨.
//	

	private int card;	//카드
	private final int money = 0;	//돈
	private String bill;	//영수증
	private String id;	//신분증

	public Wallet(int card, String bill, String id) {
		super();
		this.card = card;
		this.bill = bill;
		this.id = id;
	}
	
	public Wallet(int card, String bill) {
		System.out.println(card + "번 카드 " + bill + "에서 씀.");
	}
	public Wallet(String bill, String id) {
		System.out.println(id + "씨가 " + bill + "에서 쏨.");
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	public String getBill() {
		return bill;
	}

	public void setBill(String bill) {
		this.bill = bill;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return  id + "는 " +card + "번 카드를 썼다. 현금이 " + money + "원 밖에 없었다. " + bill + "에서 썼다.";
	}



}


