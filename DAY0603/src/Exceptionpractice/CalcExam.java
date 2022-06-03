package Exceptionpractice;
import java.io.*;

public class CalcExam {
	
	private static BufferedReader br;
	static { // 공유형으로 만들어줌 	
	br = new BufferedReader(new InputStreamReader(System.in));
	}	
	public static void main(String[] args)throws IOException{
		int su1=0,su2=0,tot=0;
		char yon =0, flag=0; //flag는 do while문에 활용 
		
		while(true) {
			
			do {
				flag =0;
				
				try {
				System.out.println("첫번째 수:");
				su1 = Integer.parseInt(br.readLine());
				}catch (NumberFormatException nfe) {
						System.out.println("숫자만 가능합니다.");
						flag=1;
					}
			}while(flag!=0);
			do {
				do {
					flag =0;
					String str="";
					try {
					System.out.println("연산자(+,-,*,/)");
					str= br.readLine();
					yon = str.charAt(0); 
					//(char)System.in.read();
					//System.in.skip(2);
					}catch (StringIndexOutOfBoundsException soe) {
							System.out.println("뭐든지 입력하셔야 합니다.");
							flag=1;
						}
					if(str.length() !=1) {
						System.out.println("연산자는 1자리로 하셔야 합니다.");
						flag =1;
					}
				}while(flag!=0||yon!='+'||yon!='-'||yon!='*'||yon!='/');
				do {
					flag =0;
					
					try {
					System.out.println("두번째 수:");
					su2 = Integer.parseInt(br.readLine());
					}catch (NumberFormatException nfe) {
							System.out.println("숫자만 가능합니다.");
							flag=1;
						}
				}while(flag!=0);
			} while (flag !=0);
			flag =0;
			try {
				switch (yon) {
				case '+': tot = su1+su2;break;
				case '-': tot = su1-su2;break;
				case '*': tot = su1*su2;break;
				case '/': tot = su1/su2;break;
				}
			} catch (ArithmeticException ae) {
				System.out.println("0으로는 나눌 수 없습니다.");
				flag =1;
			}
			
		}
	}

}
