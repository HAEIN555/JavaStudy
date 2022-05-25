package study;
import java.util.*;
public class S001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램을 작성
		 * 만약 사용자로 부터 5를 입력받았다면 3.6.9.12.15가 나오게 만드세요!
		 */
	Scanner sc= new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	int j=sc.nextInt();//정수를 입력받는거
	int i = 1;
		while(i<=j) {
			System.out.print(i*3+"\t");
			i++;
		}System.out.println();
	}

}
