package study;
// Arrays.toString()
// to String() :  배열의 모든 요소[첫번째 요소 - ~]와 같은 형식의 값을 문자열의 형식으로 만들어서 반환함
import java.util.*;
public class S003 {

	public static void main(String[] args) {
	// main 은 지금까지 함수이지만  객체지향으로 넘어가면 메소드로 바뀌게 된다.
	// 변수들도 속성으로 변한다. 
	
	int [] iArr1 =new int[10];	
	int [] iArr2 =new int[6];	
	int [] iArr3 =new int[] {100,95,80,70,60};	
	int [] iArr4 ={100,95,80,70,60};	
	//3번 배열과 4번 배열은 동일한 것이다
	char[] chArr = {'a','b','c','d'};
	// 지금 현재의 클래스 안에 있는 배열의 수는 6개 이다 main 안에 있는 배열까지 있으니까
	
	// 위의 방법이 데이터를 저장하는 방법
	// for문으로도 사용이 가능하다!
	// iArr1의 배열에 1~10까지 순서대로 저장함
	for(int i=0;i<iArr1.length;i++) {
		iArr1[i]=i+1/*i의 값을 넣어준다 1씩 증가해서 값이 들어가게끔*/;
		System.out.print(iArr1[i]+"\t");
	}
	// 랜덤 클래스를 이용해서 1-10까지의 임의의 수를 저장한다!
	System.out.println();
	//로또 번호를 정해보자!
	for(int i=0;i<iArr2.length;i++) {
		iArr2[i]=(int)(Math.random()*45)+1; 
		// Math.random()*45는 0부터 44까지의 랜덤값을 잡기때문에 1을 더해주어서 1-45 값을 만들어준다.
		// Math.random 이 double 형이 이기때문에 (int)으로 형변환을 해준다
		System.out.print(iArr2[i]+"\t");
	}
	System.out.println();
	// 배열로 뽑아내보자
	for(int i=0;i<iArr3.length;i++) {
		
		System.out.print(iArr3[i]+"\t");
	}
	System.out.println();
	for(int i=0;i<iArr4.length;i++) {
		
		System.out.print(iArr4[i]+"\t");
	}
	System.out.println();
	
	System.out.println(Arrays.toString(iArr2));
	// 배열을 표시하면서 뽑는다...! [37, 6, 23, 38, 19, 2] 이런식으로 랜덤으로 나와서 값이 요따구이다
	/*	객체의 부모는 object to string
 		이 메서드는 인스턴스의 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것이다. 인스턴스의 정보를 제공한다는 것
		대부분 경우 인스턴스 변수에 저장된 값들을 문자열로 표현한다는 말이다. 
	 * 
	 */
	System.out.println(chArr);

	}

}
