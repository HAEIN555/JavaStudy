package study;
/* DataInputStream과 DataOutputStream
 * 
 * DataOutputStream
 * 특정 데이터 타입과 포맷을 유지한채 데이터를 기록하고 읽어올 수 있는 스트림
 * 특정 데이터 타입과 포멧에 맞게 읽고 쓸 수 있는 메소드를 제공
 * 		writeBoolean,readBoolean,readInt,writeInt,readUTF,writeUTF
 * 
 * 
 */
import java.io.*;
public class DataOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DataOutputStream은 기본 자료형 타입 그대로 스트림을 통해서 기록할 수 있음
		// DataOutputStream은 1차 스트림이 아니기때문에 다른 스트림을 이용해서 
		// 특정 장치와 연결될 수 있다. 
		DataOutputStream dos = null; //2차
		FileOutputStream fos = null; //1차
		// 파일 입출력을 할때에는 항상 예외처리가 필요하다 
		try {
			// DataOutputStream과 연결된 FileOutputStream
			fos = new FileOutputStream("c:/ppp/data.sav");
			// 기본 자료형의 타입을 유지한채 기록할 수 있는 DataOutputStream객체 생성
			dos = new DataOutputStream(fos);
			
			int i=10;
			double d=3.14;
			String s ="나는 자바를 1도 모르게따";
			//DataOutputStream 은 기본 자료형 별로 저장하는 write메소드가 존재함 
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			// 쓴 기록 순서대로 읽어야 한다 
			
			
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
