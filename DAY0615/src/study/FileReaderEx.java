package study;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			// 파일로부터 한문자 단위로 읽어올  수 있는 파일 FileReader객체를 생성
			fr = new FileReader("c:/ppp/song.txt");
			// 파일 유니코드 값으로 변경되어 저장 이것을 인트형으로 바꾸어 준다.
			// 스트림을 통해서 읽어들인 유니코드 값을 저장할 변수 선언
			int readValue =0;
			while((readValue=fr.read())!=-1) {
				System.out.print((char)readValue);
				// 유니코드 값을 char값으로 변환시킨다. // 숫자 여러개 -> 집에 가고 싶다! 
			}
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();} catch (IOException e) {}
				
		}
	}

}
