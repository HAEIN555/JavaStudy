package study2;
public class MemberInner {
	 int a=10;
	 private int b = 20;
	 static int c = 30;
	 class Inner { // 내부클래스에는 static이 존재할 수 없어요 
		 // static를 원한다면 class 까지 static으로 바꾸어야 해요 
		 // Inner클래스 내부에는 static이 존재할 수 없어요 ㅠ 
		 // static int d = 30;
		public void prt() {
			System.out.println("a :"+a);
			System.out.println("b :"+b);
			System.out.println("c :"+c);
		} 
	 }
	 // 전부 멤버 
	public static void main(String[] args) {
	/*	// 내부 클래스의 멤버 변수에 접근하려면 먼저 외부클래스의 객체를 생성 
		MemberInner mi = new MemberInner();
		// 외부 클래스를 통해서 내부 클래스의 객체를 생성
		MemberInner.Inner mii = mi.new Inner(); 두번에 나누어서 만드는 방법 
		mii.prt();*/
		MemberInner.Inner mii = new MemberInner().new Inner();
		// 두 단계를 거치지 않고 한번에 만드는 방법!
	}
}
