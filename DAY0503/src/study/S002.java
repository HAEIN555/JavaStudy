package study;
import java.io.*;
public class S002 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		/*while문제 
		 *  사용자가 입력하는 정수를 계속해서 더해 나아감
		 *  만약 0이 입력되면 지금까지 입력된 정수의 덧셈 결과를 출력하고 종료함
		 *  -정수가 들어가도 인정
		 */
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("정수를 입력하세요");
		int a=1,sum=0;
		/*while(true) {
			a=Integer.parseInt(br.readLine());
			if(a==0) {break;}
			sum=sum+a;
		}System.out.print(sum);
		*/
		
		
		while(a!=0) {
			System.out.println("0이면 종료됩니다");
			a=Integer.parseInt(br.readLine());
			sum=a+sum;
		}System.out.println("지금까지 합계"+sum);
	}

}
