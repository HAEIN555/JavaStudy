package study;
import java.io.*;
public class S002 {

	public static void main(String[] args)  throws IOException{
		/* 12345
		 * 23456
		 * 34567
		 * 45678
		 * 56789
		 * 로 나오게 만드세요
		 */
		int[][] arr1 =new int[5][5];
		int n=1;//n값은 입력하는 값이어서 n에 1을 넣어준것이다!
		for (int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=n;
				n++;
				System.out.printf("%2d",arr1[i][j]);
			}
			n=i+2;
			//n-=4;
			System.out.println();
		}
		/*국어 영어 수학 의 점수를 배열로 받아서 총점과 평균을 찍어보자
		 *  한번에 국어점수를 3명을 다받는다.????????????????
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String [] subname = {"국어","영어","수학"};
		int [][] sub= new int[3][subname.length+2];// 총점이 들어갈자리를 잡아주기 위해서 4칸을 만듬
		//0 - 1번째 사람 1 - 2번째 사람 2 - 3번째 사람 4총점 5석차 
		float [] avg = new float[3];
		for(int i=0;i<sub.length;i++) {//사람
			for(int j=0;j<sub[i].length-2;j++) {
				do {
					System.out.print(subname[j]+"점수 :");
					sub[i][j]=Integer.parseInt(br.readLine());
				}
				while(sub[i][j]<0||sub[i][j]>100);
				// 누적
				sub[i][sub[i].length-2]+=sub[i][j];
				//sub[i][sub[i].length-2]=sub[i][sub[i].length-2]+sub[i][j]
			}
			avg[i]=sub[i][sub[i].length-2]/(float)(sub[i].length-2);
			sub[i][sub[i].length-1]=1;
		}
		for(int i= 0;i<sub.length;i++) {
			for(int j=0;j<sub.length;j++) {
				if(sub[i][sub[i].length-2]<sub[j][sub[j].length-2]) {
					sub[i][sub[i].length-1]++;
				}
			}
		}
		//System.out.println(avg);
		// 출력 
		for(int i=0;i<sub.length;i++) {
			System.out.println();
			System.out.println("총점"+sub[i][sub[i].length-2]);	
			System.out.println("평균"+avg[i]);
			System.out.println("석차"+sub[i][sub[i].length-1]+"등");
		}
	}

}
