package study;

public class Test002 {
	
	 //staticint aa; // 여기에다가 변수를 선언해도 에러나지 않는다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 사용할 경우 "" ; ( 쌍 따옴표 ,더블 쿼터) -> 문자열을 표현 한다. 
		// 문자 하나 일때에는 char라는 용어를 사용한다. string은 문자열 사용 
		// // 하나 짜라 따옴표는 '' ( 싱글 쿼터 ) 
		
		//Test002 t = new Test002();
		// t.을 할때에 인식을 한다. aa가 나오면서 
		String str = "우리는"; // 문자열을 사용한다. 그리고 더블 쿼터를 사용한다.ㅣ 
		char ch ='한'; // 문자가 하나만 사용 가능하다 그리고 싱글 쿼터를 사용해야한다. 문자 하나만 사용 가능
		
		System.out.println(str);
		System.out.println(ch);
		
		// 스트링인 경우에는 줄바꿈 해줄때 \c -> char \s -> string  문자열과 캐릭터 
		System.out.printf("%s\n",str);
		 // %s으로 스트링을 나타내주고  \n으로 줄바꿈을 해준다. 
		System.out.printf("%c\n",ch);
		// %c 으로 문자를 나타내주고 \n으로 줄바꿈을 해준다.
		System.out.printf("%s,%c\n",str,ch);
		// 지정된 저 두가지 변수를 다 나타내준다.
		
		System.out.println(10);
		
		System.out.println(2.14+"는 실수입니다.");
		
		int a =0;
		System.out.println(a);
		
		//System.out.println(aa); main  밖에 있기 때문에 사용할 수 없음 
		// static은 같이 사용한다. 
		// 클래스 전역에서 사용할 수 있는 것을 전역변수 , 클래스 내에서만 사용 가능한 것은 지역변수 
		// 전역은 클래서 전체에서 사용이 가능하다. 
		
		
		
		// 상수나 매개변수는 그냥 사용한다. 
		// 여러문자열과 매개변수를 사용할 경우 연결기호로 +를 사용한다.
		
		// long 보다 더 큰건 빅데이터이다. 
		
	}

}
