package study2;
import java.io.*;
public class Banking {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		account na =new account("포카칩");
		
		String strWork ;
		
		// 메뉴를 띄운다.
		do {
			System.out.println("\n원하시는 업무를 선택하세요");
			System.out.println("----------------------------------------");
			System.out.println("입           금-------------------------> 1");
			System.out.println("출           금-------------------------> 2");
			System.out.println("잔  액   조  회------------------------> 3");
			System.out.println("종           료-------------------------> 0");
			System.out.println("----------------------------------------");
			
			System.out.println("작업 내용을 선택하세요");
			strWork =br.readLine();
			
			int switchInt =0;
			if(strWork != null) { // 메뉴가 선택 되었을 경우 ,널이 아닐때
				// 문자열을 정수로 바꾸어주세요 strWork안에 있는 문자열을 정수형을 바꿔준다.
				switchInt  = Integer.parseInt(strWork);
			}else { // 널일때
				System.out.println("업무내용을 입력하지 않으셨습니다.");
				System.exit(0);
			}
			
			switch (switchInt) {
			case 0:System.out.println("프로그램을 종료합니다.");break;//종료
			case 1:// 입금
				System.out.println("\n-----------------------------------");
				System.out.print("입금하실 금액을 입력하세요 :");
				String strdepsitIn = br.readLine();
				long  depsitLong =Long.parseLong(strdepsitIn);
				na.deposit(depsitLong);//  잔고에다가 넣어줌?
				break;
			case 2:// 출금
				System.out.println("\n-----------------------------------");
				System.out.print("출금하실 금액을 입력하세요 :");
				String strwithdraIn = br.readLine();
				long  withdrawLong =Long.parseLong(strwithdraIn);
				na.withdraw(withdrawLong);//  잔고에다가 넣어줌?
				break;
			case 3:// 잔고확인
				System.out.println(na.getName()+"님의 잔고는"+na.getBalance()+"원입니다");
				break;
			default:System.out.println("0-3번사이번호를 누르세요\n");break;
			// 디폴트의 브레이크문은 생략가능
			}
	
		} while (!strWork.equals("0"));
		
	}

}
