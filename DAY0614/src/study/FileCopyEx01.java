package study;

import java.io.*;

public class FileCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("파일 복사 시작!");
		long start = System.currentTimeMillis();
		FileInputStream src = null; // 원본을 읽어들어서 쓴다
		FileOutputStream dest = null;
		try {
			// 원본 파일을 읽기 위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("c:/windows/win.ini"));
			//복사 파일을 생성 위한 FileOutputStream 객체 생성
			dest = new FileOutputStream(new File("c:/ppp/dest.txt"));
			
			// File InputStream 을 통해서 읽어들인 값을 저장할 변수 선언
			int readValue =0;
			// FileInputStream의 read() 메소드를 토애서 읽어들인 값을 readvalue에 저장
			while((readValue = src.read())!=-1) {
				// readValue에 저장 된 값을FileOutputStream의 write메소드를 통해서 파일에 저장
				dest.write(readValue);
			}
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {try {
			if(dest != null)
			dest.close(); // 반드시 해주어야함!
			}catch(IOException ie) {
			ie.printStackTrace();
		}}
		// 시간을 구하는 것 
		long end  = System.currentTimeMillis();
		long copyTime = (end-start)/1000;
		System.out.println("복사에 걸린 시간 :"+copyTime+"초" );
	}

}
