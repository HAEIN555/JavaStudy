package study;
import java.util.Calendar;
public class CalendarEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		//Calendar now = new Calendar();
		// �߻� Ŭ���� ���� ��ü�� ������ �� ����. 
		/* Calendar ��ü�� ������ �� �ִ� ��� 3���� 
		 * 1. Calendar now = Calendar.getInstance();
		 * 2. Calendar now = new GregorianCalendar();
		 * 3. GregorianCalendar now = new GregorianCalendar();
		 * 
		 * GregorianCalendar : Calendar�� ���� Ŭ���� 
		 */
		String str1 = String .format("%1$tF %1$tA %1$tT", now);// ���� ����
		System.out.println(str1); //2022-06-13 ������ 14:54:05
		
		int y = now.get(Calendar.YEAR); // now���� year�� �����ϴ� ��! 
		int m = now.get(Calendar.MONTH)+1 ; // now���� month�� �����ϴ� �� 
		int d = now.get(Calendar.DATE); //now���� date�� �����ϴ� ��
		int w = now.get(Calendar.DAY_OF_WEEK);
		// 1-7 : 1�� �Ͽ��� 7�� �����
		//Calendar.MONDAY; ��� ����Ǿ��ִ� ���� ���� �� ���� �ִ�!
		String week ="";
		switch (w) {
		case 1:week="�Ͽ���";break;
		case 2:week="������";break;
		case 3:week="ȭ����";break;
		case 4:week="������";break;
		case 5:week="�����";break;
		case 6:week="�ݿ���";break;
		case 7:week="�����";break;
		}
		System.out.println(y+"-"+m+"-"+d+"-"+week);
	}

}
