package study;
// ���Ͽ� ���� ���
import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			// ���Ͽ� �� ���� ������ ����� �� �ִ� FileWrite ��ü�� �����մϴ�.
			fw = new FileWriter("c:/ppp/song.txt");
			// fw�� ���ڿ��� �ٷ� ��� �� �� �ִ�. 
			String str ="���� ����ʹ�!";
			fw.write(str);
			// �ѱ��� ������ �а� �� �� �ִ� Reader,Writer, �迭�� ��Ʈ����
			// ���������� buffer�� �����ϰ� �ִ�.
			// ������ ���۴� ���۰� ���� ä���������� ��Ʈ���� ���� ��������
			// �׷��� ���� ä������ ���� ���¿��� ���۸� ������� ��� 
			// flush() �޼ҵ带 Ȱ���Ͽ� ���۰� ä������ ���� ���¿����� ���� �Ѵ�.
			fw.flush();
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}finally {
			try {
				if(fw!=null)fw.close();} catch (IOException e) {}
				
		}
	}

}
