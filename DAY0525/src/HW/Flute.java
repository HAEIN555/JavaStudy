package HW;

public class Flute extends Instrument{

	public static void main(String[] args) {
		Flute F = new Flute();
		F.play();
		F.volumeUp();
		F.volumeDown();
	}
	@Override // 오버라이딩 되었다고 알려주는
	public void play() {
		System.out.println("flute :play() 호출됨");
	}
	@Override // 오버라이딩 된 메소드 
	public void volumeUp() {
		System.out.println("flute :VolumeUp() 호출됨");
	}
	@Override
	public void volumeDown() {
		System.out.println("flute :VolumeDown() 호출됨");
	}
}
