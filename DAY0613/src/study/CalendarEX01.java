package study;
import java.util.Calendar;
public class CalendarEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		//Calendar now = new Calendar();
		// 추상 클래서 여서 객체를 생성할 수 없다. 
		/* Calendar 객체를 생성할 수 있는 방법 3가지 
		 * 1. Calendar now = Calendar.getInstance();
		 * 2. Calendar now = new GregorianCalendar();
		 * 3. GregorianCalendar now = new GregorianCalendar();
		 * 
		 * GregorianCalendar : Calendar의 하위 클래스 
		 */
		String str1 = String .format("%1$tF %1$tA %1$tT", now);// 형식 지정
		System.out.println(str1); //2022-06-13 월요일 14:54:05
		
		int y = now.get(Calendar.YEAR); // now에서 year을 추출하는 것! 
		int m = now.get(Calendar.MONTH)+1 ; // now에서 month를 추출하는 것 
		int d = now.get(Calendar.DATE); //now에서 date를 추출하는 것
		int w = now.get(Calendar.DAY_OF_WEEK);
		// 1-7 : 1은 일요일 7은 토요일
		//Calendar.MONDAY; 라고 저장되어있는 것을 끌고 올 수도 있다!
		String week ="";
		switch (w) {
		case 1:week="일요일";break;
		case 2:week="월요일";break;
		case 3:week="화요일";break;
		case 4:week="수요일";break;
		case 5:week="목요일";break;
		case 6:week="금요일";break;
		case 7:week="토요일";break;
		}
		System.out.println(y+"-"+m+"-"+d+"-"+week);
	}

}
