package study;
// ���� �Ѿ�鼭 �Է��Ϸ���
// �ؽ�Ʈ���Ͽ� ���� ����ϴ°� �������� ����ϰ� ������ bridge���!
import java.io.*;
public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Buffered ��Ʈ�� : ��Ʈ���� �а� ���� ����� ���� ��Ʈ�� ������ ���۸� ������ �ִ� ��Ʈ��
		FileWriter fw =null;
		BufferedWriter bw = null;
		// ��Ʈ���� �а� ���� ���� ������ ���۸� ������ �ִ� ��Ʈ�� ���۴� �ӽ÷� �����͸� ����ϸ� �ٲٴ�
		
		try {
			fw = new FileWriter("c:/ppp/Hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("���õ� ������ �帮�׿�!!");
			bw.newLine(); // ���ο� �������� �ٲپ��ش�.
			bw.write("���õ� ������ �帮�׿�!!");
			bw.newLine(); // ���ο� �������� �ٲپ��ش�.
			bw.write("���õ� ������ �帮�׿�!!");
			bw.flush(); // flush�� �����ش�. ���Ͽ� �����ϴ� ���� ���ۿ��� �����ش� ���Ϸ� �Ѱ��ش�?
			// �����Ű�� ���� ����Ǿ��ִ� buffer���� �Ѱ��ش�. 
		} catch (IOException ii) {
			// TODO: handle exception
			ii.printStackTrace();
		}finally {
			try {if(fw!=null)fw.close();} catch (IOException e) {}
			try {if(bw!=null)bw.close();} catch (IOException e) {}
		}
		
	}

}
