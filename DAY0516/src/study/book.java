package study;

class book { // 클래스 헤더 (클래스 명)

// 멤버 필드 (변수, 상수) 속성
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	//생성자 
	
	public book() {
		//생성자를 초기화
	}


	public book(String name,String writer,int price, int nowpage,String isbn) {
		this.name =name;
		this.writer =writer;
		this.price=price;
		this.nowPage=nowpage;
		this.isbn=isbn;
		//매게변수로 뭐???????? 
	}
		// ctrl space 누르면 바로 위에 나온다! 참고하기!!!


	//메소드(동작,행위)
	public void nextPage() {nowPage++;}
	public void previousPage() {nowPage--;}
	//public은 생략가능
	
}

