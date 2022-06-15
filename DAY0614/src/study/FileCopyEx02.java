package study;
import java.io.*;
public class FileCopyEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("파일 복사 시작!");
		long start = System.currentTimeMillis();
		FileInputStream src = null; // 원본을 읽어들어서 쓴다
		FileOutputStream dest = null;
		try {
			// 원본 파일을 읽기 위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("c:/ppp/idontknow.txt"));
			//복사 파일을 생성 위한 FileOutputStream 객체 생성
			dest = new FileOutputStream(new File("c:/ppp/des.txt"));
			
			// 임시저장소에 저장된data의 전체개수를 저장할 변수를 선언
			int length=0;
			//임시저장소로 사용할 byte[]배열선언
			byte[] buffer = new byte[1024*8];
			//InputStream을 통해서 읽어드린 데이터를 임시저장소에 저장하고 저장된
			//데이터의 길이만큼 length에 저장함
			while((length = src.read(buffer))!=-1) {
				// OutputStream을 통해서 임시저장소에 저장되어있는 데이터를 length만큼 파일에 저장
				dest.write(buffer, 0, length);
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
