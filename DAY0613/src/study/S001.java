package study;
import java.util.*;
public class S001 {

	/* String Tokenizer 클래스  = util 클래스에 있음 
	 *  문자열을 좀 더 효과적으로 저리하려고 제공된 자바 클래스 
	 *  문자열에 있는 특정단어나 기호를 찾는 등의 기능
	 *   토큰 - 입력된 문자열의 최소단위 문자열을 일정한 규칙으로 구분한 구분자 
	 *   
	 *   stack  랜덤정수를 스택에 담아 다시 출력하는 프로그램
	 *   1랜덤정수 10개 생성ㅣ
	 *   2생성된 수를 스택에 넣는다.
	 *   3스택에 들어있는 수를 다시 출력  
	 *   stack 은 선입 후출하는 거!
	 */
	public static void main(String[] args) {
		
		// 랜덤 객체 생성
		Random r = new Random();
		// 스택 객체 생성
		Stack st = new Stack<>();
		
		int nNum, i; // 랜덤으로 생성된 정수를 저장하는 변수 
		
		// 스택에 저장 10개의 생성된 랜덤수를 스택에 저장!
		System.out.print("스택에 저장되는 수  :");
		for(i=0;i<10;i++) {
			r.setSeed(r.nextLong()); //seed 생성 
			//가장 큰 것을 배정한다! 정수의 가장 큰 자료형은 long 이니까   
			// 정수형의 범위를  넘어가지 않기 위해서 범위를 잡아주는 역할! 
			// 랜덤일때는 범위를 정하기 어려우니까 seed로 잡아주는 것 !
 			nNum = (r.nextInt()%100); // 0-99 사이의 숫자를 생성하세요!
			// 양수 음수 다나오게 하기 위해서 %  *를 한다면 양수만 나온다 
			st.push(nNum); // 스택에 저장
			System.out.print(" "+nNum); // 무작위의 숫자가 나온다
			//-95 67 2 -32 35 -15 -43 25 -2 -63	
		}
		System.out.println();
		// 스택에 저장된 수를 출력!
		System.out.print("스택에 저장된 수 출력 :");
		for(i=0;i<10;i++) {
			System.out.print(st.pop()+" "); // 저장된 것 꺼내오기 
		}//스택에 저장된 수 출력18 95 -20 -35 24 66 58 9 72 -38 
		//들어갈때는 push 나올때는 pop !! 선입 후출로 나온다!! 
		
	}
	
	
}
