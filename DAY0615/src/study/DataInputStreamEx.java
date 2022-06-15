package study;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		DataInputStream dis = null; //2차
		FileInputStream fis = null; //1차
		// 파일 입출력을 할때에는 항상 예외처리가 필요하다 
		try {
			// DataOutputStream과 연결된 FileOutputStream
			fis = new FileInputStream("c:/ppp/data.sav");
			// 기본 자료형의 타입을 유지한채 저장된 값을 읽어들임
			// 읽을때 반드시 기록한 순서대로 읽어와야함
			dis = new DataInputStream(fis);
			
			int i=dis.readInt();
			double d=dis.readDouble();
			String s =dis.readUTF();
			
			// 쓴 기록 순서대로 읽어야 한다 
			System.out.println("i의 값 :"+i);
			System.out.println("d의 값 :"+d);
			System.out.println("s의 값 :"+s);
			
			
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();} catch (IOException e) {}
				try{if(dis!=null)dis.close();} catch (IOException e) {}
		}
	}

}
