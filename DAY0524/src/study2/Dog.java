package study2;

public class Dog extends Animal {

	//�������̵�
	private String name; // �̸��� Ŭ���������� �ؼ� ����
	
	public Dog() {
		name = getClass().getSimpleName();// Ŭ���� �̸��� ���÷� �����´�?
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "�� ��";
	}
	public String getName() { // getter�� ��������
		return name;
	}
	
}
