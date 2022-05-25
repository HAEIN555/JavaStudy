package study;

public class D002 {

	public static void main(String[] args) {
	/* 비교연산 : < , > <= ,>=
	 * 항등 연산 : == ,!=
	 */
	int i = 10;
	int j = 20;
	boolean c= i <j; // 변수 i 가 j 보다 작다
	System.out.println("i<j:"+c); // i <j : true라는 결과값이 나옴
	System.out.println();
	c= i != j; //변수 i와 변수 j는 같지 않다. 
	System.out.println("i != j :" +c); //i != j :true라는 결과값이 나옴
	
	// 논리 연산자 
	// and(&&논리곱), or(||논리합) , not(! 0이라면 1이고 1이라면 0이다.)
	// 입력이 2개이다 나올 수 있는  경우의 수는 2^2 
	// &, | ---> 비트 연산자 이다. 헷갈리지 않게 조심하기! 십진수의 값을 2진수를 바꾸기
	// 2&5 0010&0101 ---> 0  곱하기,2|5 ---> 0010|0101--->7 더하기
	// 비교하는 거라서 if문을 많이 사용함!
	boolean a=false; // boolean의 초기값은 false이다. boolean 은 초기화를 해주어야 한다.?
	boolean b=false;
	if ((a= 4>3)|| (b=5>7)) {
		System.out.println("a="+a);
		System.out.println("b="+b);
		// a = 4>3--->T, b=5>7---->F ,a||b 3가지!--->T
		//요거의 연산자는 3개이다. 	
	}
	
	// 비트 연산자 ---> 10진수를 2진수를 바꾸는! 그래서 &곱! | 합!
	int g = 2&5;
	int h = 2|5;
	
	System.out.println("bit & 연산 결과 : "+g); //연산결과 0
	System.out.println("bit | 연산 결과 : "+h); // 연산결과 7
	
	// 삼항연산자 
	// 가장먼저는 우측을 봐야한다. 그럼 연산자는 2개 항은 3개라는 것을 알 수 있따.
	// 조건이 참이면 연산자 바로 다음것을 사용하고 거짓이라면 그다음 것을 사용한다. 
	int o = 20, r=30, max;
	max = o>r ? ++o : ++r;
	//o>r은 if 문으로 생각하면 되고 이거는 false 이므로 ++r이 실행된다.
	System.out.println("o : "+o); //o는 20 
	System.out.println("r : "+r); // r은 31
	System.out.println("max : "+max); //max는 31
	
	// 문제 정수 35가 짝수인지 홀수 인지 판정하는 프로그램 구현
	// 단 , 삼항 연산자를 활용
	int s=35;
	String result; // string은 꼭 대문자를 써주어야 하나?
	result = s % 2==0 ? "짝수" : "홀수" ;
	
	System.out.println("정수35는"+result+"입니다.");
	
	}

}
