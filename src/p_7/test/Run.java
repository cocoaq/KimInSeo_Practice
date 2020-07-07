package p_7.test;

import java.util.Scanner;

import p_7.test.model.JamToast;
import p_7.test.model.Sandwich;
import p_7.test.model.TunaSand;

public class Run {

	public static void main(String[] args) {
		/*<<상속/다형성>>
		 * 목표 : 추상메소드 써보기
		 * 요구 : 두가지 샌드위치 메뉴를 프로그램으로 만들어 보자.
		 * 
		 * 		-Run과 Sandwich, JamToast, TunaSand의 클래스를 만든다.
		 * 		-Run은 실행용 메인 클래스이다.
		 * 		-Sandwich는 부모 클래스이며, 
		 * 			public abstract String sand(); 를 갖는다.
		 * 		-JamToast는 Sandwich를 상속받은 후손 클래스이다.
		 * 			private int card;	//카드
		 *			private final int money = 0;	//돈
		 *			private String bill;	//영수증
		 *			private String id;	//신분증
		 *
		 *		-이 외는 출력 예시를 참고한다.
		 *
		 * 출력 예시 : 
		 * 	샌드위치 가게입니다.
			1. JamToast
			2. TunaSandwich
			메뉴 번호 입력 : 1
			(    )
			■■■■■■
			======
샌드위치 가게입니다.
1. JamToast
2. TunaSandwich
메뉴 번호 입력 : 3
그런 메뉴는 없습니다.

샌드위치 가게입니다.
1. JamToast
2. TunaSandwich
메뉴 번호 입력 : 2
(    )
######
======



		 * */
		Sandwich sw = new JamToast();
		Sandwich sw2 = new TunaSand();

		Scanner sc = new Scanner(System.in);

		System.out.println("샌드위치 가게입니다.");
		System.out.println("1. JamToast");
		System.out.println("2. TunaSandwich");
		System.out.print("메뉴 번호 입력 : ");
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
		default: System.out.println("그런 메뉴는 없습니다.");
		return;
		}
	}

}
