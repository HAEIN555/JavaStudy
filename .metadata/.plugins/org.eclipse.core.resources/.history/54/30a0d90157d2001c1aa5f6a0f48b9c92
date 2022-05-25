package study;
import java.io.*;
public class D004 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
		int kor,eng,mat;
		float avg =0.0f;
		int tot=0;
		char hak = 0;
		do {
			System.out.println("국어 점수를 입력하세요");
			 kor=Integer.parseInt(br.readLine());
			}while(kor>100||kor<0);
		do {
			System.out.println("영어 점수를 입력하세요");
		 	 eng=Integer.parseInt(br.readLine());
			}while(eng>100||eng<0);
		do {
			System.out.println("수학 점수를 입력하세요");
			 mat=Integer.parseInt(br.readLine());
			}while(mat>100||mat<0);
			
		tot= kor+eng+mat;
			
		avg=tot/3.0f;
			
			switch ((int)avg/10) {
			case 10:
			case 9 :
				hak ='A';
				break;
			case 8 :
				hak ='B';
				break;
			case 7 :
				hak ='C';
				break;
			case 6 :
				hak ='D';
				break;
			default:
				hak='F';
				break;
				
			}	
			System.out.println("학점"+hak);
			System.out.println("총점수는"+tot+"입니다");
			System.out.printf("평균:%.2f\n",avg);
		
		
		
		
		
	}

}
