package study;
// ���� ��� ���
import java.io.File;
public class FileEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File directory = new File("c:/");
		
		if(directory.exists()) { // ������ �����ϴ� �� ���ϴ��� �˻� 
			if(directory.isDirectory()) { // ���丮���� �ƴ��� 
				//���� ���丮 ���� ��� ������ ��� ����Ѵ�.
				String[] fileNameList = directory.list();
				// ���� ��� ��� 
				for(String fileName : fileNameList)
					System.out.println("�����̸�"+fileName);
				
			}
		}
	}

}
