package study;
import java.io.*;
public class S004 {
	public static void main(String[] args)throws IOException{
		// �̹��� ��¥ �����迭�� �̿��غ���
				BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
				System.out.println("�л����� �Է��ϼ���");
				int human =Integer.parseInt(br.readLine()); // ��� �� ���ϱ�
				String [] name = new String[human];// ������� ��ŭ�� �迭�� ������ְڴٰ�
				
				String [][] subject = new String[human][];
				// ������ ��������� �𸣰� �����迭�� �����...! ???????
			
				int [][] jumsu = new int [human][subject.length];
				//����� ������ �־��ִ� �迭�� ����ڴ�.
				float [] avg = new float[human]; // ����� ������ִ� �迭�� �����.
				char[] grade = new char[human];// ������ ������ִ� �迭�� �����.
				int [] rank=new int [human];// ������ ������ִ� �迭�� �����.
				
				for (int i=0;i<human;i++) {// ��� �� ��ŭ �ݺ��Ѵ�.
					System.out.print((i+1)+"��°�� �л��̸� :");
					name[i]=br.readLine();
					
					System.out.print("���� �� �Է�:");
					int imsi= Integer.parseInt(br.readLine());// ����� �Է�
					 subject[i]=new String[imsi];// ������� ���� �迭�� ���� 
					 for(int j=0;j<subject[i].length;j++) {
						 System.out.print((j+1)+"��° ���� ����");
						 subject[i][j]=br.readLine();
					 }
					 jumsu[i]=new int[imsi+1];
					 
					System.out.println(name[i]+"�л� ���� �Է�");
					
					for(int j=0;j<subject[i].length;j++) {
						System.out.print(subject[i][j]+"����");
						jumsu[i][j]= Integer.parseInt(br.readLine());
						
					}
					
				}
	}

}