package study;

class BookEx{

	String title;
	String author;
	public void show() {
		
		System.out.println(title+" "+author);
	}
	public BookEx() { // �Ű����� 0��
		
		 //BookEx("",""); �̷��� �ȵǼ�this�� �ٲ�
		this("","");// �ʱ�ȭ�� �Ǿ �̷��� ���´�
		System.out.println("������ ȣ��");
			
	}
	
	public BookEx(String title) {// �Ű����� 1��
		this(title,"���ڹ̻�");
	}
	
	public BookEx(String title,String author) {// �Ű����� 2��
		this.title = title;
		this.author =author;
	}
	
}

public class ThisEX03 {

	public static void main(String[] args) {
		BookEx be = new BookEx("ȫ�浿��","���");
		
		BookEx be2 = new BookEx("ȫ�浿��");
		
		BookEx be3 = new BookEx();
		
		be.show();
		be2.show();
		be3.show();
	}

}
