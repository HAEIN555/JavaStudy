package study;
import java.util.*;
import java.io.*;
public class S001 {

	public static void main(String[] args)throws IOException{
		/*��]
				�ֹ� ��ȣ�� �Է¹޾� �ùٸ� �ֹε�������� �����ϴ� ���α׷� �ۼ�

				123456 - abcdefg

				12 - �⵵
				34 -  ��
				56 - ��

				a �� ���

				9, 0�� ��� 1800���
				1, 2�� ��� 1900���
				3, 4�� ��� 2000���

				9 1 3 �� ��� ����
				0, 2, 4�� ��� ����

				b �� ���
				�ֹ� ��ȣ�� ����� ����
				0 - ����
				1 - ���, ��õ
				2 - �λ�
				3 - ����
				4 - ��û��
				5 - ����
				6 - �뱸, ����
				7 - ���, �泲
				8 - �泲
				9 - ���ֵ�

				 c �� d �� ���
				 �õ� �� ��
				 
				 e �� f�� ���
				 �ش� ���� �� �� ���� ǥ����
				 
				 g�� ��� 
				  �ֹι�ȣ�� �ùٸ����� �Ǻ��ϴ� ������
				 
				g�� �Ǻ� ����

				int hap = 0
				hap += �ֹι�ȣ ù��° �ڸ�(1)*2
				hap += �ֹι�ȣ �ι�° �ڸ�(2)*3
				hap += �ֹι�ȣ ����° �ڸ�(3)*4
				hap += �ֹι�ȣ �׹�° �ڸ�(4)*5
				hap += �ֹι�ȣ �ټ���° �ڸ�(5)*6
				hap += �ֹι�ȣ ������° �ڸ�(6)*7
				7��° �ڸ��� '-'ǥ�� �̹Ƿ� ��� ���� ����
				hap += �ֹι�ȣ ������° �ڸ�(a)*8
				hap += �ֹι�ȣ ��ȩ��° �ڸ�(b)*9
				hap += �ֹι�ȣ ����° �ڸ�(c)*2
				hap += �ֹι�ȣ ���ѹ�° �ڸ�(d)*3
				hap += �ֹι�ȣ ���ι�° �ڸ�(e)*4
				hap += �ֹι�ȣ ������° �ڸ�(f)*5

				 float temp = (int)(hap/11.0f)*11.0f+11.0f-hap
				 float temp1 = temp -(int)(temp/10.0f) * 10.0fl

				�̷��� ���� temp1�� ������ �ڸ��� g�� ������  �� �ֹε�� ��ȣ�� ���� ���ڰ�
				�ùٸ� ���̵� �׷�ġ ������ �ùٸ��� ����
				*/
			BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
			// ��ü Ȱ��
			String name =""; //String �� �ʱ�ȭ 
			int [] jumin = new int[14]; //14ĭ�� �ֹ� �迭 ����
			boolean right =false; // �´��� �ƴ��� �Ǻ��Ѵ�. �ֹι�ȣ�� �´��� Ʋ���� �Ǵ�
			System.out.print("�̸� �Է� :");
			name = br.readLine();// ���ڿ��� �Է¹޴´�. �̸��� �Է¹޴´�. 
			do {
				right = false;
				System.out.print("�ֹ� ��ȣ �Է�(EX:111111-1111111)");
				for(int i=0;i<jumin.length;i++) {
					jumin[i]=System.in.read()-48; //�ƽ�Ű �ڵ� 0�� ���ش�. 	
				}
				//System.in.read();
				//System.in.read();
				System.in.skip(2); //������ ����ش�.
				
				if(jumin[2]*10+jumin[3]>12) {
					// ���� ù�ڸ��� �ι�° �ڸ��� 12���� ũ�ٸ� �ȵǴϱ� ������ ����
					// jumin[2]�ڸ��� 10�� �ڸ��� 10�� �����ְ� jumin[3]�ڸ��� 1�� �ڸ��� ������
					System.out.println("�¾ ���� 12������ Ŭ �� �����ϴ�.");
					continue;
				}else if(jumin[4]*10+jumin[5]>31) {
					// jumin[4],jumin[5]�� ���� ��Ÿ����.
					System.out.println("�¾ ���� 31�Ϻ��� Ŭ �� �����ϴ�.");
					continue;
				}else if(jumin[7] !=9&&jumin[7] !=0&&jumin[7] !=1
						&&jumin[7] !=2&&jumin[7] !=3&&jumin[7] !=4) {
					System.out.println("������ �����ϴ� ���ڴ�");
					System.out.println("9,0,1,2,3,4 �� �ϳ����� �մϴ�.");
					continue;
				}
				int hap = 0, cre =2; // cre�� ���鶧 Ȱ�� ?
				//10�� �Ѿ�� �ڸ����� �Ѿ��. 0-9������ ���ڸ��̰� 
				// �������� ���ڸ� �־ Ȱ���Ϸ��� 
				float temp =0.0f, temp1= 0.0f;
				
				for(int i=0;i<jumin.length-1;i++) {
				if(i==6) {
					continue;
				}	
				hap += jumin[i]*cre;
				cre++;
				
				if(cre==10) {
					cre=2;
				}
					
				}
				 temp = (int)(hap/11.0f)*11.0f+11.0f-hap;
				 temp1 = temp -(int)(temp/10.0f) * 10.0f;
				//temp 1�� ������ �ڸ�?
				 if(temp1 !=jumin[13]) {
					 System.out.println("�ֹι�ȣ ���� ��ġ�� �ùٸ��� �ʽ��ϴ�.");
					 continue;
				 }
				right=true;
			} while (!right);
			
			System.out.println();
			System.out.print("�̸�: "+name);
			System.out.print("�ֹι�ȣ : ");
			for(int i =0;i<jumin.length;i++) {
				if(i==6) {
					System.out.print("-");
					continue;
				}
				System.out.print(jumin[i]);
			}
			System.out.println();
			System.out.print("�������");
			int year =0,month=0,day=0;
			switch (jumin[7]) {
			case 9:
			case 0:
				year =1800;
				break;
			case 1:
			case 2:
				year =1900;
				break;
			case 3:
			case 4:
				year =2000;
				break;
			}
			year += jumin[0]*10+jumin[1];
			month = jumin[2]*10+jumin[3];
			day = jumin[4]*10+jumin[5];
			System.out.println(year+"��"+month+"��"+day+"��");
			System.out.print("���� : ");
			System.out.println(jumin[7]%2==0?"����":"����");
			System.out.println("�¾ �õ�:");
			String area ="";
			switch (jumin[8]) {// ���Ƿ� ��ġ�� ����
			case 0:
				area="����";
				break;
			case 1:
				area="���,��õ";
				break;
			case 2:
				area="�λ�";
				break;
			case 3:
				area="������";
				break;
			case 4:
				area="��û��";
				break;
			case 5:
				area="����";
				break;
			case 6:
				area="�뱸,����";
				break;
			case 7:
				area="���,�泲";
				break;
			case 8:
				area="�泲";
				break;
			case 9:
				area="���ֵ�";
				break;
			
			}
			System.out.println(area);
			System.out.print("���� :");
			Calendar ca= Calendar.getInstance();
			int age = ca.get(Calendar.YEAR)-year+1;
			System.out.println(age+"��");
	}

}
