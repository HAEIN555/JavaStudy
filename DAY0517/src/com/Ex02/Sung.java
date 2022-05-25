package com.Ex02;
/* Sung Ŭ������ 
 * - �ο����� �Է¹޾� , �Է¹��� �ο��� ��ŭ �̸�,����,����,���� ������ �Է¹ް� 
 * 	- ������ ���, ������ ���ϴ� ���α׷��� �ۼ��ϼ��� 
 *   �䷱�� �ٷ� Ŭ������ ���� 
 *   	�Ӽ� - �ο��� Record �迭�� 
 *   	��� - 
 *   			�ο��� �Է��ϴ� ���
 *   			�� ������ �Է��ϴ� ���
 *   			���� ó���ϴ�  ���
 *   			����� ����ϴ� ���
 *   			  
 */
import java.util.*;
public class Sung {

	//�ֿ亯�� ���� (�Ӽ��� �ǹ�)
	int inwon; // �ο����� �ǹ�
	Record[] rec; // Record[] �迭 ����
	
	// ��� �޼ҵ�
	//1. �ο��� �Է¹޴´�. 
	public void set() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�ο��� �Է�(1-100)");
			inwon=sc.nextInt();
		}while(inwon< 1|| inwon>100);
		// Record Ŭ������ �迭 ������ inwon��ŭ ������ ����
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�. 
		rec = new Record[inwon];
		
	}

	//2. �� ������ �Է� �� ���� ó���ϴ� ���
	public void input() {
		String [] title = {"��������:" ,"��������: ","��������:"};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<inwon;i++) {
			// �ν��Ͻ� ���� (********)
			 rec[i]=new Record();
			 
			 System.out.print((i+1)+"��° �̸��Է� :");
			 rec[i].name=sc.next();// ��ü�迭�� ��� ��ü�� ����ٰ� ����Ѵ�. 
			 // next()�� nextLine()�� ��������?
			 /* next() ��� ���� nextLine()���� ���� 
			  *  ȫ�浿  ���� next ��� ȫ�浿�� ������
			  *  ȫ�浿  ���� nextLine�̶�� ȫ�浿  ������ �д´�. 
			  *  ����� �����ϴ� �޼ҵ� ,��  �������� �����Ѵ�.
			  *  ������ ��������� ������ �������� �����ض� 
			  */
	
			for(int j=0;j<title.length;j++) {// ����
				// �ȳ� �޼��� ���
				System.out.print(title[j]);
				
				// �Է¹��� ������ score�� �����Ѵ�. 
				rec[i].score[j]=sc.nextInt(); // Ŭ���� �ȿ� �迭 ���� �װ��� ����� �´�. 
				// ������ �ݺ������� �Է¹޾� ������ �������� ������ ���Ѵ�.
				rec[i].tot +=rec[i].score[i];
				
			}
			
			// ��� ���� 
			rec[i].avg=rec[i].tot/3.0;
			rec[i].rank=1;
			
		}
	}

	
	  public void display() {
		  ranking();
		  System.out.println("====�л� ����ǥ ====");
		  for(int i=0;i<inwon;i++){ //�̸� ���
			  System.out.printf("%8s",rec[i].name);
			  // ���� ���� ���������� �ݺ� ����Ѵ�.
		 
			 for(int j=0;j<3;j++) {
				 System.out.printf("%5d",rec[i].score[j]);
				 //����, ��� ���
				 System.out.printf("%7d,%10.2f,%d",rec[i].tot,rec[i].avg,rec[i].rank);
				 System.out.println();
			 	}
			 	System.out.println("===================="); }	  
	  		}
	  	//������� �޼ҵ带 �߰�
	  //�Ѹ� �̻��̱⶧���� for���� 2�� �ʿ��ϴ�
	  
	  public void ranking() {
		  //��� �л��� ����� 1�� �ʱ�ȭ 
		  int i,j;
		  for(i=0;i<inwon;i++)
			  rec[i].rank=1;
		  // ��� ���
		  for(i=0;i<inwon-1;i++) {// 0,1
			  for(j=i+1;j<inwon;j++) {//1,2
				  if(rec[i].avg>rec[j].avg)
					  rec[j].rank++;
				  else if(rec[i].avg<rec[j].avg)
					  rec[i].rank++;
			  }
		  }
			/*
			 * for(int i=0;i<inwon;i++) { for(int j=0;j<inwon;j++) {
			 * if(rec[i].avg<rec[j].avg) rec[i].rank++;} }
			 */
	  }
		}
	
	
	
	
	
	




