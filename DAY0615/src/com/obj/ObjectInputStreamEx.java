package com.obj;
import java.io.*;
public class ObjectInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		
		try {
			// 파일에 저장된 객체를 읽어오기 위해서 ObjectInputStream 객체 생성
			ois = new ObjectInputStream(new FileInputStream("c:/ppp/obj.txt"));
			
			//  ObjectInputStream은 스트림으로부터 읽어들인 직렬화된 객체를 
			// 	 역직렬화 해서 객체를 생성할 수 있음
			// 	  역직렬화 할때 필요한 클래스를 찾지 못하면 예외(ClassNotFoundException)가 발생됨
			
			Data data =(Data)ois.readObject();
			System.out.println("번호"+data.getNo());
			System.out.println("이름"+data.getName());
			System.out.println("메일"+data.getMail());
				
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
