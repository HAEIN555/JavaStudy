package study;
import java.io.*;
public class D003 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		/*임의의 5과목을 점수를 입력받아 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는 프로그램을 만드세요!
		 * switch case 문을 사용해서 만드세요!
		 */
	BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	System.out.println("점수를 입력하세요");
	int kor = Integer.parseInt(br.readLine());
	System.out.println("점수를 입력하세요");
	int mat = Integer.parseInt(br.readLine());
	System.out.println("점수를 입력하세요");
	int eng = Integer.parseInt(br.readLine());
	System.out.println("점수를 입력하세요");
	int sci = Integer.parseInt(br.readLine());
	System.out.println("점수를 입력하세요");
	int his = Integer.parseInt(br.readLine());
	
	int total =kor+mat+eng+sci+his;
	System.out.println("총점은"+total+"입니다");
	int avg=total/5;
	System.out.print("평균은"+avg+"입니다");
	char i;
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
	default:
		i='F';
		break;
	}
	System.out.println("학점은"+i+"입니다");
	}
}
