package review;
import java.io.*;
public class D002 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*������ 5������ ������ �Ѱ�� ����� ���ؼ� ������ ���ϴ� ���α׷��� ���弼��
		 */
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("������ �Է��ϼ���");	
	int kor = Integer.parseInt(br.readLine());	
	System.out.println("������ �Է��ϼ���");	
	int mat = Integer.parseInt(br.readLine());		
	System.out.println("������ �Է��ϼ���");	
	int eng = Integer.parseInt(br.readLine());		
	System.out.println("������ �Է��ϼ���");	
	int his = Integer.parseInt(br.readLine());	
	System.out.println("������ �Է��ϼ���");	
	int sci = Integer.parseInt(br.readLine());	
	
	int total = kor+mat+eng+his+sci;
	System.out.println("������"+total+"�Դϴ�");
	int avg = total/5;
	System.out.println("�����"+avg+"�Դϴ�");
	char i = 0;
	switch ((int)avg/10) {
	case 9:
		i='A';
		break;
	case 8:
		i='B';
		break;
	case 7:
		i='C';
		break;
	case 6:
		i='D';
		break;
		
	default:System.out.println("���� �߸��Ǿ��ų� ������ F�Դϴ�");
		break;
	
	}
	System.out.println("������"+i+"�Դϴ�");
	}
}
