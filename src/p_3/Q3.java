package p_3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*<<��� ����>>
		 * ��ǥ : ������ ������� �ٹ̱⸦ �غ���.
		 * �䱸 : if���� case���� ����.
		 * */

		Q3 q = new Q3();
		q.Q3_1();
	}

	public void Q3_1() {
		char select;
		int num1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ӹ� ��� ���� �� ���� ��~");
		System.out.println("�Ӹ��� ���� �����!");
		
		System.out.print("(�ܹ�/��) : ");
		select = sc.nextLine().charAt(0);
		System.out.println("(1. �巹��/2. ĳ�־�/3. ���ֺ�) : ");
		num1 = sc.nextInt();
		
		if(select == '��') {
			System.out.print("�ܹ߸Ӹ�~ �� ");
		}else if(select == '��'){
			System.out.print("����Ӹ�~ �� ");
		}
		
		switch (num1) {
		case 1:System.out.println("���ڶ��� �𳯸���~");break;
		case 2:System.out.println("û������ �԰� �ֳ�~");break;
		case 3:System.out.println("�Ӹ��� �������� �ʳ�~");break;

		default:System.out.println("������");break;
		}
		
	}

}
