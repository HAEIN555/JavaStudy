package study;

public class BookEx {

	public static void main(String[] args) {
		
		book mybook = new book();
		mybook.name ="논어";
		mybook.writer ="공자"; 
		mybook.price = 6000;
		mybook.isbn ="0000-112111-11";
		mybook.nowPage=1;
		
		book mybook2=new book("논어","공자",6000,1,"0000-112111-11");
		// 뭐를 가지고도 초기화가 가능하ㅏ다????????????
		

	}

}
