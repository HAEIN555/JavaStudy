package study;
import java.util.*;
public class SungImpl implements Sung {
// ����ü 
	int in;
	Record re[];
	Scanner sc = new Scanner(System.in); //�������� ������
	
	@Override
	public void set() { // �ο��� �Է¹޴� ���
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("�ο��� �Է�");
			in = sc.nextInt();
		} while (in<1||in>100);
		
		re= new Record[in];
	}

	@Override
	public void input() { // �̸��ϰ� �й� ���� ���� �Է±�� ,����
		String [] title = {"��������","��������","��������"};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<re.length;i++) {
			
			re[i] =new Record();  // ��ü ����  �����ڸ� ������ �´�.
		System.out.printf("%d��° �л��� �й��� �̸��� �Է��ϼ���(���鱸��)",(i+1));
			re[i].number=sc.nextInt();
			re[i].name =sc.next();
		System.out.print("���� ���� ���������� �Է��ϼ���");
			re[i].scr[0]=sc.nextInt();// �������� 
			re[i].scr[1]=sc.nextInt();// ��������
			re[i].scr[2]=sc.nextInt();// �������� 
			// �� ���� ���� : �� , �� , �� , �� , ��
			for(int j =0;j<re[i].scr.length;j++) {
				
				if(re[i].scr[j]>=90)
							re[i].score[j]="��";
				else if(re[i].scr[j]>=80)
							re[i].score[j]="��";
				else if(re[i].scr[j]>=70)
							re[i].score[j]="��";
				else if(re[i].scr[j]>=60)
							re[i].score[j]="��";
				else 
							re[i].score[j]="��";
			} // end for 
			// ����
			re[i].sum += re[i].scr[0]+ re[i].scr[1]+ re[i].scr[2];
			// ���
			re[i].avg =re[i].sum/ 3;
		}
	}

	@Override
	public void print() { // ��� ��� 
		
		for(int i=0;i<re.length;i++) {
			System.out.printf("%5d%5s%3d%3d%3d%3d%3d\n",
					re[i].number,re[i].name,re[i].scr[0],re[i].scr[1],re[i].scr[2],
							re[i].sum,re[i].avg);
			System.out.printf("\t\t%s%s%s\n",re[i].score[0],re[i].score[1],re[i].score[2]);
		}
	}

	

}
