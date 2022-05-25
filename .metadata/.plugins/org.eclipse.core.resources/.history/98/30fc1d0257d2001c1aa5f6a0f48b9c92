package study;

public class S004 {

	public static void main(String[] args) {
		/* [char] 자료형 배열에 알파벳 대문자를 채우고, 
		 * 채워진 배열에 전체 요소를 출력
		 * 단 char 자료형의 배열에 초기화는 반복문을 이용함 
		 */
	//알파벳 대문자를 구성
		//1. 
	/*
	 * char aa[]=new char[26]; aa[0]='A'; aa[1]='B'; aa[2]='C';
	 * 
	 * aa[25]='Z';
	 */
		//2.
		char aaa[]= {'A','B','C','Z'};
		//3.
		char bb[] = new char[26];
		for(int i =0,b=65;i<bb.length;i++,b++) {
			bb[i]=(char)b;
			/*대문자를 집어넣기 위해서 b=65라는 값을 넣어줌 만약 소문자라면 b=97*/
			System.out.printf("%c",bb[i]);
		}
		System.out.println();
		
		char [] alpha= new char[26];
		for(int r=0;r<alpha.length;r++) {
			alpha [r]=(char)('A'+r);
			System.out.print(alpha[r]);
		}// 위의 방식도 대문자를 출력시킬 수 있다.
		//저장과 출력을 따로 할수도 있고 한번에 만들어낼 수 도 있다
	
	}

}
