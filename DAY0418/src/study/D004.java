package study;
	 // import java.io.BufferedReader;
	 // import java.io.InputStreamReader;
	  import java.io.*;// io ���� �� �� �ִ°� ��� �����´�.
public class D004 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// ��ĳ�ʰ� �ƴ� ���ڸ� �Է¹޴� ���
		// ���ڿ� �� �Է��ϴ� ���
	
		String name ,nai , addr, tel;
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader bb = new BufferedReader(is)
		
		//���� �Ͱ� �Ʒ� ���� �Ȱ���.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�̸� : ");
		name = br.readLine();
		
		System.out.print("���� : ");
		nai = br.readLine();
		
		System.out.print("�ּ� : ");
		addr = br.readLine();
		
		System.out.print("���� : ");
		tel = br.readLine();
		
		
	}

}
