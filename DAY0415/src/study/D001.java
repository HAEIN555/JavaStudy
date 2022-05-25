package study;

public class D001 {

	public static void main(String[] args) {
		//4/15일
		//1바이트는 8비트 
		//크기를 물어보는거 는 MAX Value 참고해보자!
		 // 단항 연산자  - 항이 한개 있으면 단항 연산자
		 int i = 5;
		 i++; // 후위형 증감연산자 i=i+1 동일한 의미이다. sum = sum + 1  -> 누적의 연산에서 많이 쓰인다.  
		 System.out.println(i); // 결과값 6
		 i =5; // 결과값이 5이다.
		 System.out.println(i);
		++i;// 전위형 증감연산자 
		System.out.println(i); // 결과값 6
		
		// 산술연산자  +,-,*,/--->몫을 구한다.,%-----> 나머지를 구한다.
		// 산술연산자 * 말고도 * 만능문자로 쓸 수 있다. 
		// * 모든것을 조회할때 이렇게 쓴다. 쿼리문에서 쓰임
		// 자바 스크립트의 event (버튼을 누를때 뭔가 실행되는?)에는 연산자가 %,%% 가 쓰인다.
		
		int y=7, j=5;
		// + ,-, *, /
		
		System.out.println(y+"+"+j+"="+(y+j));
		System.out.printf("%d -%d =%d%n",y,j,(y-j));
		System.out.printf("%d *%d =%d%n",y,j,(y*j));
		System.out.printf("%d /%d =%d%n",y,j,(y/j));
		System.out.printf("%d %%%d =%d%n",y,j,(y%j));
		// 하나는 문자로 가고 하나는 서식으로 가기때문에 %% 붙여주어야한다.  
		
		
		//시프트 연산자  >>,<<
		
		// 기본적으로 1.2.4.8.16.32.64.128.256.512.1024..알고 있기
		
		int t= 10;
		
		int p = t >>2;
		
		System.out.println(p); // 결과값 2  10=1010 --> 0010--->2
		// 결과를 나오기 위해서 십진수를 2진수를 바꾼다. 그리고 왼쪽으로 가는지 오른쪽으로 가는지 판단
		// 남아있는 비트의 갯수를 판단! 
		
		   t= 10 ;//  10=1010
		   int v = t <<3; // 1010을 <<3 옮겨준다.
		   System.out.println(v); // 결과값 80-->1010000
		
		 
		   
				
		
		
	}

}
