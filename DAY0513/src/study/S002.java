package study;
import java.io.*;
public class S002 {

	public static void main(String[] ar)throws IOException{
		/* ���� )
		 * �迭�� �̿��ؼ� �Ѹ��� �л��� ���� ����ó�� ���α׷��� �ۼ��Ѵ�.
		 * ����� ,�����
		 * �̸��� �Է� �޴´�.
		 * �̸� , ����� , ���� , ���� 
		 *   
		 */
		// run�� configuration�� ����! �迭�� ���� ���� ���� 
		/*
		 * for(int i=0;i<ar.length;i++) { System.out.println(ar[i]);}
		 */
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		/*
		 * if(ar.length==0) { System.out.println("������� �����ϴ�."); System.exit(0);}
		 * 
		 */
		// ar.length :  ����� 
		//for(int i=0;i<ar.length;i++) { System.out.println(ar[i]);}
		 // �̸� �Է¹���
		System.out.println("�̸��Է�");
		String name = br.readLine();
		//String subject []= new String[ar.length];
		String subject []={"����","����","����"};
		// ���� Run�� configuration�� ���� �������� �ʾҴٸ� ���� �迭�� ������ָ� �ȴ�!
		// �׶��� for�� �ȿ� subject[i]=ar[i]; ���� ��� �ȴ�!
		/*
		 * for (int i =0;i<ar.length;i++) { subject[i]=ar[i];
		 * System.out.print(subject[i]+" "); }
		 * �ȿ� �ִ� ������ �������� �˱� ���ؼ� ǥ�����ذ�
		 */
		int jumsu[] =new int [subject.length+1];// ������ �����ϱ� ���� ����
		for(int i=0;i<subject.length;i++) {
			System.out.println(subject[i]+"����");
			jumsu[i]=Integer.parseInt(br.readLine());//������ �Է¹��� �� 
			//������
			jumsu[subject.length-1]+=jumsu[i];
			//System.out.println("���� :"+jumsu[subject.length-1]); �����հ�
		}
		float avg=jumsu[subject.length-1]/(float)(subject.length);
		// �Ҽ��� 3�ڸ����� �ݿø� �ݿ�
		avg = (int)((avg+0.005)*100)/100.f;
		// 0.005�� �� ������ ����° �ڸ����� �ݿø� ���ֱ� ���ؼ� 0.005����° �ڸ��� 5�� �־���
		// int�� �ʿ��� ���� ã�ƶ�!
		char grade =0;
		switch ((int)(avg/10)) {
		case 10: 
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7:grade='C'; break;
		case 6:grade='D'; break;
		default : grade ='F';break;
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("-----------------------"+name+"�� �� �� ǥ ---------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("���� :"+jumsu[subject.length-1]);
		
	}

}
