package p_6.Wallet;

public class Wallet {

//	<<��ü>>
//	  ��ǥ : �����ε� �����
//	  �䱸 : ������ ���� ��ü�� �߻�ȭ�ϰ�, �����ε��� 3���� �̻� ����� ����.
//	  
//	  		-Run�� Wallet�� �� Ŭ������ �����Ѵ�. 
//	  		-Wallet���� getter�� setter�� �����, toString �޼ҵ嵵 �������̵��Ѵ�.
//	  		-������ �̿� ���� �ִ´�.
//	 			private int card;	//ī��
//	 			private final int money = 0;	//��
//	 			private String bill;	//������
//	 			private String id;	//�ź���
//	 
//			-���� �����ε��� 3����, ���� �Ű������� �ٸ��� �޴´�.
//				int card, String bill, String id
//	            int card, String bill
//	            String bill, String id
//			-RunŬ�������� ���ڸ� �־� Wallet�� ȣ���ϸ� ��¿��ÿ� ���� ��¹��� ����ϵ����Ѵ�.
//	 		-�� �ܴ� ��� ���ø� �����Ѵ�.
//	 
//	  ��� ���� : 
//	���ҸŴ� 3�� ī�带 ���. ������ 0�� �ۿ� ������. �����ߺ��ӿ��� ���.
//	1�� ī�� ī�信�� ��.
//	ȫ�浿���� �ʰ��Կ��� ��.
//	

	private int card;	//ī��
	private final int money = 0;	//��
	private String bill;	//������
	private String id;	//�ź���

	public Wallet(int card, String bill, String id) {
		super();
		this.card = card;
		this.bill = bill;
		this.id = id;
	}
	
	public Wallet(int card, String bill) {
		System.out.println(card + "�� ī�� " + bill + "���� ��.");
	}
	public Wallet(String bill, String id) {
		System.out.println(id + "���� " + bill + "���� ��.");
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
		return  id + "�� " +card + "�� ī�带 ���. ������ " + money + "�� �ۿ� ������. " + bill + "���� ���.";
	}



}


