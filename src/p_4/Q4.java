package p_4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		/*<<�迭 ����>>
		 * ��ǥ : �迭 ������ ���� ����� ���� ������ �ٸ� ���� �����ϱ�.
		 * 		���� �ּҰ��� ����غ���.
		 * �䱸 : �迭 ���縦 �ϵ�, ������ �迭���� ������ ���� ���� ��.
		 * ��� ���� : 
		 * 
�迭 arr�� ���� ���
arr�� ���� : 5
arr�� 0��° �� : 0
arr�� 1��° �� : 0
arr�� 2��° �� : 0
arr�� 3��° �� : 0
arr�� 4��° �� : 0
arr�� hashCode�ּ� : 356573597
int[] arr1 = arr;
arr1[0] = 3;
�迭 arr1�� ���� ���
arr1�� ���� : 5
arr1�� 0��° �� : 3
arr1�� 1��° �� : 0
arr1�� 2��° �� : 0
arr1�� 3��° �� : 0
arr1�� 4��° �� : 0
arr1�� hashCode�ּ� : 356573597
arr�� 0��° �� : 3
arr�� 1��° �� : 0
arr�� 2��° �� : 0
arr�� 3��° �� : 0
arr�� 4��° �� : 0

		 * */
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("�迭 arr�� ���� ���");
		System.out.println("arr�� ���� : " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr�� "+ i +"��° �� : " + arr[i]);
		}
		System.out.println("arr�� hashCode�ּ� : " + arr.hashCode());

		int[] arr1 = arr;
		System.out.println("int[] arr1 = arr;");

		arr1[0] = 3;

		System.out.println("arr1[0] = 3;");
		System.out.println("�迭 arr1�� ���� ���");
		System.out.println("arr1�� ���� : " + arr1.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr1�� "+ i +"��° �� : " + arr1[i]);
		}
		System.out.println("arr1�� hashCode�ּ� : " + arr1.hashCode());
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr�� "+ i +"��° �� : " + arr[i]);
		}
	}

}
