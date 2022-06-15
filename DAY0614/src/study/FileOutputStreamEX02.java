package study;
import java.io.*;
public class FileOutputStreamEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:/ppp/fileout.txt");
			String message = "Work hard and Be kind";
			fos.write(message.getBytes());
			fos.close();
		}catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null)
				fos.close(); // 반드시 해주어야함!
				}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
