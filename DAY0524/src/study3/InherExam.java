package study3;

class SuperExam{
	private int a = 5;
	protected int b =10;
	public int c = 20;
	// 접근제한자가 다양
	public void write() {
		System.out.println("super write 메소드 : "+a+":"+b+":"+c);
		}
	}
 class SubExam extends SuperExam{
	 protected int b =100;
	 
	 public void print() {
		 System.out.println("sub print 메소드 :"+super.b+" "+super.c);
	 	}
	 @Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("sub write 메소드  :"+b+" : "+c);
	}
 	}
public class InherExam {

	public static void main(String[] args) {
		SubExam se= new SubExam();
		se.write();
		se.print();
		
		((SuperExam)se).write(); //superwrite메소드를 가져오려고 upcasting 
		
		System.out.println("(SuperExam)se).b:"+((SuperExam)se).b);
	 // 메소드는 자식것 변수는 부모 것 
	}

}
