package p_8;

public class Q_8 {

	public static void main(String[] args) {
		/*<<���>>
		 * ��ǥ : ��� �׽�Ʈ�ϱ�
		 * �䱸 : �θ� Ŭ������ Phone�� ������ �ڽ� Ŭ������ Iphone, AndroidŬ������ ����� �������̵��� �غ���.
		 * 
		 * 		-PhoneŬ����
		 * 			String name;	//�̸�
	     * 			int price;	//����
		 * 
		 * 		-IphoneŬ����
		 * 			int Pnumber;	//�����ȣ
		 * 		-AndroidŬ����
		 * 			int date;	//�����Ⱓ
		 * 
		 * 		-Phone�� Iphone�� toString()�� ����� �д�.
		 *		-toString()�� ���Ҹ��� ����ϴ� ���� ��ǥ�� �Ѵ�. ��, �������̵��� �̿��Ѵ�. 
		 *
		 * ��� ���� : 
		 * 	Phone [name=������, price=300000]
		 *	Iphone [Pnumber=1, name=�鼳����, price=1000000]
		 *
		 *  �츮������~
		 *	���������~
		 *	���ֿ��ֿ���~ 
		 * */
		Phone p = new Phone("������", 300000, 016);
		Phone p1 = new Iphone("�鼳����", 1000000, 010, 001);
		Phone p2 = new Android("����", 1100000, 010, 20200709);
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
		System.out.println("");
		System.out.println(p.call());
		System.out.println(p1.call());
		System.out.println(p2.call());
	}

}
