package review;

public class D001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1���� 10������ �հ踦 ���غ�����
	// ������ ���ϰ� ��Ģ�� ã�ƺ��°� �߿��ؿ�!
	// �ʱⰪ�� �� �ѹ� ����ϴ�!
	System.out.println("for���ΰ�쿡");
	//1���� 10���� �ݺ�ó���ϴ� ����
	int i;// �ݺ�ó���ϸ鼭 �����հ踦 �����ϴ� ����
	int sum=0;
	// �����հ迡 �����Ⱑ ���� ���� �����ϱ� ���ؼ� 
	// �ʱ�ȭ�� ���־�� �մϴ�!
	//for�� 
	//for (;;)- �ʱⰪx�ݺ����� ���� �̰� ���� ������!
	for (i=1;i<=10;i++) {
		sum=sum+i;
		System.out.println(i+" "+sum);		
	}
	//while��
	System.out.println("while���ΰ�쿡");
	int s=0;
	int total=0;
	s=1;
	while(s<=10) {
		total=total+s;
		s++;
		System.out.println(s+" "+total);
		}
	int r=1;
	int hap=0;
	do {
		hap=hap+r;
		System.out.println(r+" "+hap);
		r++;
	}while(r<=10);
	
	
	
	}
}
