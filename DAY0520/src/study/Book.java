package study;

public class Book {
	String title;
	String author;
	
	public Book() {
		
	}
	
	public Book (String t) { 
		title =t;
		author ="작자미상";
	}
	
	public Book (String t,String a) {// 생성자의 오버로딩
		title =t;
		author =a;
		// 생성자를 만들어서 필드를 나누어줌
		// 기본생성자는 매게변수가 없는거 
		// 클래스가 없는 생성자는 존재하지 않는다.
	}
}
