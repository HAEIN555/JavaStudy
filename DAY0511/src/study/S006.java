package study;
import java.util.*;
public class S006 {
	public static void main(String[] args) {
		/* 키보드로 돈의 액수를 입력받아서 오만원권 만원권  천원권 500원짜리 동전
		 * 100원짜리 동전 50원짜리 동전 10원짜리 동전 1원짜리 동전으로 변환하는 프로그램을 만드세요
		 *  단 배열과 반목문을 이용하세요
		 *  배열명은 : unit
		 *  금액 : 65123
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();
		
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		for(int i=0;i<unit.length;i++) {
			// 동전 갯수 계산
			int res = money/unit[i];
			// res의 몫이 있는경우는 
			if (res>0) {
				System.out.println(unit[i]+"원짜리"+res+"개");
				money =money%unit[i];// money 갱신 
			}
					
		
		}
		
		/*Scanner sc= new Scanner(System.in);
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
		
		
		 * 
		 */
	}

}
