package study2;
public class MemberInner {
	 int a=10;
	 private int b = 20;
	 static int c = 30;
	 class Inner { // ����Ŭ�������� static�� ������ �� ����� 
		 // static�� ���Ѵٸ� class ���� static���� �ٲپ�� �ؿ� 
		 // InnerŬ���� ���ο��� static�� ������ �� ����� �� 
		 // static int d = 30;
		public void prt() {
			System.out.println("a :"+a);
			System.out.println("b :"+b);
			System.out.println("c :"+c);
		} 
	 }
	 // ���� ��� 
	public static void main(String[] args) {
	/*	// ���� Ŭ������ ��� ������ �����Ϸ��� ���� �ܺ�Ŭ������ ��ü�� ���� 
		MemberInner mi = new MemberInner();
		// �ܺ� Ŭ������ ���ؼ� ���� Ŭ������ ��ü�� ����
		MemberInner.Inner mii = mi.new Inner(); �ι��� ����� ����� ��� 
		mii.prt();*/
		MemberInner.Inner mii = new MemberInner().new Inner();
		// �� �ܰ踦 ��ġ�� �ʰ� �ѹ��� ����� ���!
	}
}
