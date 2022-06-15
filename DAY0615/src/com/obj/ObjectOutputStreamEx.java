package com.obj;
import java.io.*;
// 직렬화 된 객체를 파일에 저장 
public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectOutputStream oos = null;
		
		try {
			// 자바가 쓰는 메모리 jvm 
			// 메모리에  생성된 객체를 직렬화 해서 스트림을 통해 
			// 기록할 수 있는 ObjectOutputStream 객체를 생성 
			oos = new ObjectOutputStream(new FileOutputStream("c:/ppp/obj.txt"));
			
			//ObjectOutputStream 을 통해서 직렬화된 후 파일을 기록될 Data객체를 생성
			// 객체를 생성하기 전 반드시 Serializable을 구현하고 있어야한다.
			
			Data data = new Data();
			data.setNo(30);
			data.setName("홍길동");
			data.setMail("hongknong@naver.com");
			// ObjectOutputStream을 객체를 직렬화 해서 스트림을 통해 
			// 저장할 수 있는 writeObject()메소드를 활용함 
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
