package P_9;

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Manager extends Puser{
	Scanner sc = new Scanner(System.in);
	int num;
	int score = 0;


	public Manager(String name, int life, boolean you) {
		super(name, life, you);
	}

	public void start(String name) {

		System.out.println(getName() + "�� �̱���!");
		setYou(false);
		while (isYou() == false) {



			System.out.println("���� ��� : 1 ");
			System.out.println("���� Ǯ�� : 2");
			System.out.println("������ : 3");
			System.out.print("�Է��ϱ� : ");
			num = sc.nextInt();

			switch (num) {
			case 1: System.out.println(toString());break;
			case 2: QnA();break;
			case 3: return;

			default: System.out.println("�߸��� �Է�");
			break;
			}
		}
	}

	private void QnA() {
		if(getLife() != 0) {
			System.out.print("Q.1 �Ź��� �ٸ� ������? : ");
			num = sc.nextInt();
			if(num == 6) {
				System.out.println("����");
				System.out.print("Q.2 ��ȥ������ ���° �հ����� ���°�? : ");
				num = sc.nextInt();
				if(num == 4) {
					System.out.println("����");
					System.out.print("Q.3 ������ ���� ���� ����? : ");
					num = sc.nextInt();
					if(num == 1){
						System.out.println("����");
						setYou(true);
						start(getName());

					}else {
						setLife((getLife() - 1));
						System.out.println("Ż��. " + getLife() + " ���ҽ��ϴ�.");
					}
				}else {
					setLife((getLife() - 1));
					System.out.println("Ż��. " + getLife() + " ���ҽ��ϴ�.");
				}
			}else {
				setLife((getLife() - 1));
				System.out.println("Ż��. " + getLife() + " ���ҽ��ϴ�.");
			}
		}else if(getLife() == 0) {
			System.out.println("����� �׾����ϴ�.");
			System.exit(0);
		}
	}

}