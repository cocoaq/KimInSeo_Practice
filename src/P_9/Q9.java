package P_9;

import java.util.Scanner;

public class Q9 extends Puser{

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
