package study;
import java.util.Scanner;
public class D001 {
		final static int oman =50000;
		final static int man =10000;
		final static int chun =1000;
		final static int ohbak =500;
		final static int bak =100;
		final static int ohship =50;
		final static int ship =10;
		final static int il =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��ϼ���");
		int res, money;
		 money= sc.nextInt();
		 res=money/oman;
		 money=money%oman;
		if(res>0) {System.out.println("��������"+res+"��");}
		res=money/man;
		money=money%man;
		if(res>0) {System.out.println("������"+res+"��");}
		res=money/chun;
		money=money%chun;
		if(res>0) {System.out.println("õ����"+res+"��");}
		res=money/ohbak;
		money=money%ohbak;
		if(res>0) {System.out.println("�������"+res+"��");}
		res=money/bak;
		money=money%bak;
		if(res>0) {System.out.println("�����"+res+"��");}
		res=money/ohship;
		money=money%ohship;
		if(res>0) {System.out.println("���ʿ���"+res+"��");}
		res=money/ship;
		money=money%ship;
		if(res>0) {System.out.println("�ʿ���"+res+"��");}
		res=money/il;
		money=money%il;
		if(res>0) {System.out.println("�Ͽ���"+res+"��");}
		
		
		
		
		
		
	}

}
