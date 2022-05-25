package study;

public class D003 {

	public static void main(String[] args) {
		
		// 대입 연산자 --> 대입(배정)
		// i = 10 +1 , i = i + 1 두 식은 같다..! 두값은 모두 11이다
		// += 먼저 연산한다음에 대입해라 i +=1 == i +1 (동격이다.)
		// +=,-=,*=,/=,%= ---> 복합 대입연산자  교재 p133참조하기
		
		int a = 10;
		int result = 0;
		
		result +=  a;
		System.out.println("result="+result); // 결과값 10
		result  -=  a;
		System.out.println("result="+result); // 결과값 0
		result *=  a;
		System.out.println("result="+result); // 결과값 0
		result  /=  a;
		System.out.println("result="+result); // 결과값 0
		result %= a;
		System.out.println("result="+result); // 결과값 0
		
		// 세가지의 과목이 있다. 과목의 이름은 국어 영어 수학 
		// 위의 3과목의 점수를 입력 받아 총점, 평균을 출력하는 프로그램을 만들어라 
		// 단 평균은 소수 2자리까지 출력하세요 
		
		
	}

}
