package study;

/* 증감 연산자 (++,--)  :  하나씩 증가시키거나 , 감소시키는 연산자 
 */


public class Operex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x= 10;
		 int y = x++; // 전대입 후 연산
		 System.out.println("x :"+x+",y :"+y);
		 // y는 10 
		 int a= 10;
		 int b = ++a;  // 전연산 후 대입
		 System.out.println("a :"+a+",b :"+b);
		// b 는 11이다
		//4/15일
		 // 단항 연산자  - 항이 한개 있으면 단항 연산자
		 int i = 5;
		 i++; // 후위형 증감연산자 i=i+1 동일한 의미이다. sum = sum + 1  -> 누적의 연산에서 많이 쓰인다.  
		 System.out.println(i); // 결과값 6
		 i =5; // 결과값이 5이다.
		 System.out.println(i);
		++i;// 전위형 증감연산자 
		System.out.println(i); // 결과값 6
		
		
		
	}

}
