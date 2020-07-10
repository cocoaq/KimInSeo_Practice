package P_9;

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Manager extends Puser{
	Scanner sc = new Scanner(System.in);
	int num;
	int score = 0;


	public Manager(String name, int life, boolean you) {
		super(name, life, you);
	}

	public void start(String name) {

		System.out.println(getName() + "님 이군요!");
		setYou(false);
		while (isYou() == false) {



			System.out.println("정보 출력 : 1 ");
			System.out.println("문제 풀기 : 2");
			System.out.println("나가기 : 3");
			System.out.print("입력하기 : ");
			num = sc.nextInt();

			switch (num) {
			case 1: System.out.println(toString());break;
			case 2: QnA();break;
			case 3: return;

			default: System.out.println("잘못된 입력");
			break;
			}
		}
	}

	private void QnA() {
		if(getLife() != 0) {
			System.out.print("Q.1 거미의 다리 갯수는? : ");
			num = sc.nextInt();
			if(num == 6) {
				System.out.println("정답");
				System.out.print("Q.2 결혼반지는 몇번째 손가락에 끼는가? : ");
				num = sc.nextInt();
				if(num == 4) {
					System.out.println("정답");
					System.out.print("Q.3 개나리 꽃의 꽃잎 수는? : ");
					num = sc.nextInt();
					if(num == 1){
						System.out.println("정답");
						setYou(true);
						start(getName());

					}else {
						setLife((getLife() - 1));
						System.out.println("탈락. " + getLife() + " 남았습니다.");
					}
				}else {
					setLife((getLife() - 1));
					System.out.println("탈락. " + getLife() + " 남았습니다.");
				}
			}else {
				setLife((getLife() - 1));
				System.out.println("탈락. " + getLife() + " 남았습니다.");
			}
		}else if(getLife() == 0) {
			System.out.println("당신은 죽었습니다.");
			System.exit(0);
		}
	}

}
