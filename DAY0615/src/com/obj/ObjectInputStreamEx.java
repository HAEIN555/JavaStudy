package com.obj;
import java.io.*;
public class ObjectInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		
		try {
			// ���Ͽ� ����� ��ü�� �о���� ���ؼ� ObjectInputStream ��ü ����
			ois = new ObjectInputStream(new FileInputStream("c:/ppp/obj.txt"));
			
			//  ObjectInputStream�� ��Ʈ�����κ��� �о���� ����ȭ�� ��ü�� 
			// 	 ������ȭ �ؼ� ��ü�� ������ �� ����
			// 	  ������ȭ �Ҷ� �ʿ��� Ŭ������ ã�� ���ϸ� ����(ClassNotFoundException)�� �߻���
			
			Data data =(Data)ois.readObject();
			System.out.println("��ȣ"+data.getNo());
			System.out.println("�̸�"+data.getName());
			System.out.println("����"+data.getMail());
				
		}catch (ClassNotFoundException cnfe) {
			// TODO: handle exception
			cnfe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ii) {
			// TODO: handle exception
			ii.printStackTrace();
		}finally {
			try {if(ois!=null)ois.close();} catch (IOException e) {}
		}
	}

}
