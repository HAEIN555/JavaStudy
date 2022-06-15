package study;
import java.io.*;
public class FileInputStreamEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		byte _read[] = new byte[100];
		// ������ �б� ���� byte�迭����
		byte _console[] = new byte[100];
		// Ű����� �Է��� ���� �о console�迭�� ����
		// ���� ������Ҷ� ����ó��!
		try {
			System.out.print("���� �� :");
			System.in.read(_console);
			
			String file = new String(_console).trim(); // trim�� ������ ������ �����Ҷ� ���!
			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());
		} catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
				fis.close(); // �ݵ�� ���־����!
				}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}

}
