package study2;

public class Cat extends Animal {

	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();// Ŭ���� �̸��� ���÷� �����´�?
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "�� ��";
	}

	public String getName() {
		return name;
	}
	
}
