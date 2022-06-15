package study;
import java.io.*;
public class PrintWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("c:/ppp/printwriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos,true);
			// true  --> autoflush 기능 !!!! 
			
			pw.println("오늘도 즐거운!!");
			pw.println("점심시간이 찾아왔습니다.");
			pw.println(100.0);
			pw.println(true);
			
			
		}catch (IOException ii) {
			// TODO: handle exception
			ii.printStackTrace();
		}finally {
			try {
			if(pw!=null)pw.close(); 
			if(fos!=null)fos.close(); 
			if(bos!=null)bos.close();} catch (IOException e) {}
		}
		
	}

}
