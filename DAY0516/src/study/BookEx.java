package study;

public class BookEx {

	public static void main(String[] args) {
		
		book mybook = new book();
		mybook.name ="���";
		mybook.writer ="����"; 
		mybook.price = 6000;
		mybook.isbn ="0000-112111-11";
		mybook.nowPage=1;
		
		book mybook2=new book("���","����",6000,1,"0000-112111-11");
		// ���� ������ �ʱ�ȭ�� �����Ϥ���????????????
		

	}

}
