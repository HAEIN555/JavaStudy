package study;

import java.io.*;

public class FileCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ����!");
		long start = System.currentTimeMillis();
		FileInputStream src = null; // ������ �о�� ����
		FileOutputStream dest = null;
		try {
			// ���� ������ �б� ���� FileInputStream ��ü ����
			src = new FileInputStream(new File("c:/windows/win.ini"));
			//���� ������ ���� ���� FileOutputStream ��ü ����
			dest = new FileOutputStream(new File("c:/ppp/dest.txt"));
			
			// File InputStream �� ���ؼ� �о���� ���� ������ ���� ����
			int readValue =0;
			// FileInputStream�� read() �޼ҵ带 ��ּ� �о���� ���� readvalue�� ����
			while((readValue = src.read())!=-1) {
				// readValue�� ���� �� ����FileOutputStream�� write�޼ҵ带 ���ؼ� ���Ͽ� ����
				dest.write(readValue);
			}
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {try {
			if(dest != null)
			dest.close(); // �ݵ�� ���־����!
			}catch(IOException ie) {
			ie.printStackTrace();
		}}
		// �ð��� ���ϴ� �� 
		long end  = System.currentTimeMillis();
		long copyTime = (end-start)/1000;
		System.out.println("���翡 �ɸ� �ð� :"+copyTime+"��" );
	}

}
