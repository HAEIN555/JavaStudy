package com.except3;
import java.io.*;
public class Myexception extends Exception { //���� Ŭ������ ���� 

	private String message; // ���� ������ �����ϰڴٶ�� ���� ���� 
	private  Throwable cause;// ������ ������ Throwable��ü�� ���·� �����ϰڴ�. 
	// Throwable - �����ϰ� ���� ��θ� ���� (Exception �ϰ� ErrorŬ������ �θ� Ŭ���� )
	// �ʵ� 2�� ����
	
	public Myexception(String msg) {
		// TODO Auto-generated constructor stub
		// �θ��� �����ڸ� ȣ�� 
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
		// ������ �߻������� ����ϴ� 
		System.out.println("�����߻�...");
		System.out.println("�������� : "+message);
		System.out.println("���� Ŭ���� :"+cause); // �������� �������� 
		System.out.println("�������� ��!");
		
		super.printStackTrace(System.out);
	}
	public void printStackTrace(PrintStream out) {
		super.printStackTrace(out);
	}
	public void printStackTrace(PrintWriter out) {
		super.printStackTrace(out);
	} 
}
