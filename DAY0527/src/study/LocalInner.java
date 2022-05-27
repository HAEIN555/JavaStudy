package study;
/* 데이터를 어떻게 사용할건지 --> 코딩의 중요한 이유 
 *  Member Inner class 
 *  객체를 생성해야만 사용할 수 있는 멤버들과 같은 위치에 정의 되는 클래스 
 *  이너 클래스의 객체를 생성하려면 외부 클래스 객체를 생성한 후에 생성할 수 있다.
 *  
 *  이너 클래스 내부에는 static이 존재 할 수 없다. 
 *  
 *  Local Inner class 
 *  클래스 내부의 특정 메소드 안에 정의 되는 클래스 - 지역변수와 같은 역할을 한다. 
 *  메소드가 호출될때 생성할 수 있으며 메소드의 수행력이 없어지면 끝나는 지역변수
 *  와 같이 자동으로 소멸된다. 
 *  
 *   ※ 잘 사용하지는 않는다.
 *   - 클래스 내부에 클래스가 존재 메소드 실행시에만 실행된다. 
 *   class Outer{
 *   	Public void aa(){// 클래스의 멤버 메소드 
 *   
 *   class Inner{ // 메소드 안에 지역변수와 같은 곳에 위치 
 *   			}
 *   		}
 *   	}
 */
public class LocalInner {
	
	int a =100; // 외부 클래스의 멤버 변수 Local Inner의 멤버변수 
	public void innerExam01(int k) { // 멤버 메소드 
		int b =200; // 지역변수 (메소드 내에서만 생존함)
		final int c =k; // 상수 .  메소드 호출할때 매개 변수 사용? 
		class Inner{// 로컬 이너 클래스 
			// 로컬 이너 클래스는 외부 클래스의 멤버 변수와 같은 위치에 존재
			// 멤버 변수와 상수들만 접근이 가능하다
			public void getData() {
			System.out.println("int a :"+a);
			System.out.println("int b"+b);
			System.out.println("final int c:"+c);
			}
		}// Inner클래스의 끝
		//메소드 내에서 LocalInnerclass 의 객체 생성이 가능하다
		Inner i = new Inner();
		// 생성된 객체를 통해서 메소드를 호출한다. 
		i.getData();
	}// 메소드의 끝 

	public static void main(String[] args) {
		
		LocalInner li = new LocalInner();
		li.innerExam01(1000);
	}

}
