package p_5;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*<<2���� �迭 ����>>
		 * ��ǥ : 2���� �迭�� ������ ����� ����.
		 * �䱸 : �ε����� �Է¹޾� �ʱ�ȭ ������ 2���� �迭�� ����� ����.
		 * */
		int num1;
		int num2;


		Scanner sc = new Scanner(System.in);

		System.out.print("�迭 ũ��1�� �Է� : ");
		num1 = sc.nextInt();
		int [][] arr = new int[num1][];
		System.out.print("�迭 ũ��2�� �Է� : ");
		num2 = sc.nextInt();
		arr = new int[num1][num2];

		for(int i = 0; i <= num2 - 1; i++) {
			for(int j = 0; j <= num1 - 1; j++) {
				System.out.print(arr[j][i]);
			}
			System.out.println("");
		}
	}

}
