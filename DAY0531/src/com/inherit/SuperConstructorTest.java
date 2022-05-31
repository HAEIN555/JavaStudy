package com.inherit;
	class Sawon2{
		
		String name;
		String dept;
		int salary;
		public Sawon2() {
			// TODO Auto-generated constructor stub
		}
	
		public Sawon2(String name,String dept,int salary) {
			super(); // 이거 왜 될까? object의 생성자라서 
			this.name= name;
			this.dept=dept;
			this.salary=salary;
		}
		String displayInfo() {
			return "이름 :"+name+"부서 :"+dept+"연봉 :"+salary;
		}
	}
	class Sales2 extends Sawon2{
		// 여기에 기본생성자가 없으면 에러가 난다!
		int commition;
		public Sales2(String name,String dept,int salary,int commition) {
			// TODO Auto-generated constructor stub
			super(name,dept,salary); // 다른생성자를 호출할때는 맨첫줄이다! 
			this.commition=commition;
		}
		@Override
		String displayInfo() {
			// TODO Auto-generated method stub
			return super.displayInfo()+"수당"+commition;
		}
	}
public class SuperConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales2 se = new Sales2("홍길동", "개발부", 1000000000, 5000000);
		System.out.println(se.displayInfo());
	}

}
