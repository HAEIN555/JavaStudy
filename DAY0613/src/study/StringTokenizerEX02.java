package study;
import java.util.*;
public class StringTokenizerEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="학교,집,,게임방";
		
		StringTokenizer tokens = new StringTokenizer(str,",");
		for(int x =1;tokens.hasMoreTokens();x++) {
			System.out.print("문자 "+x+":"+tokens.nextToken()+"\t");
		} //문자 1:학교	문자 2:집	문자 3:게임방 
		//StringTokenizer 클래스의 경우 공백을 무시하고 제거한다. 
		System.out.println();
		System.out.println("========================");
		String[] values = str.split(",");      //공백을 구분하느냐 
		for(int x=0;x<values.length;x++) {
			System.out.print("문자 "+(x+1)+":"+values[x]+"\t");
		}//문자 1:학교	문자 2:집	문자 3:	문자 4:게임방
	
		// StringTokenizer 공백을 무시한다 하지만 string은 공백을 쳐준다. 
		//  String 클래스의 spilt() 메소드는 무의미한 공백도 하나의 자리로 인정한다. 
		
	}

}
