package com.except;
import java.util.*;
import java.util.InputMismatchException;
public class InputExcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ������ �Է¹޾Ƽ� �հ踦 ���ϴ°�
		int sum =0, n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		for(int i =0;i<3;i++) {
			System.out.print((i+1)+"��° �����Է�:" );
			 try {
			n=sc.nextInt();
			 }catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ̽��ϴ�.������ �Է��ϼ���."); 
				// next () �� ��ū�� ���� 
				// ���� �Է½�Ʈ���� �����ִ� ����� �����.==���� ���ڸ� �����.
				sc.nextLine();
				i--; //for���� �ε����� �������� �ʵ��� �̸� ���ҽ�Ų��.
				continue;
			}
			sum+=n;
		}
		System.out.println("���� 3���� �հ�"+sum);
	}
}
