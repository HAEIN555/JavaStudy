package study2;

public class Dog extends Animal {

	//오버라이딩
	private String name; // 이름을 클래스명으로 해서 지정
	
	public Dog() {
		name = getClass().getSimpleName();// 클래슬 이름을 샘플로 가져온다?
	}
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "멍 멍";
	}
	public String getName() { // getter만 가져오기
		return name;
	}
	
}
