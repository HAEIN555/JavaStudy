package study;
// �������� �޼ҵ带 ������
/* �޼ҵ�� ����̱⶧���� �������� ����� ������
 * 1. �ִ밪  2. ������ �� 3. ���� 4. ����
 *  
 */
import java.io.*;
public class MethodEX03 {
	
	// �ִ밪 ���ϴ� �޼ҵ� �ۼ�
		public static int aaa() throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ù��° ���� �Է�");
			int a=Integer.parseInt(br.readLine());
			System.out.println("�ι�° ���� �Է�");
			int b=Integer.parseInt(br.readLine());
			if(a>b) {
				return a;// ��ȯ 
			}
			return b;
		} //end aaa 
		
		//�μ� ������ �հ踦 ���ϴ� �޼ҵ� 
		public static void bbb() throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ù��° ���� �Է�");
			int a=Integer.parseInt(br.readLine());
			System.out.println("�ι�° ���� �Է�");
			int b=Integer.parseInt(br.readLine());
			// ������ų �� �ִ� ���� ����
			int tot=0;
			if(a>b) {
				a=a^b;
				b=b^a;
				a=a^b;
			} 
			for(int t=a;t<=b;t++) {
				tot +=t;
			}
			System.out.println(a+"~~~~~"+b+"�հ��"+tot);
			return ; // return���ڿ��� ����ᵵ ���ϴ°� ���� ����
		}// end bbb 
	
		// ū ������� �����ϴ� ������ �����ϴ� �޼ҵ�
		// 3���� ����..?  call by value 
		// ���� �Ѿ�ϱ� �Ű������� �־����? �Ƹ���... 
		public static String ccc (int  x, int  y, int  z) {// firstsu =x, secondsu =y, thirdsu =z
			if(y>=x&&y>=z) { // Y�� ���� Ŭ�� 
				//swap ���Ļ��
				int temp =x;
				x=y;
				y=temp;
			}else if(z>=x&&z>=y) {//z�� ���� Ŭ�� 
				int temp =x;
				x=z;
				z=temp;
			}if(z>=y) {
				int temp =y;
				y=z;
				y=temp;
			}String abc = x+">="+y+">="+z;
			return abc;
		}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=0 ; // �޴��� �Է¹��� ���� 
		while(true) {
			System.out.println("�Է��ϼ���1.�ִ밪  2.������ �� 3.���� 4.����");
			x=Integer.parseInt(br.readLine());
			if(x==1) { // return ���� ���´�. return  ���� ������ ���� ���� ������ �ʿ� ����
				int k =aaa();
				System.out.println("�μ� �� �ִ밪�� "+k+"�Դϴ�");
			}else if(x==2) {// �Լ��� �̸��� ȣ���Ѵ� call by name
				bbb();
			}else if(x==3) {// call by value ���� Ȱ���ؼ� �Ѱ��ִ� 
				System.out.println("ù��° ���� �Է�");
				int firstsu=Integer.parseInt(br.readLine());
				System.out.println("�ι�° ���� �Է�");
				int secondsu=Integer.parseInt(br.readLine());
				System.out.println("�ι�° ���� �Է�");
				int thirdsu=Integer.parseInt(br.readLine());
			 String str = ccc(firstsu,secondsu,thirdsu);
				System.out.println("ū������ ������ "+str);
			}else if(x==4) {
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				
				}System.out.println();
				
		}System.out.println("�����ϼ̽��ϴ�");
		
	}

}