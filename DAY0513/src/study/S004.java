package study;
import java.io.*;
public class S004 {
	public static void main(String[] args)throws IOException{
		// 이번엔 진짜 가변배열을 이용해보자
				BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
				System.out.println("학생수를 입력하세요");
				int human =Integer.parseInt(br.readLine()); // 사람 수 구하기
				String [] name = new String[human];// 사람수의 만큼의 배열을 만들어주겠다고
				
				String [][] subject = new String[human][];
				// 과목이 몇과목인지 모르게 가변배열을 만든다...! ???????
			
				int [][] jumsu = new int [human][subject.length];
				//사람과 점수를 넣어주는 배열을 만들겠다.
				float [] avg = new float[human]; // 평균을 만들어주는 배열을 만든다.
				char[] grade = new char[human];// 성적을 만들어주는 배열을 만든다.
				int [] rank=new int [human];// 석차를 만들어주는 배열을 만든다.
				
				for (int i=0;i<human;i++) {// 사람 수 만큼 반복한다.
					System.out.print((i+1)+"번째의 학생이름 :");
					name[i]=br.readLine();
					
					System.out.print("과목 수 입력:");
					int imsi= Integer.parseInt(br.readLine());// 과목수 입력
					 subject[i]=new String[imsi];// 과목수가 과목 배열에 들어가게 
					 for(int j=0;j<subject[i].length;j++) {
						 System.out.print((j+1)+"번째 응시 과목");
						 subject[i][j]=br.readLine();
					 }
					 jumsu[i]=new int[imsi+1];
					 
					System.out.println(name[i]+"학생 점수 입력");
					
					for(int j=0;j<subject[i].length;j++) {
						System.out.print(subject[i][j]+"점수");
						jumsu[i][j]= Integer.parseInt(br.readLine());
						
					}
					
				}
	}

}
