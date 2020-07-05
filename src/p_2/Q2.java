package p_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*<<연산자 문제1>>
		 * 목표 : 전위와 후위 연산자를 다시 되짚자.
		 * 요구 : 전위와 후위의 차이점이 도드라지게 출력될 것.
		 * 
		 * 입력 예시 : 3  3
		 * 출력 예시 : 
		 * 	전위 연산자 : 3
			후위 연산자 : 3
			============================
			연산 전
			3
			3
			============================
			연산 중
			4
			3
			============================
			연산 이후
			4
			4
		 * */
		/*<<연산자 문제2>>
		 * 목표 : 이중 삼항 연산자를 사용하여 입력받은 키와 몸무계로 헌혈이 가능한지 간단하게 판별하는 프로그램을 작성하자.
		 * 요구 : 삼항연산자를 통해 분기문처럼 사용해 볼 것. 
		 * 		키와 몸무계는 정수형으로 입력받을 것.
		 * 		키는 160cm이상, 몸무계는 45kg이상 일시 헌혈이 가능함.
		 * 출력 예시 : 
		 * 	===헌혈 자가 진단===
			키 : 130
			몸무계 :80
			불가능

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

		System.out.print("전위 연산자 : ");
		num1 = sc.nextInt();
		System.out.print("후위 연산자 : ");
		num2 = sc.nextInt();

		System.out.println("============================");
		System.out.println("연산 전");
		System.out.println(num1);
		System.out.println(num2);

		System.out.println("============================");
		System.out.println("연산 중");
		System.out.println(++num1);
		System.out.println(num2++);

		System.out.println("============================");
		System.out.println("연산 이후");
		System.out.println(num1);
		System.out.println(num2);


	}


	private void Q2_2() {

		int cm;
		int kg;

		Scanner sc = new Scanner(System.in);

		System.out.println("===헌혈 자가 진단===");

		System.out.print("키 : ");
		cm = sc.nextInt();
		System.out.print("몸무계 :");
		kg = sc.nextInt();
		
		
		System.out.println(
		(cm >= 160)? ((kg >= 45)? "가능" :"불가능") : "불가능" );
	}
}
