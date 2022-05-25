package study;
	 // import java.io.BufferedReader;
	 // import java.io.InputStreamReader;
	  import java.io.*;// io 에서 쓸 수 있는거 모두 가져온다.
public class D004 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 스캐너가 아닌 문자를 입력받는 방법
		// 문자열 을 입력하는 방법
	
		String name ,nai , addr, tel;
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader bb = new BufferedReader(is)
		
		//위의 것과 아래 것은 똑같다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 : ");
		name = br.readLine();
		
		System.out.print("나이 : ");
		nai = br.readLine();
		
		System.out.print("주소 : ");
		addr = br.readLine();
		
		System.out.print("전번 : ");
		tel = br.readLine();
		
		
	}

}
