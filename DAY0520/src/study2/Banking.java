package study2;
import java.io.*;
public class Banking {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		account na =new account("��īĨ");
		
		String strWork ;
		
		// �޴��� ����.
		do {
			System.out.println("\n���Ͻô� ������ �����ϼ���");
			System.out.println("----------------------------------------");
			System.out.println("��           ��-------------------------> 1");
			System.out.println("��           ��-------------------------> 2");
			System.out.println("��  ��   ��  ȸ------------------------> 3");
			System.out.println("��           ��-------------------------> 0");
			System.out.println("----------------------------------------");
			
			System.out.println("�۾� ������ �����ϼ���");
			strWork =br.readLine();
			
			int switchInt =0;
			if(strWork != null) { // �޴��� ���� �Ǿ��� ��� ,���� �ƴҶ�
				// ���ڿ��� ������ �ٲپ��ּ��� strWork�ȿ� �ִ� ���ڿ��� �������� �ٲ��ش�.
				switchInt  = Integer.parseInt(strWork);
			}else { // ���϶�
				System.out.println("���������� �Է����� �����̽��ϴ�.");
				System.exit(0);
			}
			
			switch (switchInt) {
			case 0:System.out.println("���α׷��� �����մϴ�.");break;//����
			case 1:// �Ա�
				System.out.println("\n-----------------------------------");
				System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ��� :");
				String strdepsitIn = br.readLine();
				long  depsitLong =Long.parseLong(strdepsitIn);
				na.deposit(depsitLong);//  �ܰ����ٰ� �־���?
				break;
			case 2:// ���
				System.out.println("\n-----------------------------------");
				System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� :");
				String strwithdraIn = br.readLine();
				long  withdrawLong =Long.parseLong(strwithdraIn);
				na.withdraw(withdrawLong);//  �ܰ����ٰ� �־���?
				break;
			case 3:// �ܰ�Ȯ��
				System.out.println(na.getName()+"���� �ܰ���"+na.getBalance()+"���Դϴ�");
				break;
			default:System.out.println("0-3�����̹�ȣ�� ��������\n");break;
			// ����Ʈ�� �극��ũ���� ��������
			}
	
		} while (!strWork.equals("0"));
		
	}

}