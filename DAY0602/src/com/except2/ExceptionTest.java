package com.except2;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		startInstall(); // 프로그램 설치 준비
		copyFiles(); // 파일 복사 
		}catch (SpaceException e) {
			// TODO: handle exception
			System.out.println("공간이 부족하니까 충분히 확보 바랍니다");
			System.out.println("확보가 되셨으면 다시 설치 바랍니다. ");
		}catch (MemoryException ee) {
			// TODO: handle exception
			System.out.println("메모리가 부족하니까 충분히 확보 바랍니다");
		}finally {
			deleteTempFiles();
		}
	}
	
	// 설치 할때에 여러가지 예외가 일어날 수 있다. 
	static void startInstall() throws SpaceException,MemoryException{
		if(!enoughSpace()) { // 프로그램설치 시 공간이 부족한 경우 
			throw new SpaceException("설치할 공간이 매우 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 많이 부족합니다.");
		}
	}
	static boolean enoughSpace() {
		return false; // 공간이 충분하니? 
	}
	static boolean enoughMemory() {
		return true; // 메모리 공간이 충분히 있다. 
	}
	static  void copyFiles() { // 파일 복사
 		// 임시파일에 복사해놨다가 지우는 
	}
	static void deleteTempFiles() { // 임시파일 삭제 
		
	}
}
