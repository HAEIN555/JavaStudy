package study;
import java.io.*;
public class S002 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		/*while���� 
		 *  ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ���ư�
		 *  ���� 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ ���� ����� ����ϰ� ������
		 *  -������ ���� ����
		 */
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("������ �Է��ϼ���");
		int a=1,sum=0;
		/*while(true) {
			a=Integer.parseInt(br.readLine());
			if(a==0) {break;}
			sum=sum+a;
		}System.out.print(sum);
		*/
		
		
		while(a!=0) {
			System.out.println("0�̸� ����˴ϴ�");
			a=Integer.parseInt(br.readLine());
			sum=a+sum;
		}System.out.println("���ݱ��� �հ�"+sum);
	}

}
