package study;

public class BookEX01 {

	public static void main(String[] args) {
		
		Book b= new Book("어린왕자", "생텍쥐페리");
		
		Book lovestory = new Book("춘향뎐");
		
		System.out.println(b.title+"의 작가는"+b.author);
		System.out.println(lovestory.title+"의 작가는"+lovestory.author);
	}

}
