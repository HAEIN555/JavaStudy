package study;
import java.util.*;
import java.io.*;
public class SearchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>lists = new ArrayList<String>();
		lists.add("�츮����");
		lists.add("���");
		lists.add("�츮����");
		lists.add("���ѹα�");
		lists.add("��������");
		lists.add("�뱸");
		lists.add("������Ʈ");
		lists.add("�ڹ�");
		lists.add("�ڿ�");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		// �Է� ���� ���ڿ��� �����ϴ� ���ڿ� �˻�
		try {
		System.out.print("�˻��� �ܾ� :");
		str =br.readLine();
		
		ListIterator<String> it = lists.listIterator();
		
		while(it.hasNext()) {
			String temp = it.next();
			
			if(temp.startsWith(str)) {
				System.out.println(temp);
			} // startsWith ó������ �����ϴ� �ܾ� 
		}
		
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
