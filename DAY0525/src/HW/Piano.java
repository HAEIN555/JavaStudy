package HW;
// �߻� Ŭ������ ��� �޾� �����ϴ� ����ü (���� Ŭ����)
public class Piano extends Instrument {
	public static void main(String[] args) {
		Piano p = new Piano(); // piano Ŭ������ �ν��Ͻ� ����
		p.play(); // �ν��Ͻ� �޼ҵ� ȣ��
		p.volumeUp();
		p.volumeDown();
	}
	@Override
	public void play() { // �ν��Ͻ� �޼ҵ� ��� ����?? -> �ν��Ͻ� ��������(��ü����)
		System.out.println("Piano :play() ȣ���");
	}

	@Override
	public void volumeUp() {
		System.out.println("Piano :VolumeUp() ȣ���");
	}

	@Override
	public void volumeDown() {
		System.out.println("Piano :VolumeDown() ȣ���");
	} 
}