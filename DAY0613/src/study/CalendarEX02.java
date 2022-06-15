package study;
// 년과월을 받아서 오는 달력을 만들어보자!
import java.util.Calendar;
import java.util.Scanner;
public class CalendarEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar cal =Calendar.getInstance();
		int y,m,i;
		
		System.out.print("년도 :");
		y = sc.nextInt();
		do {
			System.out.print("월:");
			m= sc.nextInt();
		} while (m<1||m>12);
		
		cal.set(y,m-1,1);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("\t"+y+"년"+m+"월");
		System.out.println("  일   월   화   수   목   금   토");
		System.out.println("=================");
		for(i=1;i<w;i++)
			System.out.print("      ");
		for(i=1;i<=cal.getActualMaximum(Calendar.DATE);i++) {
			System.out.printf("%4d",i);
			w++;
			if(w%7==1)
				System.out.println();// 줄바꿈을 위해서 
		}
		if(w%7!=1)
			System.out.println(); 
		System.out.println("=================");
	}

}
