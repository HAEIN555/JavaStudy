package study;

import java.util.*;
public class S001 {

	public static void main(String[] args) {
		//���� - interrupt ����ġ ���� �� ,����ġ ���� ��  --> �̸� ���� �غ��ϰ� �ִ� ���� �ٷ� '����ó��'
		// ���� -  exception ������ ���� ���α׷������� ó�� ���� 
		// ���� -  ġ������ ���� jvm�� �����ؼ� ó�� java���� �޸� ó�� -jvm 
		// try catch �� , ����try catch �� 
		// ���� try catch �������� ������ ���� �´�. ���� ���� ��ü�� ���� ���� ���� ���� ��ü�� �ؿ� �´�.
		// throws����� - �������� , �߻��� ���� ��ü�� �絵 �ϴ� �� 
		// finally - ���ܰ� �߻��߰� ���߰� ������ �����ϴ°�! 
		// fianl - scanner�� ��ٸ� �ݾ��ִ°� database���� ���� ���ȴ�. 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally { // ���ܰ� �߻��� �ϴ� ���ϴ� ����  databaseó���� fileó���Ѵٸ� �� �ݾ��־���Ѵ�. 
			sc.close(); // ���α׷� ����Ǳ� ���� �ݾ��� 
		}
		
	}

}
