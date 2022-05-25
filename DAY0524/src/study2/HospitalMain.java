package study2;

public class HospitalMain {

	public static void main(String[] args) {
		
		Hospital hosp = new Hospital();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		hosp.inject(dog);
		hosp.inject(cat);
		hosp.inject(tiger);
	}

}
