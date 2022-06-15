package study;
// 행을 넘어가면서 입력하려고
// 텍스트파일에 문자 기록하는게 여러줄을 기록하고 싶을때 bridge사용!
import java.io.*;
public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Buffered 스트림 : 스트림을 읽고 쓰는 기능을 위해 스트림 내부의 버퍼를 가지고 있는 스트림
		FileWriter fw =null;
		BufferedWriter bw = null;
		// 스트림을 읽고 쓰는 역할 내부의 버퍼를 가지고 있는 스트림 버퍼는 임시로 데이터를 기록하면 바꾸는
		
		try {
			fw = new FileWriter("c:/ppp/Hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("오늘도 날씨는 흐리네요!!");
			bw.newLine(); // 새로운 라인으로 바꾸어준다.
			bw.write("오늘도 날씨는 흐리네요!!");
			bw.newLine(); // 새로운 라인으로 바꾸어준다.
			bw.write("오늘도 날씨는 흐리네요!!");
			bw.flush(); // flush로 지원준다. 파일에 저장하는 순간 버퍼에서 지워준다 파일로 넘겨준다?
			// 실행시키는 순간 저장되어있는 buffer에서 넘겨준다. 
		} catch (IOException ii) {
			// TODO: handle exception
			ii.printStackTrace();
		}finally {
			try {if(fw!=null)fw.close();} catch (IOException e) {}
			try {if(bw!=null)bw.close();} catch (IOException e) {}
		}
		
	}

}
