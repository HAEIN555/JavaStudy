package study;

public class D003 {

	public static void main(String[] args) {
		
		// ���� ������ --> ����(����)
		// i = 10 +1 , i = i + 1 �� ���� ����..! �ΰ��� ��� 11�̴�
		// += ���� �����Ѵ����� �����ض� i +=1 == i +1 (�����̴�.)
		// +=,-=,*=,/=,%= ---> ���� ���Կ�����  ���� p133�����ϱ�
		
		int a = 10;
		int result = 0;
		
		result +=  a;
		System.out.println("result="+result); // ����� 10
		result  -=  a;
		System.out.println("result="+result); // ����� 0
		result *=  a;
		System.out.println("result="+result); // ����� 0
		result  /=  a;
		System.out.println("result="+result); // ����� 0
		result %= a;
		System.out.println("result="+result); // ����� 0
		
		// �������� ������ �ִ�. ������ �̸��� ���� ���� ���� 
		// ���� 3������ ������ �Է� �޾� ����, ����� ����ϴ� ���α׷��� ������ 
		// �� ����� �Ҽ� 2�ڸ����� ����ϼ��� 
		
		
	}

}
