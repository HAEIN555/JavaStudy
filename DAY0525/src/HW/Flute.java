package HW;

public class Flute extends Instrument{

	public static void main(String[] args) {
		Flute F = new Flute();
		F.play();
		F.volumeUp();
		F.volumeDown();
	}
	@Override // �������̵� �Ǿ��ٰ� �˷��ִ�
	public void play() {
		System.out.println("flute :play() ȣ���");
	}
	@Override // �������̵� �� �޼ҵ� 
	public void volumeUp() {
		System.out.println("flute :VolumeUp() ȣ���");
	}
	@Override
	public void volumeDown() {
		System.out.println("flute :VolumeDown() ȣ���");
	}
}
