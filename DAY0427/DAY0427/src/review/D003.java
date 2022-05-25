package review;
import java.util.*;
public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*정수 두개를 입력받아 두수사이의 수의 합계를 구하는 프로그램을 만드세요!
	 * 작은수 부터 큰수대로 더하세요!	
	 */
	Scanner sc=new Scanner(System.in);
	int a,b,i;
	int sum=0;
	System.out.println("숫자를 입력하세요");
	a=sc.nextInt();
	System.out.println("숫자를 입력하세요");
	b=sc.nextInt();
	if(a>b) {
		a=a^b;
		b=b^a;
		a=a^b;
	}// a가b보다 클때만 사용하면 된다!
	for (i=a;i<=b;i++)
	{sum=sum+i;}
	System.out.println("총합계는"+sum+"입니다");	
	}
}
