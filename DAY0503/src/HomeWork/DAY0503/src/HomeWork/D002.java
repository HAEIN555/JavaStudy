package HomeWork.DAY0503.src.HomeWork;
import java.util.*;
public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n= sc.nextInt();
		int a,b,c;
		for(a=1;a<=9;a++) {
		  for(b=1;b<=9;b++) {
			for(c=n*(a-1)+2;c<=n*a+1;c++) {
				if(c>=10) {break;}
				System.out.printf("%dX%d=%d\t",c,b,(c*b));}
			System.out.println();
		}
	}
	}

}
