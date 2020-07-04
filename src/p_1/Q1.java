package p_1;

public class Q1 {

	public static void main(String[] args) {

		/*<<변수 문제>>
		 * 목표 : 각각의 데이터 타입에 따라 주로 사용하는 변수형들과 그 변수들의 바이트 값을 출력하자.
		 * 
		 * 		(.BYTES 사용/사용불가시에 공란)
		 * 요구 : 각각  초기화를 하고, 그 값을 출력할 것.
		 * 출력 예시 : 
		 * 	정수형의 대표 변수형 int : 0/byte : 4
			실수형의 대표 변수형 double : 0.0/byte : 8
			논리형의 대표 변수형 boolean : false
			문자형의 대표 변수형 char :  /byte : 2
			문자열의 대표 변수형 String : 

		 * */

		Q1 q = new Q1();
		q.Q1_1();
	}

	public void Q1_1() {

		int vInt = 0;
		double vDouble = 0.0;
		boolean vBoolean = false;
		char vChar = ' ';
		String vString = "";

		System.out.println("정수형의 대표 변수형 int : " + vInt + "/byte : " + Integer.BYTES);
		System.out.println("실수형의 대표 변수형 double : " + vDouble + "/byte : " + Double.BYTES);
		System.out.println("논리형의 대표 변수형 boolean : " + vBoolean);
		System.out.println("문자형의 대표 변수형 char : " + vChar + "/byte : " + Character.BYTES);
		System.out.println("문자열의 대표 변수형 String : " + vString);
	}

}
