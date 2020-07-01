package p_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*<<연산자 문제>>
		 * 목표 : 전위와 후위 연산자를 다시 되짚고, 이중 삼항 연산자를 써보자.
		 * 요구 : 전위와 후위의 차이점이 도드라지게 출력될 것.
		 * 		삼항연산자를 통해 분기문처럼 사용해 볼 것.
		 * */

		Q2 q = new Q2();
		q.Q2_1();
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

		double kg_;
		int cm;
		boolean yes = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("===헌혈 자가 진단===");

		System.out.print("키 : ");
		kg_ = sc.nextDouble();
		System.out.print("몸무계 :");
		cm = sc.nextInt();
		
		yes = (kg_ > 45.0) && (cm > 160.0)? yes == true : yes == false;
		
		System.out.println(yes);
	}
}
