package study;

import java.io.*;
public class S005 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				//int kor =0, eng=0, mat=0, sum=0;
				String[]subname = {"국어점수","영어점수","수학점수"};
				int[][] sub=new int[3] [subname.length+1]; //위에 변수 설정해준거랑 같다.
				
				//0번이 국어 1번이 영어 2번이 수학 3번이 총점
				float []avg= new float[3];
				
				for(int k=0;k<sub.length;k++) {
				for(int i=0;i<sub[k].length;i++) {
				do {
					System.out.println(subname[i]+":");
					sub[k][i]=Integer.parseInt(br.readLine());
				}while(sub[k][i]<0||sub[k][i]>100);
				// 총합
				sub[k][sub.length-1]+=sub[k][i];
				}
				avg[k]=sub[k][sub.length-1]/(float)(sub[k].length-1);
				}
				
				
				//sub[sub.length-1]=sub[0]+sub[1]+sub[2];
				
				for(int k=0;k<sub.length;k++) {
				System.out.println();
				System.out.println("총점 :"+sub[k][sub.length-1]);
				System.out.println("평균 :"+avg[k]);}
	}

}
