package study2;

public class Hospital {

	public void inject(Animal animal/*참조변수 활용*/) {
		System.out.println(animal.getName()+"를(을) 치료하기위해 엉덩이에 주사를 놓습니다.");
		System.out.println(animal.scream());
	}
}
