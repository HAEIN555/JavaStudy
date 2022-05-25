package study;
import java.util.*;
public class S004 {

	public static void main(String[] args) {
		/* 문제 ) 학생수를 입력받아서 입력받은 인원수 만큼 학생의 이름과 전화번호를 입력받고 
		 * 입력받은 내용을 전체를 출력하는 프로그램을 작성하세요
		 * 단 배열을 이용하여 작성하세요
		 * 이름과 전화번호는 공백으로 구분하세요
		 *  학생수는 3 
		 *  이름 전화번호 입력 (1) 공백구분 : 홍길동 01011111111
		 *  이름 전화번호 입력 (2) 공백구분 : 김세종 01022222222
		 *  이름 전화번호 입력 (3) 공백구분 : 이무기 01033333333
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("입력받을 학생 수를 입력하세요!");
		int num = sc.nextInt();
		String name[] =new String[num];
		String phone[] =new String[num];
		
		for(int i=0;i<name.length;i++) {
			System.out.print("이름 전화번호 입력("+(i+1)+"):[공백구분]:");
			name[i]=sc.next();
			phone[i]=sc.next();
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println("입력받은 학생수 :"+num+"명");
		System.out.println("-------------");
		System.out.println("이름            전화번호");
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+" "+phone[i]);
		}
		
		
	}

}
