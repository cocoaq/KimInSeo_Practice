package p_12;

import java.util.Scanner;
import java.util.Stack;

public class Run {

	public static void main(String[] args) {
		//		<<컬렉션>>
		//		목표 : stack을 사용해보자
		//		요구 : 스텍의 특징인 후입선출을 이용하여 문자열을 역순으로 출력하자.
		//				1) String을 입력받아 그 문자열의 역순을 출력한다. 
		//				2) charAt()을 사용한다.
		//				3) push와 pop으로 스택에 입출력한다.
		//		출력 예시 : 				
		//				문자열을 입력하세요 : 안녕하세요
        //				요세하녕안	
		//						
		//						

		String temp;
		Stack <Character> reverse = new <Character>Stack();	//<char>제네릭 사용시 에러남..
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		temp = sc.nextLine();
		
		for(int i = 0; i < temp.length();i++) {
			reverse.push(temp.charAt(i));
		}
		for(int i = 0; i < temp.length();i++) {
		System.out.print(reverse.pop());
		}
	}

}
