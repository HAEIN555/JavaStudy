package study;
import java.util.*;
public class D004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//년도와 월일을 입력받아서 윤년과 평년을 구하세요!
		/* 조건 1연도가 4로 나누어 떨어지는 해는 윤년으로 한다. 그중에서 100으로 떨어지는 해는 평년으로 함 
		 *  다만 400으로 나누어 지는 해는 다시 윤년으로 한다. 
		 *  1년의 평균날짜는 365.2425일로 정하여 씀 
		 *  실제 1년보다 0.0003일이 길다. 
		 *  첫번째는 년도를 먼저 판정 하고 두번째는 월이 끝나는 날짜로 해서 판정 
		 *  끝나는 날짜가 31일30일28일이면 평년인지 판정
		 *  그다음 평년인지 윤년이지따져서 2월의 29일이면 윤년 
		 */
		Scanner sc= new Scanner(System.in);
		int year,month,day;
		System.out.println("년도를 입력하세요!");
		year = sc.nextInt();
		System.out.println("월을 입력하세요!");
		month =sc.nextInt();
		System.out.println("일을 입력하세요!");
		day =sc.nextInt();
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:day=31;break;
		case 4:case 6: case 9: case 11:day=30;break;
		case 2:
			if((year%4==0)&&(year%100!=0)||(year%400==0))
				day=29;
			else
				day=28;
			break;
		default : day=0;break;
		}
		if(day!=0) {System.out.println(year+"년"+month+"월은"+ day+"까지입니다.");}
		else { System.out.println("입력오류");}
		
		}
	}

