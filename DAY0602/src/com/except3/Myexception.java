package com.except3;
import java.io.*;
public class Myexception extends Exception { //예외 클래스를 정의 

	private String message; // 예외 내용을 저장하겠다라는 변수 선언 
	private  Throwable cause;// 예외의 원인을 Throwable객체의 형태로 저장하겠다. 
	// Throwable - 예외하고 에러 모두를 관리 (Exception 하고 Error클래스의 부모 클래스 )
	// 필드 2개 설정
	
	public Myexception(String msg) {
		// TODO Auto-generated constructor stub
		// 부모의 생성자를 호출 
		super(msg);
		message = msg;
	}
	public Myexception(Throwable cause) {
		super(cause);
		this.cause = cause;
		
	}
	public Myexception(String msg,Throwable cause) {
		super(msg,cause);
		message = msg;
		this.cause = cause;	
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Throwable getCause() {
		return cause;
	}
	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	public void printStackTrace() {
		// 에러가 발생했을때 출력하는 
		System.out.println("에러발생...");
		System.out.println("에러원인 : "+message);
		System.out.println("관련 클래스 :"+cause); // 예외인지 에러인지 
		System.out.println("에러정보 끝!");
		
		super.printStackTrace(System.out);
	}
	public void printStackTrace(PrintStream out) {
		super.printStackTrace(out);
	}
	public void printStackTrace(PrintWriter out) {
		super.printStackTrace(out);
	} 
}
