package P_10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q10 {

	public static void main(String[] args) {
		//		<<�����>>
		//		��ǥ : �ؽ�Ʈ ������ �����  ������ �����ϰ�, ������ Ȯ���غ���.
		//		�䱸 : ���� ������� �ٽ� �� �� ������. ����ó���� �������.
		//		��� ���� : 
		//			1)mini.txt ������ �����Ѵ�.
		//			2)(�ǵ���) Buffered�� ����Ͽ� ������ ��ũ��Ʈ�� ���Ͽ� ��������
		//				-�ϴ��� �Ķ��� ������ Ǫ����

		File file = new File("mini.txt");

		BufferedWriter w = null;

		try {
			w = new BufferedWriter(new FileWriter("mini.txt"));
			w.write("�ϴ��� �Ķ��� ������ Ǫ����");
			w.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}