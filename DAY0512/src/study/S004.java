package study;
import  java. io.*;
public class S004 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//int kor =0, eng=0, mat=0, sum=0;
		int[] sub=new int [4]; //���� ���� �������ذŶ� ����.
		//0���� ���� 1���� ���� 2���� ���� 3���� ����
		float avg= 0.0f;
		do {
			System.out.println("�������� : ");
			sub[0]=Integer.parseInt(br.readLine());
		}while(sub[0]<0||sub[0]>100);
		
		do {
			System.out.println("�������� : ");
			sub[1]=Integer.parseInt(br.readLine());
		}while(sub[1]<0||sub[1]>100);
		
		do {
			System.out.println("�������� : ");
			sub[2]=Integer.parseInt(br.readLine());
		}while(sub[2]<0||sub[2]>100);
		
		sub[3]=sub[0]+sub[1]+sub[2];
		avg=sub[3]/3.f;//float���� ��ұ� ������!
		
		System.out.println();
		System.out.println("���� :"+sub[3]);
		System.out.println("��� :"+avg);
	}

}
