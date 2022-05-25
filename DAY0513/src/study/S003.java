package study;

import java.io.*;
public class S003 {
	public static void main(String[] ar)throws IOException{
		/* 문제 )
		 * 배열을 이용해서 한명의 학생에 대한 성적처리 프로그램을 작성한다.
		 * 과목수 ,과목명
		 * 이름도 입력 받는다.
		 * 이름 , 과목명 , 총점 , 학점 
		 *   *2차원배열로 구하기*
		 */
		// run의 configuration에 저장! 배열값 국어 영어 수학 
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		//int human =Integer.parseInt(ar[0]); // 사람 수 구하기
		System.out.println("학생수를 입력하세요");
		int human =Integer.parseInt(br.readLine()); // 사람 수 구하기
		String [] name = new String[human];// 사람수의 만큼의 배열을 만들어주겠다고
		//String [] subject = new String[ar.length-1];// 과목명을 초기화 하겠다고
		String [] subject = {"국어","영어","수학"};
		// 점수와 총점 처리 배열 선언 
		//int [][] jumsu = new int [human][ar.length];
		int [][] jumsu = new int [human][subject.length];
		//사람과 점수를 넣어주는 배열을 만들겠다.
		float [] avg = new float[human]; // 평균을 만들어주는 배열을 만든다.
		char[] grade = new char[human];// 성적을 만들어주는 배열을 만든다.
		int [] rank=new int [human];// 석차를 만들어주는 배열을 만든다.
		
		/*
		 * for (int i=0;i<ar.length-1;i++) { subject [i] =ar[i+1];
		 * 
		 * System.out.println(subject[i]); }//과목명을 찍어보기 위해서 쓴 for문
		 */
		/*
		 * for (int i=0;i<subject.length;i++) { 
		 * 				
		 * System.out.println(subject[i]); }
		 */
		for (int i=0;i<human;i++) {// 사람 수 만큼 반복한다.
			System.out.print((i+1)+"번째의 학생이름 :");
			name[i]=br.readLine();
			System.out.println(name[i]+"학생 점수 입력");
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+"점수");
				jumsu[i][j]= Integer.parseInt(br.readLine());
				
			}
			
		}
		
	}
}
