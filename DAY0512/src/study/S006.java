package study;
import java.io.*;
public class S006 {
// 두반의 3명씩 6명의 3과목의 점수를 받아서 총합 평균 반석차 전체 석차를 구해라!
	public static void main(String[] args)throws IOException {
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String [] subname = {"국어","영어","수학"};
		int [][][] sub= new int[2][3][subname.length+3];// 총점이 들어갈자리를 잡아주기 위해서 4칸을 만듬
		//0 - 1번째 사람 1 - 2번째 사람 2 - 3번째 사람 3총점 4석차 5전교석차
		float [][] avg = new float[2][3];
		
		for(int h=0;h<sub.length;h++) {
		for(int i=0;i<sub[h].length;i++) {//사람
			for(int j=0;j<sub[h][i].length-3;j++) {
				do {
					System.out.print(subname[j]+"점수 :");
					sub[h][i][j]=Integer.parseInt(br.readLine());
				}
				while(sub[h][i][j]<0||sub[h][i][j]>100);
				// 누적
				sub[h][i][sub[h][i].length-3]+=sub[h][i][j];
				//sub[h][i][sub[h][i].length-3]=sub[h][i][sub[i].length-3]+sub[h][i][j]
			}
			avg[h][i]=sub[h][i][sub[h][i].length-3]/(float)(sub[h][i].length-3);
			sub[h][i][sub[h][i].length-2]=1;
			sub[h][i][sub[h][i].length-1]=1;
		}
		}
		//반석차
		for(int h=0;h<sub.length;h++) {
		for(int i= 0;i<sub[h].length;i++) {
			for(int j=0;j<sub[h].length;j++) {
				if(sub[h][i][sub[h][i].length-3]<sub[h][j][sub[h][j].length-3]) {
					sub[h][i][sub[h][i].length-2]++;
				}
			}
		}
	}
		// 전교석차
		for(int h=0;h<sub.length;h++) {
			for(int i= 0;i<sub[h].length;i++) {
				for(int k=0;k<sub.length;k++) {
					for(int j=0;j<sub[h].length;j++) {
						if(sub[h][i][sub[h][i].length-3]<sub[k][j][sub[k][j].length-3]) {
							sub[h][i][sub[h][i].length-1]++;
						}
					}
				}
			}
		}
		
		
		
		//System.out.println(avg);
		// 출력 
		for(int h=0;h<sub.length;h++) {
			for(int i=0;i<sub[h].length;i++) {//사람
			System.out.println();
			System.out.println("총점"+sub[h][i][sub[h][i].length-3]);	
			System.out.println("평균"+avg[h][i]);
			System.out.println("반 석차"+sub[h][i][sub[h][i].length-2]+"등");
			System.out.println("전교석차"+sub[h][i][sub[h][i].length-1]+"등");
			}
		}
	}
}
