package P_9;

import java.util.Scanner;

public class Q9 extends Puser{
	
	/*<종합>
	 * 1. 풀지마시고 참고하시라고 올립니다.
	 * 2. 풀으실거라면 아래를 참고해주세요
	 * 
	 * 1)간단한 텍스트 퀴즈게임을 만들자.
	 * 2)switch/if문을 이용하여 퀴즈 게임을 만든다.
	 *  - 자신의 상태를 확인할 수 있어야 한다.
	 *  - 생명이 0이면 시스템이 멈추어야 한다.
	 *  - 유저의 이름을 받을 것. 유저는 객체로 만들어져 있어야 한다.
	 * 
	 * 
	 * 퀴즈게임 시작~!
Q.0 당신의 이름은? : user
user님 이군요!
정보 출력 : 1 
문제 풀기 : 2
나가기 : 3
입력하기 : 1
유저 이름 : user
생명 : 3
정보 출력 : 1 
문제 풀기 : 2
나가기 : 3
입력하기 : 2
Q.1 거미의 다리 갯수는? : 6
정답
Q.2 결혼반지는 몇번째 손가락에 끼는가? : 4
정답
Q.3 개나리 꽃의 꽃잎 수는? : 3
탈락. 2 남았습니다.
정보 출력 : 1 
문제 풀기 : 2
나가기 : 3
입력하기 : 1
유저 이름 : user
생명 : 2
정보 출력 : 1 
문제 풀기 : 2
나가기 : 3
입력하기 : 2
Q.1 거미의 다리 갯수는? : 1
탈락. 1 남았습니다.
정보 출력 : 1 
문제 풀기 : 2
나가기 : 3
입력하기 : 2
Q.1 거미의 다리 갯수는? : 6
정답
Q.2 결혼반지는 몇번째 손가락에 끼는가? : 4
정답
Q.3 개나리 꽃의 꽃잎 수는? : 1
정답
user님 이군요!
정보 출력 : 1 
문제 풀기 : 2
나가기 : 3
입력하기 : 2
Q.1 거미의 다리 갯수는? : 
	 * */

	public Q9(String name, int life, boolean you) {
		super(name, life, you);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("퀴즈게임 시작~!");
		System.out.print("Q.0 당신의 이름은? : ");
		name = sc.nextLine();

		Manager manager =  new Manager(name, 3, false);
		manager.start(name);
	}

}
