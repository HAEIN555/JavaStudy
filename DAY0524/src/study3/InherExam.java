package study3;

class SuperExam{
	private int a = 5;
	protected int b =10;
	public int c = 20;
	// ���������ڰ� �پ�
	public void write() {
		System.out.println("super write �޼ҵ� : "+a+":"+b+":"+c);
		}
	}
 class SubExam extends SuperExam{
	 protected int b =100;
	 
	 public void print() {
		 System.out.println("sub print �޼ҵ� :"+super.b+" "+super.c);
	 	}
	 @Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("sub write �޼ҵ�  :"+b+" : "+c);
	}
 	}
public class InherExam {

	public static void main(String[] args) {
		SubExam se= new SubExam();
		se.write();
		se.print();
		
		((SuperExam)se).write(); //superwrite�޼ҵ带 ���������� upcasting 
		
		System.out.println("(SuperExam)se).b:"+((SuperExam)se).b);
	 // �޼ҵ�� �ڽİ� ������ �θ� �� 
	}

}