package P_10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q10 {

	public static void main(String[] args) {
		//		<<입출력>>
		//		목표 : 텍스트 파일을 만들어  내용을 저장하고, 파일을 확인해보자.
		//		요구 : 파일 입출력을 다시 한 번 익히자. 예외처리도 사용하자.
		//		출력 예시 : 
		//			1)mini.txt 파일을 생성한다.
		//			2)(되도록) Buffered를 사용하여 다음의 스크립트를 파일에 저장하자
		//				-하늘은 파랗고 지구는 푸르다

		File file = new File("mini.txt");

		BufferedWriter w = null;

		try {
			w = new BufferedWriter(new FileWriter("mini.txt"));
			w.write("하늘은 파랗고 지구는 푸르다");
			w.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}