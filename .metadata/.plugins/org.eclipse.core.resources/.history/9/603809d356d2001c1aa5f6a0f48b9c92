package study;

import java.io.*;

public class S003 {

	public static void main(String[] args)throws IOException{
		for (int i=0;i<args.length;i++) {
			System.out.println(i+"번째 과목점수"+args[i]);
		}
		/*0번째 과목점수국어
		   1번째 과목점수영어
		   2번째 과목점수수학
		 *  라고 나온다!
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int kor =0, eng=0, mat=0, sum=0;
		float avg= 0.0f;
		do {
			System.out.println("국어점수 : ");
			kor=Integer.parseInt(br.readLine());
		}while(kor<0||kor>100);
		
		do {
			System.out.println("국어점수 : ");
			eng=Integer.parseInt(br.readLine());
		}while(eng<0||eng>100);
		
		do {
			System.out.println("국어점수 : ");
			mat=Integer.parseInt(br.readLine());
		}while(mat<0||mat>100);
		
		sum= kor+eng+mat;
		avg=sum/3.f;//float으로 잡았기 때문에!
		
		System.out.println();
		System.out.println("총점 :"+sum);
		System.out.println("평균 :"+avg);
		
	}

}
