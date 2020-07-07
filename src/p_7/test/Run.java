package p_7.test;

import java.util.Scanner;

import p_7.test.model.JamToast;
import p_7.test.model.Sandwich;
import p_7.test.model.TunaSand;

public class Run {

	public static void main(String[] args) {
		/*<<���/������>>
		 * ��ǥ : �߻�޼ҵ� �Ẹ��
		 * �䱸 : �ΰ��� ������ġ �޴��� ���α׷����� ����� ����.
		 * 
		 * 		-Run�� Sandwich, JamToast, TunaSand�� Ŭ������ �����.
		 * 		-Run�� ����� ���� Ŭ�����̴�.
		 * 		-Sandwich�� �θ� Ŭ�����̸�, 
		 * 			public abstract String sand(); �� ���´�.
		 * 		-JamToast�� Sandwich�� ��ӹ��� �ļ� Ŭ�����̴�.
		 * 			private int card;	//ī��
		 *			private final int money = 0;	//��
		 *			private String bill;	//������
		 *			private String id;	//�ź���
		 *
		 *		-�� �ܴ� ��� ���ø� �����Ѵ�.
		 *
		 * ��� ���� : 
		 * 	������ġ �����Դϴ�.
			1. JamToast
			2. TunaSandwich
			�޴� ��ȣ �Է� : 1
			(    )
			�������
			======
������ġ �����Դϴ�.
1. JamToast
2. TunaSandwich
�޴� ��ȣ �Է� : 3
�׷� �޴��� �����ϴ�.

������ġ �����Դϴ�.
1. JamToast
2. TunaSandwich
�޴� ��ȣ �Է� : 2
(    )
######
======



		 * */
		Sandwich sw = new JamToast();
		Sandwich sw2 = new TunaSand();

		Scanner sc = new Scanner(System.in);

		System.out.println("������ġ �����Դϴ�.");
		System.out.println("1. JamToast");
		System.out.println("2. TunaSandwich");
		System.out.print("�޴� ��ȣ �Է� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			if(sw instanceof JamToast) {
				sw.breadUp();
				System.out.println(sw.sand());
				sw.breadDown();
			}

			break;

		case 2:
			if(sw2 instanceof TunaSand) {
				sw2.breadUp();
				System.out.println(sw2.sand());
				sw2.breadDown();
			}
			break;
		default: System.out.println("�׷� �޴��� �����ϴ�.");
		return;
		}
	}

}
