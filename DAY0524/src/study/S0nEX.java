package study;
/* ������ - ��Ÿ���� ���������� ����Ÿ���� ��ü�� ������ �� �ֵ��� �ϴ� ���� �ǹ� 
 * �θ� Ŭ������ Ÿ���� ���������� �ڽ�Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� ��
 *  �θ� Ŭ������ = �ڽ�
 *  
 *  ������ ����� ����
 *   Super super =  new Super();
 *   Sub sub = new Sub();
 *   
 *   ������ ���� �� ����
 *   Super super = new Sub();
 *   �ϳ��� Ÿ���� ������ ������ü�� �����Ѵ�.
 *   Super s1 = new Pol(); ����
 *   Super s2 = new B(); ����
 *   Super s3 = new Fire(); �ҹ��
 *   
 *   ���������� �޼ҵ�� �ڽ� ��������� �θ���� �����
 */

class ParentEX{
	int foo =5; // �θ��� ������� 
	public int getNumber(int a) {// �θ��� �޼ҵ�
		return a+1;
	}
}

public class S0nEX extends ParentEX {
	
	int foo = 7;// �ڽ��� ������� 
	@Override
	public int getNumber(int a) { // �ڽ� �޼ҵ�
		
		return a+2;
	}

	public static void main(String[] args) {
		
		ParentEX pe = new S0nEX();
		System.out.println(pe.getNumber(0)); //2: �޼ҵ�� �ڽ�
		System.out.println(pe.foo); //5 ��������� �θ� 
	}

}
