package study;

class book { // Ŭ���� ��� (Ŭ���� ��)

// ��� �ʵ� (����, ���) �Ӽ�
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	//������ 
	
	public book() {
		//�����ڸ� �ʱ�ȭ
	}


	public book(String name,String writer,int price, int nowpage,String isbn) {
		this.name =name;
		this.writer =writer;
		this.price=price;
		this.nowPage=nowpage;
		this.isbn=isbn;
		//�ŰԺ����� ��???????? 
	}
		// ctrl space ������ �ٷ� ���� ���´�! �����ϱ�!!!


	//�޼ҵ�(����,����)
	public void nextPage() {nowPage++;}
	public void previousPage() {nowPage--;}
	//public�� ��������
	
}

