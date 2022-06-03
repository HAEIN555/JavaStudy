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
			startInstall(); // 프로그램 설치할 준비 
			copyFiles(); // 파일 복사 
		}catch (SpaceException se) {
			// TODO: handle exception
			InstallException ie = new InstallException("설치중 예외발생...");
			ie.initCause(se); //지정한 예외를 원인으로 등록하는 기능 
			throw ie; //원인 예외를 반환함 
		}catch (MemoryException me) {
			// TODO: handle exception
			InstallException ie = new InstallException("설치중 예외발생...");
			ie.initCause(me); //지정한 예외를 원인으로 등록하는 기능( 메모리 부족중에 설치중에 에러가 났다)
			throw ie; //원인 예외를 반환함 
		}finally {
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 제거! 
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
