package p_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*<<������ ����1>>
		 * ��ǥ : ������ ���� �����ڸ� �ٽ� ��¤��.
		 * �䱸 : ������ ������ �������� ��������� ��µ� ��.
		 * 
		 * �Է� ���� : 3  3
		 * ��� ���� : 
		 * 	���� ������ : 3
			���� ������ : 3
			============================
			���� ��
			3
			3
			============================
			���� ��
			4
			3
			============================
			���� ����
			4
			4
		 * */
		/*<<������ ����2>>
		 * ��ǥ : ���� ���� �����ڸ� ����Ͽ� �Է¹��� Ű�� ������� ������ �������� �����ϰ� �Ǻ��ϴ� ���α׷��� �ۼ�����.
		 * �䱸 : ���׿����ڸ� ���� �б⹮ó�� ����� �� ��. 
		 * 		Ű�� ������� ���������� �Է¹��� ��.
		 * 		Ű�� 160cm�̻�, ������� 45kg�̻� �Ͻ� ������ ������.
		 * ��� ���� : 
		 * 	===���� �ڰ� ����===
			Ű : 130
			������ :80
			�Ұ���

		 * 
		 * */

		Q2 q = new Q2();
//		q.Q2_1();
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

		int cm;
		int kg;

		Scanner sc = new Scanner(System.in);

		System.out.println("===���� �ڰ� ����===");

		System.out.print("Ű : ");
		cm = sc.nextInt();
		System.out.print("������ :");
		kg = sc.nextInt();
		
		
		System.out.println(
		(cm >= 160)? ((kg >= 45)? "����" :"�Ұ���") : "�Ұ���" );
	}
}
