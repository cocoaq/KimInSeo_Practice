package p_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*<<������ ����>>
		 * ��ǥ : ������ ���� �����ڸ� �ٽ� ��¤��, ���� ���� �����ڸ� �Ẹ��.
		 * �䱸 : ������ ������ �������� ��������� ��µ� ��.
		 * 		���׿����ڸ� ���� �б⹮ó�� ����� �� ��.
		 * */

		Q2 q = new Q2();
		q.Q2_1();
		q.Q2_2();
	}

	public void Q2_1() {

		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ : ");
		num1 = sc.nextInt();
		System.out.print("���� ������ : ");
		num2 = sc.nextInt();

		System.out.println("============================");
		System.out.println("���� ��");
		System.out.println(num1);
		System.out.println(num2);

		System.out.println("============================");
		System.out.println("���� ��");
		System.out.println(++num1);
		System.out.println(num2++);

		System.out.println("============================");
		System.out.println("���� ����");
		System.out.println(num1);
		System.out.println(num2);


	}


	private void Q2_2() {

		double kg_;
		int cm;
		boolean yes = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("===���� �ڰ� ����===");

		System.out.print("Ű : ");
		kg_ = sc.nextDouble();
		System.out.print("������ :");
		cm = sc.nextInt();
		
		yes = (kg_ > 45.0) && (cm > 160.0)? yes == true : yes == false;
		
		System.out.println(yes);
	}
}
