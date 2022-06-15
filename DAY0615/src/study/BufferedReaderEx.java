package study;

import java.io.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("c:/ppp/Hello.txt"); 
			isr = new InputStreamReader(fis); 
			br = new  BufferedReader(isr);
			// 한라인씩 읽어들인 문자열을 저장할 변수 
			String str = null;
			// readLine() 개행문자를 만나면 개행문자 이전까지의 문자열을 반환
			// 스트림을 끝에 도달하면 null을 반환한다. 
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException fnfe) {
			// TODO: handle exception
			fnfe.printStackTrace();
		}catch (IOException ii) {
			// TODO: handle exception
			ii.printStackTrace();
		}finally {
			try {if(fis!=null)fis.close();} catch (IOException e) {}
			try {if(isr!=null)isr.close();} catch (IOException e) {}
			try {if(br!=null)br.close();} catch (IOException e) {}
		}
		
	}

}
