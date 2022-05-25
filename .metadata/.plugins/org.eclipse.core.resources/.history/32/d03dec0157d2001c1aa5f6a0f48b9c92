package study;
import java.io.*;
public class D001 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		/*팩토리얼을 이용해서 프로그램을 구해보장
		 * 숫자를 입력받아서 팩토리얼 프로그램을 만들어주자
		 * 누적의 합계가 0으로 초기화 하면 안된다ㅏ...?
		 * 1부터 팩토리얼까지의 값을..?
		 * 
		 * - 재설명 사용자로부터 n이라고 하는 수를 입력받아 n!을 계산해서 출력하세요
		 *  n!=1*2*3*4*5*n
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자를 입력하세요");
		int n=Integer.parseInt(br.readLine());
		int sum=1;
		int i;
		for(i=1; i<=n ;i++)
		{
			sum=sum*i;
		}
		System.out.println(n+"의 팩토리얼의 값은"+sum+"입니다");
	}
// 팩토리얼은 4!=4*3*2*1이라고 생각하지만 1*2*3*4가 될 수 있으니까 생각을 달리하는 습관기르자!
}
