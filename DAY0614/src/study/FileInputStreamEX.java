package study;
import java.io.*;
public class FileInputStreamEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		byte _read[] = new byte[100];
		// 파일을 읽기 위한 byte배열선언
		byte _console[] = new byte[100];
		// 키보드로 입력한 값을 읽어서 console배열에 저장
		// 파일 입출력할때 예외처리!
		try {
			System.out.print("파일 명 :");
			System.in.read(_console);
			
			String file = new String(_console).trim(); // trim은 양쪽의 공백을 제거할때 사용!
			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());
		} catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
				fis.close(); // 반드시 해주어야함!
				}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}

}
