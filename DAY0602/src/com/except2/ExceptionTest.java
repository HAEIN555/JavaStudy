package com.except2;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			Install();
		} catch (InstallException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void Install()throws InstallException{
		try {
			startInstall(); // ���α׷� ��ġ�� �غ� 
			copyFiles(); // ���� ���� 
		}catch (SpaceException se) {
			// TODO: handle exception
			InstallException ie = new InstallException("��ġ�� ���ܹ߻�...");
			ie.initCause(se); //������ ���ܸ� �������� ����ϴ� ��� 
			throw ie; //���� ���ܸ� ��ȯ�� 
		}catch (MemoryException me) {
			// TODO: handle exception
			InstallException ie = new InstallException("��ġ�� ���ܹ߻�...");
			ie.initCause(me); //������ ���ܸ� �������� ����ϴ� ���( �޸� �����߿� ��ġ�߿� ������ ����)
			throw ie; //���� ���ܸ� ��ȯ�� 
		}finally {
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����ϵ��� ����! 
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
