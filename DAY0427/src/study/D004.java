package study;
import java.io.*;
public class D004 {
	/* �ΰ��� ������ ��� n ���� �Է¹޾� �μ� ������ n���� ����� ���� ���ϴ� ���α׷��� �ۼ��ϼ���
	 	���� �ΰ��� ����� �Է¹���
	 */
	public static void main(String[] args)throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	int a,b,c,i=0;
	int sum=0;
	System.out.println("ù��° ���� �Է��ϼ���");
	a=Integer.parseInt(br.readLine());
	System.out.println("�ι�° ���� �Է��ϼ���");
	b=Integer.parseInt(br.readLine());
	System.out.println("����� ���ϴ¼��� �Է��ϼ���");
	c=Integer.parseInt(br.readLine());
	if(a>b) {
		a=a^b;
		b=b^a;
		a=a^b;
	}
	for (i=a;i<=b;i++) {
		if(i%c==0) 
		{sum+=i;}
	}
	System.out.println(c+"����� ����"+sum);
	}
// ����Ұ� ����� ��Ÿ���°� *�Ӹ��ƴ϶� �������� �������� �ִ�!
}
