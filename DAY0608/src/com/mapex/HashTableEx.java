package com.mapex;
import java.util.*;
public class HashTableEx {
	//�̸��� ���� ��ȭ��ȣ�� Ȱ���غ��� �ߺ��� ��..!
	private  static final String name[] = {"�ö���","��ũ���׽�","����","����","�Ƹ������ڷ���","�����"};
	private  static final String tel[] 
			= {"111-1111","222-2222","333-3333","555-5555","666-6666","555-5555"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> ht = new Hashtable<>();
		// �ؽ� ���̺� Ű�� �����͸� �Է� �մϴ�. 
		for(int i=0;i<name.length;i++) {
			ht.put(name[i],tel[i]);
		}
		//System.out.println(ht);
		// �ؽ� ���̺��� ���� Ű�� �̿��ؼ� �˻�
		String str = ht.get("�����");
		if(str != null) {
			System.out.println("������� ��ȭ��ȣ"+str);
		}
		//Ű�� �����ϴ����� �˻�! 
		if(ht.containsKey("�ɽ���"))
			System.out.println("�ɽ��� �ڷᰡ ���� �մϴ�.");
		else System.out.println("�ڷᰡ ���� ���� �ʽ��ϴ�.");
		// Ű�� ���� ���� ���� 
		
		// �����Ͱ� �����ϴ��� ���� * ���� �����ϴ��� ����
		if(ht.containsValue("555-5555"))
			System.out.println("�ڷᰪ�� �����մϴ�.");
		else System.out.println("�ڷᰪ�� ���� ���� �ʽ��ϴ�.");
		
		
		ht.remove("�����"); // ����� Ű�� �����.
		if(ht.containsKey("�ɽ���"))
			System.out.println("����� �ڷᰡ ���� �մϴ�.");
		else System.out.println("�ڷᰡ ���� ���� �ʽ��ϴ�.");
		// Ű�� ���� ���� ���� 
	}

}
