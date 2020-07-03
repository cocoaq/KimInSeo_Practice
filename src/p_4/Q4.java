package p_4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		/*<<배열 문제>>
		 * 목표 : 배열 복사의 두 가지 숙지하기
		 * 요구 : 배열 복사를 하되, 기존의 배열에는 영향을 주지 않을 것.
		 * */
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.println("배열 arr의 정보 출력");
		System.out.println("arr의 길이 : " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr의 "+ i +"번째 값 : " + arr[i]);
		}
		System.out.println("arr의 hashCode주소 : " + arr.hashCode());

		int[] arr1 = arr;
		System.out.println("int[] arr1 = arr;");

		arr1[0] = 3;

		System.out.println("arr1[0] = 3;");
		System.out.println("배열 arr1의 정보 출력");
		System.out.println("arr1의 길이 : " + arr1.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr1의 "+ i +"번째 값 : " + arr1[i]);
		}
		System.out.println("arr1의 hashCode주소 : " + arr1.hashCode());
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr의 "+ i +"번째 값 : " + arr[i]);
		}
	}

}
