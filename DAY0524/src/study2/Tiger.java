package study2;

public class Tiger extends Animal {

	private String name;
	
	public Tiger() {
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
