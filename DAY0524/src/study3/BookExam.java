package study3;
import java.util.*;
class Book{
	static int count;
	String title;
	int score;
	public String getTitle() {
		return title;}
	public void setTitle(String title) {
		this.title = title;}
	public int getScore() {
		return score;}
	public void setScore(int score) {
		this.score = score;}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book[title="+title+",score="+score+"]";}
	public Book(String title ,int score) {
		this.title = title;
		this.score=score;
		count++;}
	
}

public class BookExam {

	public static void main(String[] args) {
		
		ArrayList<Book>list = new ArrayList<Book>();// 객체만 들어갈 수 있다. 객체배열 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=========================");
			System.out.println("1. 책등록");
			System.out.println("2. 책검색");
			System.out.println("3. 모든책 출력");
			System.out.println("4. 종료");
			System.out.println("=========================");
			
			System.out.print("메뉴선택 :");
			int menu =sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("책제목 :");
				String title = sc.next();
				System.out.print("책 평점 :");
				int score =sc.nextInt();
				list.add(new Book(title,score));// list.하고 add선택 여기에도 객체 
				break;
			case 2:
				System.out.print("책제목 :");
				String title2 = sc.nextLine();
				
				for(Book e :list) {
					if(e.getTitle().equals(title2)) {
						System.out.println(e/*.toString()*/);
					}
				}
				break;
			case 3:
			
				for(Book e :list) 
					{
					System.out.println(e/*.toString()*/);
					}
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			
			}
		}
	}

}
