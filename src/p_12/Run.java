package p_12;

import java.util.Scanner;
import java.util.Stack;

public class Run {

	public static void main(String[] args) {
		//		<<�÷���>>
		//		��ǥ : stack�� ����غ���
		//		�䱸 : ������ Ư¡�� ���Լ����� �̿��Ͽ� ���ڿ��� �������� �������.
		//				1) String�� �Է¹޾� �� ���ڿ��� ������ ����Ѵ�. 
		//				2) charAt()�� ����Ѵ�.
		//				3) push�� pop���� ���ÿ� ������Ѵ�.
		//		��� ���� : 				
		//				���ڿ��� �Է��ϼ��� : �ȳ��ϼ���
        //				�似�ϳ��	
		//						
		//						

		String temp;
		Stack <Character> reverse = new <Character>Stack();	//<char>���׸� ���� ������..
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		temp = sc.nextLine();
		
		for(int i = 0; i < temp.length();i++) {
			reverse.push(temp.charAt(i));
		}
		for(int i = 0; i < temp.length();i++) {
		System.out.print(reverse.pop());
		}
	}

}
