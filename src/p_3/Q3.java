package p_3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

//		<<제어문 문제>>
//		  목표 : 간단한 제어문으로 원하는 문장을 선택하여 완성 해보자.
//		  요구 : if문과 case문을 쓸것.
//		  출력 예시 :
//		  	머리 어깨 무릎 발 무릎 발~
//			(단발/롱) : 롱
//			(1. 원피스/2. 캐주얼/3. 운동복) : 2
//			||||||||
//			|(ㅇㅁㅇ)|
//			|| || ||
//			|     |
//			|     |
//			| | | |
// 			 ▲   ▲ 
// 			
// 			
// 			머리 어깨 무릎 발 무릎 발~
//			(단발/롱) : 단발
//			(1. 원피스/2. 캐주얼/3. 운동복) : 1
//			||||||||
//			|(ㅇㅅㅇ)|
// 			 ||||||
// 			 ||||||
//			||||||||
//  		      ▲  ▲ 
//  		      
//  		      
//  		         머리 어깨 무릎 발 무릎 발~
//			(단발/롱) : 롱
//			(1. 원피스/2. 캐주얼/3. 운동복) : 3
//			||||||||
//			|(ㅇㅁㅇ)|
//			|| || ||
//			|     |
//			(     )
//			|  |  |
//  			  ▲ ▲ 

		

		Q3 q = new Q3();
		q.Q3_1();
	}

	public void Q3_1() {
		char select;
		int num1 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("머리 어깨 무릎 발 무릎 발~");

		System.out.print("(단/롱) : ");
		select = sc.nextLine().charAt(0);
		System.out.print("(1. 원피스/2. 캐주얼/3. 운동복) : ");
		num1 = sc.nextInt();

		if(select == '단') {
			System.out.println("||||||||");
			System.out.println("|(ㅇㅅㅇ)|");
		}else if(select == '롱'){
			System.out.println("||||||||");
			System.out.println("|(ㅇㅁㅇ)|");
			System.out.println("|| || ||");
		}

		switch (num1) {
		case 1:
			System.out.println(" ||||||");
			System.out.println(" ||||||");
			System.out.println("||||||||");
			System.out.println("  ▲  ▲ ");
			break;
		case 2:
			System.out.println("|     |");
			System.out.println("|     |");
			System.out.println("| | | |");
			System.out.println(" ▲   ▲ ");
			break;
		case 3:
			System.out.println("|     |");
			System.out.println("(     )");
			System.out.println("|  |  |");
			System.out.println("  ▲ ▲ ");
			break;

		default:System.out.println("룰루랄라");break;
		}

	}

}
