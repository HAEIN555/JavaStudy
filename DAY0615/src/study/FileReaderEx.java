package study;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			// ���Ϸκ��� �ѹ��� ������ �о��  �� �ִ� ���� FileReader��ü�� ����
			fr = new FileReader("c:/ppp/song.txt");
			// ���� �����ڵ� ������ ����Ǿ� ���� �̰��� ��Ʈ������ �ٲپ� �ش�.
			// ��Ʈ���� ���ؼ� �о���� �����ڵ� ���� ������ ���� ����
			int readValue =0;
			while((readValue=fr.read())!=-1) {
				System.out.print((char)readValue);
				// �����ڵ� ���� char������ ��ȯ��Ų��. // ���� ������ -> ���� ���� �ʹ�! 
			}
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();} catch (IOException e) {}
				
		}
	}

}
