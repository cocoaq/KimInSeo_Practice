package p_5;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*<<2차원 배열 문제>>
		 * 목표 : 2차원 배열의 구조를 출력해 보자.
		 * 요구 : 인덱스를 입력받아 초기화 상태의 2차원 배열의 모습을 출력해 보자.
		 * 입력 예시 : 5 2
		 * 출력 예시 : 
		 * 	배열 크기1을 입력 : 5
			배열 크기2를 입력 : 2
			00000
			00000

		 * */
		int num1;
		int num2;


		Scanner sc = new Scanner(System.in);

		System.out.print("배열 크기1을 입력 : ");
		num1 = sc.nextInt();
		int [][] arr = new int[num1][];
		System.out.print("배열 크기2를 입력 : ");
		num2 = sc.nextInt();
		arr = new int[num1][num2];

		for(int i = 0; i <= num1 - 1; i++) {
			for(int j = 0; j <= num2 - 1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}

}
