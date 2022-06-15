package study;
// 파일에 문자 기록
import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			// 파일에 한 문자 단위로 기록할 수 있는 FileWrite 객체를 생성합니다.
			fw = new FileWriter("c:/ppp/song.txt");
			// fw는 문자열을 바로 기록 할 수 있다. 
			String str ="집에 가고싶다!";
			fw.write(str);
			// 한글자 단위로 읽고 쓸 수 있는 Reader,Writer, 계열의 스트림은
			// 내부적으로 buffer를 내정하고 있다.
			// 내정된 버퍼는 버퍼가 가득 채워질때에만 스트림을 통해 내보낸다
			// 그래서 가득 채워지지 않은 상태에서 버퍼를 비워야할 경우 
			// flush() 메소드를 활용하여 버퍼가 채워지지 않은 상태에서도 비우게 한다.
			fw.flush();
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}finally {
			try {
				if(fw!=null)fw.close();} catch (IOException e) {}
				
		}
	}

}
