package com.except2;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		startInstall(); // ���α׷� ��ġ �غ�
		copyFiles(); // ���� ���� 
		}catch (SpaceException e) {
			// TODO: handle exception
			System.out.println("������ �����ϴϱ� ����� Ȯ�� �ٶ��ϴ�");
			System.out.println("Ȯ���� �Ǽ����� �ٽ� ��ġ �ٶ��ϴ�. ");
		}catch (MemoryException ee) {
			// TODO: handle exception
			System.out.println("�޸𸮰� �����ϴϱ� ����� Ȯ�� �ٶ��ϴ�");
		}finally {
			deleteTempFiles();
		}
	}
	
	// ��ġ �Ҷ��� �������� ���ܰ� �Ͼ �� �ִ�. 
	static void startInstall() throws SpaceException,MemoryException{
		if(!enoughSpace()) { // ���α׷���ġ �� ������ ������ ��� 
			throw new SpaceException("��ġ�� ������ �ſ� �����մϴ�.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� ���� �����մϴ�.");
		}
	}
	static boolean enoughSpace() {
		return false; // ������ ����ϴ�? 
	}
	static boolean enoughMemory() {
		return true; // �޸� ������ ����� �ִ�. 
	}
	static  void copyFiles() { // ���� ����
 		// �ӽ����Ͽ� �����س��ٰ� ����� 
	}
	static void deleteTempFiles() { // �ӽ����� ���� 
		
	}
}
