package study;
/*
 * �� ��ȯ
 *   ������ �� ��ȯ (�ڵ�����ȯ)
 * 	 	- �� ū �ڷ������� ��ȯ(�ڵ�)
 *  	- ���� �ս� ����
 *			ex) short a,b;  
 *  				a=b=10;
 *  				int c= a+b;
 *  
 *  
 *   ������ �� ��ȯ(��������ȯ)
 *   	- �� ���� �ڷ������� ��ȯ (����)
 * 		- ������ �ս� ���ɼ��� ����
 * 			ex) int c = 0; short s= 10;
 *				 s = c + s;
 * 					������ �����.
 * 					�׷��� s = (short)(c+s);
 * 		boolean���� �� ��ȯ �Ұ� 		
 * 		byte : char�� casting �� --����Ʈ�� ĳ���ͷ� ��ȯ ���� 16��Ʈ����??
 *  	long : float�� �ڵ����� �Ǽ��� ó���ȴ�. �Ǽ����� ���������� ũ�Ƿ� ! 	
 */
public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		// ����ȯ�̶�, ���� �Ǵ� ��� Ÿ���� �ٸ� Ÿ������ ǥ���ϰ��� �� �� 
		// ��ȯ ����� (�ڷ���)(������)
		double d = 97.64;
		
		int score = (int)d;
		//double�� int ���� �ڷ����� ū�� int�� ��Ÿ���� �; int �� �տ� (int)�� ����Ͽ� ���ش�.
		
		int i = 10;
		byte b =(byte) i; // ������ ����ȯ ���� 
		
		// �� ū �ڷ����� ���� �ڷ����� ���� �ְ� ������ �� ���� �ڷ����� ()�� ���·� ���ش�.
		
		i = 500;
		b= (byte)i; // ��������ȯ - ������ ����ȯ ����
		System.out.println(b);
		
		// ���ڸ� ���ڷ� ���ڸ� ���ڷ� ��ȯ�ϱⰡ �����ϴ�.
		/*  �⺻�ڷ����� ---> Ŭ����ȭ wrapper ---> wrapperŬ���� å 490p ����
		 *   string�� �⺻�ڷ����� �ƴ϶� ������ �⺻�ڷ����� �̷��� �ٲپ� �ش�.?
		 * byte -> Byte , short -> Short , int -> Integer , long -> Long , char-> Character
		 *  int �� char�� ��� ���ڸ� �� �޴´�?
		 *   �ļ����� ������ �´�.??
		 */
		
		
	}

}