package study;
import java.io.*;
class AClass{
	protected int x,y;//�Է¹޴� �μ� ����  
	protected char ch;// ������
	public AClass() {
		// TODO Auto-generated constructor stub
	}
	public void write(double result) {
		System.out.printf("%d%c%d=%.2f\n",x,ch,y,result);
	}
}
class BClass extends AClass{
	// ������ �Է±�� (�޼ҵ�)
	 boolean input()throws IOException{// �ν��Ͻ� �޼ҵ�
		 BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("������ �� ���� �Է� (���鱸��)");
		String temp = br.readLine();// "20 15"
		String [] str = temp.split("\\s");// {"20","15"}���ڿ� �ڸ� 
		
		if(str.length !=2)
			return false;
		x =Integer.parseInt(str[0]);
		y =Integer.parseInt(str[1]);
		System.out.println("������ �Է� [+-*/] :"); 
		ch =(char)System.in.read();
		if(ch =='+'||ch=='-'||ch=='*'||ch=='/')
		return true; 
		
		
		return false;
	}
	
	// ���� �� ó�����(�޼ҵ�) �������� �޾Ƽ� ����Ʈ�� ���
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