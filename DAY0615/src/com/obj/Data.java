package com.obj;

/* Ŭ���� ����� ���� �������̽� �� add�� �߰� ���־���. serializable
 * 		��ü�� ����ȭ
 * 		Ư�� ��ü�� ����Ʈ ���·� ��ȯ�ϴ� ���� �ǹ�
 * 		��ü�� ����ȭ�� ���� ���α׷��� ����Ǵ� ���� ������ ��ü�� ��Ʈ���� ���ؼ�
 * 		���������� �����ϰų� ������ �� ����
 * 
 * 		����ȭ ������ Ŭ���� ����� ���
 * 	1.	Serializable �������̽� �̿�
 * 	
 * 		ex) public class Myobejct implments Serializable{}
 * 2. 	Externalizable �������̽��� �̿�
 * 		
 * 		ex) public class Myobject impliments Externalizable{
 * 		�������̽��� �޼ҵ尡 ���µ� �̰͸� �޼ҵ尡 �ִ�. 
 *		 @Override
   			public void writeExternal(ObjectOutput out) throws IOException {
      		// TODO Auto-generated method stub
   			}

   		@Override
   			public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      		// TODO Auto-generated method stub
      
   			}
 * 		
 * 	
 * 		
 * 
 */
import java.io.*;

public class Data implements Serializable{
	
	private int no;
	private String name;
	private String Mail;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	
	
	
	
	
	
	} 
	

