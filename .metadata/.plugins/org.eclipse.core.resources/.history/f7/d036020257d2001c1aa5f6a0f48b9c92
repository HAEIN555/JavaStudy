package review;
import java.io.*;
public class D002 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*임의의 5과목의 점수와 총계와 평균을 구해서 학점을 구하는 프로그램을 만드세요
		 */
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("점수를 입력하세요");	
	int kor = Integer.parseInt(br.readLine());	
	System.out.println("점수를 입력하세요");	
	int mat = Integer.parseInt(br.readLine());		
	System.out.println("점수를 입력하세요");	
	int eng = Integer.parseInt(br.readLine());		
	System.out.println("점수를 입력하세요");	
	int his = Integer.parseInt(br.readLine());	
	System.out.println("점수를 입력하세요");	
	int sci = Integer.parseInt(br.readLine());	
	
	int total = kor+mat+eng+his+sci;
	System.out.println("총합은"+total+"입니다");
	int avg = total/5;
	System.out.println("평균은"+avg+"입니다");
	char i = 0;
	switch ((int)avg/10) {
	case 9:
		i='A';
		break;
	case 8:
		i='B';
		break;
	case 7:
		i='C';
		break;
	case 6:
		i='D';
		break;
		
	default:System.out.println("값이 잘못되었거나 학점은 F입니다");
		break;
	
	}
	System.out.println("학점은"+i+"입니다");
	}
}
