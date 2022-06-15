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
			// �Ѷ��ξ� �о���� ���ڿ��� ������ ���� 
			String str = null;
			// readLine() ���๮�ڸ� ������ ���๮�� ���������� ���ڿ��� ��ȯ
			// ��Ʈ���� ���� �����ϸ� null�� ��ȯ�Ѵ�. 
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
