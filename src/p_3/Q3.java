package p_3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

//		<<��� ����>>
//		  ��ǥ : ������ ������� ���ϴ� ������ �����Ͽ� �ϼ� �غ���.
//		  �䱸 : if���� case���� ����.
//		  ��� ���� :
//		  	�Ӹ� ��� ���� �� ���� ��~
//			(�ܹ�/��) : ��
//			(1. ���ǽ�/2. ĳ�־�/3. ���) : 2
//			||||||||
//			|(������)|
//			|| || ||
//			|     |
//			|     |
//			| | | |
// 			 ��   �� 
// 			
// 			
// 			�Ӹ� ��� ���� �� ���� ��~
//			(�ܹ�/��) : �ܹ�
//			(1. ���ǽ�/2. ĳ�־�/3. ���) : 1
//			||||||||
//			|(������)|
// 			 ||||||
// 			 ||||||
//			||||||||
//  		      ��  �� 
//  		      
//  		      
//  		         �Ӹ� ��� ���� �� ���� ��~
//			(�ܹ�/��) : ��
//			(1. ���ǽ�/2. ĳ�־�/3. ���) : 3
//			||||||||
//			|(������)|
//			|| || ||
//			|     |
//			(     )
//			|  |  |
//  			  �� �� 

		

		Q3 q = new Q3();
		q.Q3_1();
	}

	public void Q3_1() {
		char select;
		int num1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("�Ӹ� ��� ���� �� ���� ��~");

		System.out.print("(��/��) : ");
		select = sc.nextLine().charAt(0);
		System.out.print("(1. ���ǽ�/2. ĳ�־�/3. ���) : ");
		num1 = sc.nextInt();

		if(select == '��') {
			System.out.println("||||||||");
			System.out.println("|(������)|");
		}else if(select == '��'){
			System.out.println("||||||||");
			System.out.println("|(������)|");
			System.out.println("|| || ||");
		}

		switch (num1) {
		case 1:
			System.out.println(" ||||||");
			System.out.println(" ||||||");
			System.out.println("||||||||");
			System.out.println("  ��  �� ");
			break;
		case 2:
			System.out.println("|     |");
			System.out.println("|     |");
			System.out.println("| | | |");
			System.out.println(" ��   �� ");
			break;
		case 3:
			System.out.println("|     |");
			System.out.println("(     )");
			System.out.println("|  |  |");
			System.out.println("  �� �� ");
			break;

		default:System.out.println("������");break;
		}

	}

}
