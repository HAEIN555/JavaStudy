package study;
import java.util.*;
public class D002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch case문을 이용해서 커피 메뉴의 가격을 알려주는 프로그램을 구현하기
		// 커피 메뉴는 에스프레소, 카푸치노, 카페라떼는 3500원입니다.
		// 그리고 아메리카노는 2000원입니다. 
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("무슨 커피를 드릴까요?");
		String order = sc.next();
		 int price =0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":	
		price =3500;	
		break;
		case"아메리카노":
		price=2000;	
		break;
		default:
			System.out.println("메뉴가 없습니다.다시 주문하세요");
			break;
		}
		System.out.println(order+"는"+price+"원입니다");
		
		 }	
}
