package com.EX03;
/*�޼ҵ�
 * 1. �޼ҵ� (��� �Լ�) : ��ü�� �� �� �ִ� ���۵��� ������ ���̴�.
 * 								 �޼ҵ��� ������ 2������ ���� ���´�.
 * 									1. �ν��Ͻ� �޼ҵ�- ��ü�� ���������� ���� ����
 * 									2. Static �޼ҵ�
 * 										(�տ�static�� �Ⱥ����� �ν��Ͻ� �޼ҵ��̴�.)
 * 
 * �츮�� �����ϴ� �޼ҵ�- ����� ���� �޼ҵ�
 * api�� �ִ� �޼ҵ� 
 */
public class MethodEX01 {
		
	 public int add(int i,int j){
		return i+j;
	 	}
	
	 public int sub(int i,int j){
			return i-j;
		}
	 
	 public int multi(int i,int j){
			return i*j;
		}
	 
	 public int div(int i,int j){
			return i/j;
		}
	 public static void main(String[] args) {// ����Ŭ����
		int i =10;
		int j= 10;
		
		MethodEX01 me= new MethodEX01();
		
		int a,b,c,d;
		a=me.add(i, j); // �����ϴ� ����� ���� �޼ҵ带 ȣ��
		b=me.sub(i, j);// 
		c=me.multi(i, j);
		d=me.div(i, j);
		
		System.out.println("���ϱ��� ���"+a);
		System.out.println("������ ���"+b);
		System.out.println("���ϱ��� ���"+c);
		System.out.println("�������� ���"+d);
		
	}
}
