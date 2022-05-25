package study;

class BookEx{

	String title;
	String author;
	public void show() {
		
		System.out.println(title+" "+author);
	}
	public BookEx() { // 매개변수 0개
		
		 //BookEx("",""); 이렇게 안되서this로 바꿈
		this("","");// 초기화가 되어서 이렇게 나온다
		System.out.println("생성자 호출");
			
	}
	
	public BookEx(String title) {// 매개변수 1개
		this(title,"작자미상");
	}
	
	public BookEx(String title,String author) {// 매개변수 2개
		this.title = title;
		this.author =author;
	}
	
}

public class ThisEX03 {

	public static void main(String[] args) {
		BookEx be = new BookEx("홍길동전","허균");
		
		BookEx be2 = new BookEx("홍길동전");
		
		BookEx be3 = new BookEx();
		
		be.show();
		be2.show();
		be3.show();
	}

}
