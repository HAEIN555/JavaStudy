package Com.method_;

/* 메소드 오버로드 
 * 동일한 (하나의)클래스에서 같은 이름을 가진 메소드가 여러개 정의 되는 것을 의미
 * ~같은 이름의 메소드에 인자가(매개변수)다른 경우
 * ~ 인자가 다르다는 것은 인자의 갯수가 다르거나, 인자의 자료형이 다르거나 ,인자의 수를 의미함
 * 같은 목적으로 비슷한 동작을 수행하는 메소드는 모아 이름을 같게 만들어 일관성을 유지하기 위함
 * 
 * 접근 제한자 반환형 메소드 명(자료형 인자,자료형 인자.....)
 * 		접근 제한자(public)와 반환형(return)은 상관 없다 
 * 		메소드의 이름은 반드시 같아야 한다. (동일해야한다.)
 * 		자료형이나 인자의 갯수는 반드시 다르게 해야한다.
 */
public class OverloadingEX01 {
		
		public void intLength(int a) {
			String s =String.valueOf(a);// 값이 맞는지 아닌지 지정된 값을 문자열로 변환하여 반환한다.
			System.out.print("입력한 값의 길이는 :"+s.length());
			
		}

		public void floatLength(float a) {
			String s =String.valueOf(a);// 값이 맞는지 아닌지 지정된 값을 문자열로 변환하여 반환한다.
			System.out.print("입력한 값의 길이는 :"+s.length());
			
		}

		public void StringLength(String a) {
			String s =String.valueOf(a);// 값이 맞는지 아닌지 지정된 값을 문자열로 변환하여 반환한다.
			System.out.print("입력한 값의 길이는 :"+s.length());
			
		}

		
	public static void main(String[] args) {
		OverloadingEX01 oe1= new OverloadingEX01();
		oe1.intLength(1000);
		oe1.floatLength(314f);
		
	}

}
