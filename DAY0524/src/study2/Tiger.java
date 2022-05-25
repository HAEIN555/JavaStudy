package study2;

public class Tiger extends Animal {

	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName();// 클래슬 이름을 샘플로 가져온다?
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "어 흥";
	}

	public String getName() {
		return name;
	}
}
