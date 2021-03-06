package study;

import java.io.*;
// 계산기를 만들어봅시다
public class MethodEX04 {
								// su1, su2
	public static int plus(int x,int y) { //+
		return x+y;
	}
	public static int min(int x,int y) { //-
		return x-y;
	}
	public static int mul(int x,int y) { //*
		return x*y;
	}
	public static int div(int x,int y) { // /
		return x/y;
	}
	public static int per(int x,int y) { // %
		return x%y;
	}
	//a는 첫번째 수 b는 연산자 c는 두번째 수 d는 결과값
	public static void disp(int a ,char b,int c,int d) { 
		System.out.println("\n"+a+" "+b+" "+c+"="+d);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 변수 선언 
		int su1=0;
		int su2=0;
		int tot =0;
		char yon=0;
		
		System.out.print("첫번째 수 입력하세요");
		su1=Integer.parseInt(br.readLine());
		// 연산자 
		do {
			System.out.print("연산자 입력yon(+, - ,*, / ,%) :");
			
			yon=(char)System.in.read();
			//System.in.read();
			//System.in.read();
			System.in.skip(2); //skip 이라는 메소드를 사용하면 2번을 건너뜁니다. 
		}while(yon !='+'&&yon !='-'&&yon !='*'&&yon !='/'&&yon!='%');
		
		System.out.print("두번째 수 입력하세요");
		su2=Integer.parseInt(br.readLine());
		
		// 연산자를 조건으로 해서 처리합니다 
		switch (yon) {
		case '+':
			//tot =su1+su2; 메소드 적용 안할때 
			tot=plus(su1,su2);
			break;
		case '-':
			//tot =su1-su2;
			tot=min(su1,su2);
			break;
		case '*':
			//tot =su1*su2;
			tot=mul(su1,su2);
			break;
		case '/':
			//tot =su1/su2;
			tot=div(su1,su2);
			break;
		case '%':
			//tot =su1%su2;
			tot=per(su1,su2);
			break;
		}
		//System.out.println(su1+" "+yon+" "+su2+"="+tot);
		disp(su1, yon, su2, tot);
	}

}
