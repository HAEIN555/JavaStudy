package review;
import java.io.*;
public class D004 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
	/*�μ��� �Է¹ް� �� �ٸ����� �Է¹޾� �� �μ� ������ 
	 *�ٸ����� ����� �Է¹޾� �� ����� ���� ���ϼ���!  
	 */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	int a,b,i,m;
	int sum=0;
	System.out.println("�����ϳ��� �Է��ϼ���");
	a=Integer.parseInt(br.readLine());
	System.out.println("�����ϳ��� �� �Է��ϼ���");
	b=Integer.parseInt(br.readLine());
	System.out.println("����� ���� �Է��ϼ���");
	i=Integer.parseInt(br.readLine());
	
	if(a>b)
	{a=a^b;b=b^a;a=a^b;}
	for(m=a;a<=b;a++) {
		if(a%i==0) {}
		sum=sum+i;
	}
	
	System.out.println("����"+sum+"�Դϴ�");
	
	
	}
}
