package p_3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*<<제어문 문제>>
		 * 목표 : 간단한 제어문으로 꾸미기를 해보자.
		 * 요구 : if문과 case문을 쓸것.
		 * */

		Q3 q = new Q3();
		q.Q3_1();
	}

	public void Q3_1() {
		char select;
		int num1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("머리 어깨 무릎 발 무릎 발~");
		System.out.println("머리와 옷을 골라줘!");
		
		System.out.print("(단발/롱) : ");
		select = sc.nextLine().charAt(0);
		System.out.println("(1. 드레스/2. 캐주얼/3. 우주복) : ");
		num1 = sc.nextInt();
		
		if(select == '단') {
			System.out.print("단발머리~ 에 ");
		}else if(select == '롤'){
			System.out.print("긴생머리~ 에 ");
		}
		
		switch (num1) {
		case 1:System.out.println("옷자락을 흩날리네~");break;
		case 2:System.out.println("청바지를 입고 있네~");break;
		case 3:System.out.println("머리가 보이지도 않네~");break;

		default:System.out.println("룰루랄라");break;
		}
		
	}

}
