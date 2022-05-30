package com.study;

class Person{
	String name;
	int age;
	int weight;
	int height;
	// 생성자 오버로딩
	public Person() {
		// TODO Auto-generated constructor stub
	} // 기본생성자 - 매개변수가 없는 생성자 
	
	public Person(int age) {this.age=age;} 
	public Person(String name) {this.name=name;} 
}
	
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println("p1.name="+p1.name+"p1.height="+p1.height+
				"p1.weight="+p1.weight+"p1.age="+p1.age);
		Person p2 = new Person(30);
		System.out.println("p2.name="+p2.name+"p2.height="+p2.height+
				"p2.weight="+p2.weight+"p2.age="+p2.age);
		Person p3 = new Person("홍길동");
		System.out.println("p3.name="+p3.name+"p3.height="+p3.height+
				"p3.weight="+p3.weight+"p3.age="+p3.age);
	}

}
