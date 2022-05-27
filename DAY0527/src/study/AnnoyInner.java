package study;
/*  	Annoymous(익명) 이너 클래스 
 * 		익명이란 ? 이름이 없는 것 
 * 		자바의 프로그램 적인 해석인 경우 클래스 이름이 없다. 
 * 		event 와 관련이 있음
 * 		interface 구현이 필요 없음
 * 		일반 메소드 내부에서 정의부를 가질 수 있음
 * 		abstract 를 상속 받을 수 있음
 * 		인터페이스를 상속방아 구현할때에는 한개만 구현함 
 */
abstract class AbsExam{
	int data = 10000;
	public abstract void printData();
}
public class AnnoyInner { //  객체를 생성할 수 없는 클래스 
	AbsExam ae = new AbsExam() {

		@Override
		public void printData() {
			System.out.println(data);
		}
	};
	public static void main(String[] args) {
		AnnoyInner ai = new AnnoyInner();
		ai.ae.printData();
	}		
}
	