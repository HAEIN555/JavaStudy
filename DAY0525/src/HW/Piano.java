package HW;
// 추상 클래스를 상속 받아 구현하는 구현체 (하위 클래스)
public class Piano extends Instrument {
	public static void main(String[] args) {
		Piano p = new Piano(); // piano 클래스의 인스턴스 생성
		p.play(); // 인스턴스 메소드 호출
		p.volumeUp();
		p.volumeDown();
	}
	@Override
	public void play() { // 인스턴스 메소드 어떻게 접근?? -> 인스턴스 생성으로(객체생성)
		System.out.println("Piano :play() 호출됨");
	}

	@Override
	public void volumeUp() {
		System.out.println("Piano :VolumeUp() 호출됨");
	}

	@Override
	public void volumeDown() {
		System.out.println("Piano :VolumeDown() 호출됨");
	} 
}