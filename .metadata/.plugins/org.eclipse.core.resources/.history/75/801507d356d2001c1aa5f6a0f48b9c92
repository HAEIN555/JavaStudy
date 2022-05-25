package study;
import  java. io.*;
public class S004 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//int kor =0, eng=0, mat=0, sum=0;
		int[] sub=new int [4]; //위에 변수 설정해준거랑 같다.
		//0번이 국어 1번이 영어 2번이 수학 3번이 총점
		float avg= 0.0f;
		do {
			System.out.println("국어점수 : ");
			sub[0]=Integer.parseInt(br.readLine());
		}while(sub[0]<0||sub[0]>100);
		
		do {
			System.out.println("영어점수 : ");
			sub[1]=Integer.parseInt(br.readLine());
		}while(sub[1]<0||sub[1]>100);
		
		do {
			System.out.println("수학점수 : ");
			sub[2]=Integer.parseInt(br.readLine());
		}while(sub[2]<0||sub[2]>100);
		
		sub[3]=sub[0]+sub[1]+sub[2];
		avg=sub[3]/3.f;//float으로 잡았기 때문에!
		
		System.out.println();
		System.out.println("총점 :"+sub[3]);
		System.out.println("평균 :"+avg);
	}

}
