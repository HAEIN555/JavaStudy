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
		
		// 현재 날짜에 1000일을 더하면??
		now.add(Calendar.DATE,1000);
		System.out.printf("%tF%n",now);
		
		//2023.6.15
		// 날짜를 바꾼다는 것은 set 이라는 메소드 활용 
		now.set(2023,	 6-1, 15); // 월의 6-1을 한 이유는 인덱스 값이기때문에 6번째 인 값인 5를 넣어주야한다!
		// 0부터 시작하니까!!!
		System.out.printf("%tF%n",now);
		
		// 날짜만 바꾸어 보자! 날짜만 지정해서 출력
		now.set(Calendar.DATE, 10);
		System.out.printf("%tF%n",now);
		
		//2022.06.32 -->2022.07.02로 나타난다
		now.set(2022, 6-1, 32);
		System.out.printf("%tF%n",now);
		
		//해당하는 달의 마지막을 max를 통해서 알 수 있다.
		int dd = now.getActualMaximum(Calendar.DATE);
		System.out.print("해당월의 마지막 날짜 :"+dd);
		
		}

}
