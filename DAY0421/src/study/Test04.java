package study;
import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*임의의 정수로 금액을 입력받아 오만원권, 만원권,천원권,오백원
		 * 백원짜리동전 오십원짜리 동전 십원짜리 동전 일원짜리 동전 각 몇개로 변환되는지
		 * 출력하는 프로그램을 구현하시오 
		 * 금액을 입력하세요 
		 * 입력금액  : 65376
		*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int a= sc.nextInt();
		int ohman,man,chun,ohbak,bak,ohship,ship,il,b;
		ohman=a/50000;
		b=a%50000;
		man=b/10000;
		b=b%10000;
		chun=b/1000;
		b=b%1000;
		ohbak=b/500;
		b=b%500;
		bak=b/100;
		b=b%100;
		ohship=b/50;
		b=b%50;
		ship=b/10;
		b=b%10;
		il=b/1;
		
		System.out.println
		(ohman+","+man+","+chun+","+ohbak+","+bak+","+ohship+","+ship+","+il);
		
		
	}	

}
