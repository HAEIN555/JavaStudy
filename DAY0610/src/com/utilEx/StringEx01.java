package com.utilEx;
// ��ü - ��ü �ڷ���  �⺻ �ڷ����� �ƴϴ� �⺻ �ڷ���ó������ �� 
// Ŭ�����ϱ� �����ڸ� ������ �ִ�. 
/* String class 
 * - ���ڿ��� �ǹ��ϴ� Ŭ���� 
 * - ��ü �ڷ��������� , �⺻ �ڷ���ó�� ����Ѵ�.
 * 
 * ������ 
 * String() :  ����ִ� ���ڿ� ��ü�� �����ϰ� �ʱ�ȭ 
 * String (char[]value) : ����� char�迭 ���� ������ ���������� �����Ͽ� ���ο� ���ڿ��� ����
 * String(String original) : String���� original�� ���ڿ��� ���Ӱ� ������ ���ڿ� ��ü �ʱ�ȭ �Ѵ�.
 *  ������ api�� �ְų� å�� �����ϱ� �����ϱ�
 *  
 *   ��ü ������ 
 *   (�ڵ�) -> �Ͻ��� ��ü����
 *   String s1 = "Test"; -> r�⺻ �ڷ���ó�� ������ ��
 *   (����)-> ����� ��ü����  
 *   String s2 = new String("Test");
 */
// ��ü�� �������� �ʴ´�. �� ū���� ����� ������ �迭ó�� ������ָ� �ȴ�. 
// �ѹ� ��������� ������ ���� �ʴ´�. 
public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1 = "TEST";
			String s2 ="TEST";
			// ���� ����. 
			if(s1==s2) // �ּҰ��� 
				System.out.println("s1��s2�� ����.");
			else
				System.out.println("s1��s2�� �����ʴ�.");
			//s1��s2�� ����.
			System.out.println();
			
			String s3 = new String("Test");
			String s4 = new String ("Test");
			
			if(s3==s4)
				System.out.println("s3��s4�� ����.");
			else
				System.out.println("s3��s4�� �����ʴ�.");
			//s3��s4�� �����ʴ�.

			if(s1.equals(s2)) // �� �� 
				System.out.println("s1��s2�� ����.");
			else
				System.out.println("s1��s2�� �����ʴ�.");
			
			if(s3.equals(s4))
				System.out.println("s3��s4�� ����.");
			else
				System.out.println("s3��s4�� �����ʴ�.");
			// �Ͻ��� ��ü ������ ����� ��ü������ ������
			// 1. (==) �����ڴ� ��ü�� �ּҰ��� �����Ѵ�. 
			// 2. ��ü�� �� �񱳴� equals() �޼ҵ带 Ȱ���Ѵ�. 
			
		//StringBuffer(5+16) // hello String str = "hello" 16���� �⺻�ε� 5�� �����־ 21���� �ʱ������ ����? 
			
	}

}
