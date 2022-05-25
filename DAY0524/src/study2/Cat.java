package study2;

public class Cat extends Animal {

	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();// 클래슬 이름을 샘플로 가져온다?
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "야 옹";
	}

	public String getName() {
		return name;
	}
	
}
