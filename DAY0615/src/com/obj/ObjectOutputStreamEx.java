package com.obj;
import java.io.*;
// ����ȭ �� ��ü�� ���Ͽ� ���� 
public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectOutputStream oos = null;
		
		try {
			// �ڹٰ� ���� �޸� jvm 
			// �޸𸮿�  ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ���� 
			// ����� �� �ִ� ObjectOutputStream ��ü�� ���� 
			oos = new ObjectOutputStream(new FileOutputStream("c:/ppp/obj.txt"));
			
			//ObjectOutputStream �� ���ؼ� ����ȭ�� �� ������ ��ϵ� Data��ü�� ����
			// ��ü�� �����ϱ� �� �ݵ�� Serializable�� �����ϰ� �־���Ѵ�.
			
			Data data = new Data();
			data.setNo(30);
			data.setName("ȫ�浿");
			data.setMail("hongknong@naver.com");
			// ObjectOutputStream�� ��ü�� ����ȭ �ؼ� ��Ʈ���� ���� 
			// ������ �� �ִ� writeObject()�޼ҵ带 Ȱ���� 
			oos.writeObject(data);
			
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ii) {
			// TODO: handle exception
			ii.printStackTrace();
		}finally {
			try {if(oos!=null)oos.close();} catch (IOException e) {}
		}
	}
}
