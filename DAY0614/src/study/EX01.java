package study;
import java.io.File;
public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File f = new File("c:\\ppp\\Hello.txt");
		File f = new File("c://ppp/Hello.txt");
		
		System.out.println("�������� ���� "+f.isFile()); // true
		System.out.println("���丮���� ����"+f.isDirectory()); // false // ���丮 -> ����
		
		// �� ������� ���� �������
		// ������ 
		
		// ��� ��� : ������ġ�� ��������! �װ��� ��ġ�� �ǹ� 
		// ���� ��� : ��� ���  c://ppp/Hello.txt
		// . : ������ġ 
		// .. : ������ġ�� �ٷ� ���� ���丮
		// / : ��Ʈ(\)

		System.out.println("�����"+f.getPath());
		System.out.println("���� ���"+f.getAbsolutePath());
		System.out.println("������ �̸�"+f.getName());
		System.out.println("������ ����"+f.length());
		System.out.println("������ �������� ��¥ "+f.lastModified());
		
		
	}

}
