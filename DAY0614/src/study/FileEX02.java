package study;
// 파일 목록 출력
import java.io.File;
public class FileEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File directory = new File("c:/");
		
		if(directory.exists()) { // 파일이 존재하는 지 안하는지 검사 
			if(directory.isDirectory()) { // 디렉토리인지 아닌지 
				//현재 디렉토리 내의 모든 파일의 목록 출력한다.
				String[] fileNameList = directory.list();
				// 파일 목록 출력 
				for(String fileName : fileNameList)
					System.out.println("파일이름"+fileName);
				
			}
		}
	}

}
