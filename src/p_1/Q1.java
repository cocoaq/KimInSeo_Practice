package p_1;

public class Q1 {

	public static void main(String[] args) {

		/*<<���� ����>>
		 * ��ǥ : ��ǥ���� ��������� �� �������� ����Ʈ ���� �������.
		 * 		(.BYTES ���/���Ұ��ÿ� ����)
		 * �䱸 : ����  �ʱ�ȭ�� �ϰ�, �� ���� ����� ��.
		 * */

		Q1 q = new Q1();
		q.Q1_1();
	}

	public void Q1_1() {

		int vInt = 0;
		double vDouble = 0.0;
		boolean vBoolean = false;
		char vChar = ' ';
		String vString = "";

		System.out.println("�������� ��ǥ ������ int : " + vInt + "/byte : " + Integer.BYTES);
		System.out.println("�Ǽ����� ��ǥ ������ double : " + vDouble + "/byte : " + Double.BYTES);
		System.out.println("������ ��ǥ ������ boolean : " + vBoolean);
		System.out.println("�������� ��ǥ ������ char : " + vChar + "/byte : " + Character.BYTES);
		System.out.println("���ڿ��� ��ǥ ������ String : " + vString);
	}

}
