package study;
import java.io.*;
public class FileCopyEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ����!");
		long start = System.currentTimeMillis();
		FileInputStream src = null; // ������ �о�� ����
		FileOutputStream dest = null;
		try {
			// ���� ������ �б� ���� FileInputStream ��ü ����
			src = new FileInputStream(new File("c:/ppp/idontknow.txt"));
			//���� ������ ���� ���� FileOutputStream ��ü ����
			dest = new FileOutputStream(new File("c:/ppp/des.txt"));
			
			// �ӽ�����ҿ� �����data�� ��ü������ ������ ������ ����
			int length=0;
			//�ӽ�����ҷ� ����� byte[]�迭����
			byte[] buffer = new byte[1024*8];
			//InputStream�� ���ؼ� �о�帰 �����͸� �ӽ�����ҿ� �����ϰ� �����
			//�������� ���̸�ŭ length�� ������
			while((length = src.read(buffer))!=-1) {
				// OutputStream�� ���ؼ� �ӽ�����ҿ� ����Ǿ��ִ� �����͸� length��ŭ ���Ͽ� ����
				dest.write(buffer, 0, length);
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
