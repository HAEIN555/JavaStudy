package study;
import java.io.*;
class AClass{
	protected int x,y;//입력받는 두수 정수  
	protected char ch;// 연산자
	public AClass() {
		// TODO Auto-generated constructor stub
	}
	public void write(double result) {
		System.out.printf("%d%c%d=%.2f\n",x,ch,y,result);
	}
}
class BClass extends AClass{
	// 데이터 입력기능 (메소드)
	 boolean input()throws IOException{// 인스턴스 메소드
		 BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("임의의 두 정수 입력 (공백구분)");
		String temp = br.readLine();// "20 15"
		String [] str = temp.split("\\s");// {"20","15"}문자열 자름 
		
		if(str.length !=2)
			return false;
		x =Integer.parseInt(str[0]);
		y =Integer.parseInt(str[1]);
		System.out.println("연산자 입력 [+-*/] :"); 
		ch =(char)System.in.read();
		if(ch =='+'||ch=='-'||ch=='*'||ch=='/')
		return true; 
		
		
		return false;
	}
	
	// 연산 및 처리기능(메소드) 리턴으로 받아서 프린트로 출력
	public double calc() {
		double result =0;
		switch (ch) {
		case '+':result = x+y;break;
		case '-':result = x-y;break;
		case '*':result = x*y;break;
		case '/':result = x/y;break;

		default:
			break;
		}
		
		return result;
	}
}
public class inherEX02 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BClass bc= new BClass();
		if(!bc.input()) {
			System.out.println("Error");
			return;
		}
		double result =bc.calc();
		bc.write(result);
	}

}
