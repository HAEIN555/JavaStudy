package study;
/* java.util 패키지에 포함 
 * 2022/06/13 이라는 문자열을 delim(구분자를 /로)각각 2022,06,13으로 분리할때 사용한다! 
 * 각각의 문자열을 토큰이라구 한다!  
 * 
 */

import java.util.StringTokenizer; // ctrl shift o

public class StringTokenizerEX01 {
	
	StringTokenizer st;
	
	public StringTokenizerEX01(String str) { // 구분자 지정 안함
		// 구분자를 지정하지 않아도 디폴드 값은 공백 
		st = new StringTokenizer(str); // 객체 생성  
	}
	public StringTokenizerEX01(String str,String delim) { // 구분자지정 
		System.out.println("str : "+str);
		st = new StringTokenizer(str,delim);
	}
	public void print() {
		System.out.println("Token count :"+st.countTokens());
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); 
			System.out.println(token);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "삶이 그대를 속일지라도 슬퍼하거나 노여워하지말라";
		StringTokenizerEX01 st1 = new StringTokenizerEX01(str);
		st1.print();
		StringTokenizerEX01 st2 = new StringTokenizerEX01("2022/06/13","/");
		st2.print();
		StringTokenizerEX01 st3 = new StringTokenizerEX01("happydog");
		st3.print();
		
		
	}

}
