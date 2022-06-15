package study;
import java.io.File;
public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File f = new File("c:\\ppp\\Hello.txt");
		File f = new File("c://ppp/Hello.txt");
		
		System.out.println("파일인지 여부 "+f.isFile()); // true
		System.out.println("디렉토리인지 여부"+f.isDirectory()); // false // 디렉토리 -> 폴더
		
		// 상세 경로인지 절때 경로인지
		// 차이점 
		
		// 상대 경로 : 현재위치를 기준으로! 그곳의 위치를 의미 
		// 절때 경로 : 모든 경로  c://ppp/Hello.txt
		// . : 현재위치 
		// .. : 현재위치의 바로 상위 디렉토리
		// / : 루트(\)

		System.out.println("상대경로"+f.getPath());
		System.out.println("절대 경로"+f.getAbsolutePath());
		System.out.println("파일의 이름"+f.getName());
		System.out.println("파일의 길이"+f.length());
		System.out.println("파일의 최종수정 날짜 "+f.lastModified());
		
		
	}

}
