package study;

import java.io.*;
public class S003 {
	public static void main(String[] ar)throws IOException{
		/* ���� )
		 * �迭�� �̿��ؼ� �Ѹ��� �л��� ���� ����ó�� ���α׷��� �ۼ��Ѵ�.
		 * ����� ,�����
		 * �̸��� �Է� �޴´�.
		 * �̸� , ����� , ���� , ���� 
		 *   *2�����迭�� ���ϱ�*
		 */
		// run�� configuration�� ����! �迭�� ���� ���� ���� 
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		//int human =Integer.parseInt(ar[0]); // ��� �� ���ϱ�
		System.out.println("�л����� �Է��ϼ���");
		int human =Integer.parseInt(br.readLine()); // ��� �� ���ϱ�
		String [] name = new String[human];// ������� ��ŭ�� �迭�� ������ְڴٰ�
		//String [] subject = new String[ar.length-1];// ������� �ʱ�ȭ �ϰڴٰ�
		String [] subject = {"����","����","����"};
		// ������ ���� ó�� �迭 ���� 
		//int [][] jumsu = new int [human][ar.length];
		int [][] jumsu = new int [human][subject.length];
		//����� ������ �־��ִ� �迭�� ����ڴ�.
		float [] avg = new float[human]; // ����� ������ִ� �迭�� �����.
		char[] grade = new char[human];// ������ ������ִ� �迭�� �����.
		int [] rank=new int [human];// ������ ������ִ� �迭�� �����.
		
		/*
		 * for (int i=0;i<ar.length-1;i++) { subject [i] =ar[i+1];
		 * 
		 * System.out.println(subject[i]); }//������� ���� ���ؼ� �� for��
		 */
		/*
		 * for (int i=0;i<subject.length;i++) { 
		 * 				
		 * System.out.println(subject[i]); }
		 */
		for (int i=0;i<human;i++) {// ��� �� ��ŭ �ݺ��Ѵ�.
			System.out.print((i+1)+"��°�� �л��̸� :");
			name[i]=br.readLine();
			System.out.println(name[i]+"�л� ���� �Է�");
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"����");
				jumsu[i][j]= Integer.parseInt(br.readLine());
				
			}
			
		}
		
	}
}
