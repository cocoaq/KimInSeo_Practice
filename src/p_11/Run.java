package p_11;

public class Run {

	public static void main(String[] args) {
		//		<<GUI와 이벤트>>
		//		목표 : JFrame과 JButton을 이용하여 간단한 프로그램을 만들자.
		//		요구 : 500X300 사이즈의 창을 띄우고, 버튼을 누르면 아래 JTextArea에 일정한 문구를 출력하자.
		//				1) 레이아웃은 BorderLayout, 버튼은 North, 텍스트 아레아는 Center로 지정
		//				2) 버튼 클릭시, "버튼이 눌렸습니다.\n" 출력.
		//				3) 프레임과 텍스트 아레아 모두 사용자가 사이즈를 바꿀 수 없게 처리한다.
		//		출력 예시 : 		버튼이 눌렸습니다.
		//						버튼이 눌렸습니다.
		//						버튼이 눌렸습니다.
		//						버튼이 눌렸습니다.
		//						버튼이 눌렸습니다.


		MiniP p = new MiniP();
		p.text();
	}

}
