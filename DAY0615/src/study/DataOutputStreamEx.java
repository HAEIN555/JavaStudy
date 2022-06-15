package study;
/* DataInputStream�� DataOutputStream
 * 
 * DataOutputStream
 * Ư�� ������ Ÿ�԰� ������ ������ä �����͸� ����ϰ� �о�� �� �ִ� ��Ʈ��
 * Ư�� ������ Ÿ�԰� ���信 �°� �а� �� �� �ִ� �޼ҵ带 ����
 * 		writeBoolean,readBoolean,readInt,writeInt,readUTF,writeUTF
 * 
 * 
 */
import java.io.*;
public class DataOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DataOutputStream�� �⺻ �ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ����� �� ����
		// DataOutputStream�� 1�� ��Ʈ���� �ƴϱ⶧���� �ٸ� ��Ʈ���� �̿��ؼ� 
		// Ư�� ��ġ�� ����� �� �ִ�. 
		DataOutputStream dos = null; //2��
		FileOutputStream fos = null; //1��
		// ���� ������� �Ҷ����� �׻� ����ó���� �ʿ��ϴ� 
		try {
			// DataOutputStream�� ����� FileOutputStream
			fos = new FileOutputStream("c:/ppp/data.sav");
			// �⺻ �ڷ����� Ÿ���� ������ä ����� �� �ִ� DataOutputStream��ü ����
			dos = new DataOutputStream(fos);
			
			int i=10;
			double d=3.14;
			String s ="���� �ڹٸ� 1�� �𸣰Ե�";
			//DataOutputStream �� �⺻ �ڷ��� ���� �����ϴ� write�޼ҵ尡 ������ 
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			// �� ��� ������� �о�� �Ѵ� 
			
			
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}finally {
			try {
				if(fos!=null)fos.close();} catch (IOException e) {}
				try{if(dos!=null)dos.close();} catch (IOException e) {}
		}
	}

}
