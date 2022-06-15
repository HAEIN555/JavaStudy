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
			// true  --> autoflush ��� !!!! 
			
			pw.println("���õ� ��ſ�!!");
			pw.println("���ɽð��� ã�ƿԽ��ϴ�.");
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
