package study;

class PointEX{
	private int x;
	private int y;
	public PointEX() {/* �⺻������*/}
	public PointEX(int x) {this.x=x;}
	public PointEX(int x, int y)
	{	this(x);
		this.y=y;}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.println("x value is(����)"+x);
		System.out.println("y value is(����)"+y);
	}
	
	
	
}
public class CircleEX extends PointEX {
	
	private int r;
	
	public CircleEX() {
	}
	public CircleEX(int x) {
		super(x);
		r=1;
	}
	public CircleEX(int x,int y) {
		super(x,y);// �����ε�
		r=2;
	}
	public CircleEX(int x,int y,int r) {
		super(x,y); //�����ε�
		this.r=r;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("r:"+r);
	}
	
	
	public static void main(String[] args) {
		
		CircleEX c = new CircleEX();
		c.display();
	}

}
