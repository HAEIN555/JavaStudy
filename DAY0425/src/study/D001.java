package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class D001 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// ���� �����ڴ� ���߸�忡�� ���� ���ȴ�.  �׷��ϱ� �� �˾Ƶα�!
		// \b -back space��� ����ε� ��Ŭ�������� ���װ� ���ܼ� �׸�� ���´�! 
		/* ���� Ǯ�� 
		 *  (���ĺ��̾�???)_______:_________;
		 *                       >���� �� ���� ����
		 *  char ch; // ���ڸ� ������ ���� 
		 *  String s=" ";
		 *  System.out.println("���ĺ����ڸ� �Է��ϼ���");
		 *  ch =(char)System.in.read();
		 *  s =((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?
		 *  (((ch=='a')||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A')||ch=='E'||ch=='I'||ch=='O'||ch=='U'))?
		 *  "����":"����")
		 *  :"���ĺ��� �ƴմϴ�.;"                     
		 *  System.out.println(s);                       
		 */
		// �迭�� ���� index�� ������ 0����..?
		// �迭 [ ] ���� ����..? �迭���� �ݺ����� �ʼ�!   [��][��]
		//
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));	
		System.out.println("���ĺ����ڸ� �Է��ϼ���");	
		char a=(char)System.in.read();
		//���׿����� ���ǽ� ?��1:��2;
		String result;
		result =(a>='a'&& a<='z') || (a>='A'&&a<='Z') ? 
				((a=='a'||a=='e'||a=='i'||a=='o'||a=='u')||(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')?"����":"����") : "���ĺ��ƴ�";
		System.out.println(result);
	}
}
