package study;

import java.io.*;
// ���⸦ �����ô�
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
	//a�� ù��° �� b�� ������ c�� �ι�° �� d�� �����
	public static void disp(int a ,char b,int c,int d) { 
		System.out.println("\n"+a+" "+b+" "+c+"="+d);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ���� ���� 
		int su1=0;
		int su2=0;
		int tot =0;
		char yon=0;
		
		System.out.print("ù��° �� �Է��ϼ���");
		su1=Integer.parseInt(br.readLine());
		// ������ 
		do {
			System.out.print("������ �Է�yon(+, - ,*, / ,%) :");
			
			yon=(char)System.in.read();
			//System.in.read();
			//System.in.read();
			System.in.skip(2); //skip �̶�� �޼ҵ带 ����ϸ� 2���� �ǳʶݴϴ�. 
		}while(yon !='+'&&yon !='-'&&yon !='*'&&yon !='/'&&yon!='%');
		
		System.out.print("�ι�° �� �Է��ϼ���");
		su2=Integer.parseInt(br.readLine());
		
		// �����ڸ� �������� �ؼ� ó���մϴ� 
		switch (yon) {
		case '+':
			//tot =su1+su2; �޼ҵ� ���� ���Ҷ� 
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