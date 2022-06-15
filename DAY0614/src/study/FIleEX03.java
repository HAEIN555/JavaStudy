package study;

// 파일, 디렉토리 생성 및 삭제 
import java.io.*;

public class FIleEX03 {

	public static void main(String[] args) {
		  // 파일 생성 
		File f1 =new File("c:/ppp/newFile.txt");
			try { if(f1.exists()) {
		  System.out.print("파일 이름 :"+f1.getName()); }
			else { 
				if(f1.createNewFile()) {
		  System.out.println("새로운 파일을 만들었습니다.");
					} 
				}
		  } catch (IOException e) {} 
		// 디렉토리 생성 // 존재 하지 않으면 만든다
		  File f2 = new File("c://newDirectory");
		  if(f2.exists())  { f2.mkdir();
		  }
		  else { System.out.println("디렉토리 이름"+f2.getPath()); }
		// 파일 혹은 디렉토리 삭제 
		  File f3 = new File("c://newDirectory"); if (f3.exists()) {
		  f3.delete(); } else { System.out.println("디렉토리가 존재하지 않습니다."); } 
		// 파일 혹은 디렉토리 이름 변경
		File src = new File("c:/ppp/newFile.txt");
		File dest = new File("c:/newDirectory/dest.txt");
		File dest2 = new File("c:/newDirectory/dest2.txt");
		
		if(src.exists()) {
			//src.renameTo(dest);
			src.renameTo(dest2);
			}else {
				System.out.println("파일이 존재하지 않습니다.");
				}
			}
		}


