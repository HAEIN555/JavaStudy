package review;
import java.util.*;
public class D003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*년도와 월일을 입력받아 윤년과 평년을 구별하세요!
		 * 년도가 4로 나누어지는 해를 윤년이라고 하고 그중에 100으로 떨어지는 해는 평년인데 그와중에 또 400으로 떨어지는 해는 윤년이다.
		 * 1년의 평균 기간은 365.2425일
		 */
	Scanner sc= new Scanner(System.in);	
	int year,day,month;	
	System.out.println("년도를 입력하세요");
	year = sc.nextInt();	
	System.out.println("월을 입력하세요");
	month = sc.nextInt();		
	System.out.println("일를 입력하세요");
	day = sc.nextInt();		
	switch (month) {
	case 1:case 3:case 5:case 7:case 8:case 10:case 12:day=31;
	break;
	case 4:case 6:case 9:case 11:day=30;
	break;
	case 2:
	 if((year%4==0)&&(year%100!=0)||(year%400==0))
		day=29;
	 else 
		 day=28;
		break;
	default:day=0;
		break;
	}
	if(day!=0) {System.out.println(year+"년"+month+"월"+day+"까지입니다");}	
	else System.out.println("입력오류");
	}

}
