package com.Ex02;
/* Sung 클래스는 
 * - 인원수를 입력받아 , 입력받은 인원수 만큼 이름,국어,영어,수학 점수를 입력받고 
 * 	- 총점과 평균, 석차를 구하는 프로그램을 작성하세요 
 *   요런걸 바로 클래스의 설계 
 *   	속성 - 인원수 Record 배열로 
 *   	기능 - 
 *   			인원수 입력하는 기능
 *   			상세 데이터 입력하는 기능
 *   			연산 처리하는  기능
 *   			결과를 출력하는 기능
 *   			  
 */
import java.util.*;
public class Sung {

	//주요변수 선언 (속성을 의미)
	int inwon; // 인원수를 의미
	Record[] rec; // Record[] 배열 선언
	
	// 기능 메소드
	//1. 인원수 입력받는다. 
	public void set() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("인원수 입력(1-100)");
			inwon=sc.nextInt();
		}while(inwon< 1|| inwon>100);
		// Record 클래스의 배열 변수를 inwon만큼 생성한 것임
		// Record 클래스의 인스턴스를 생성한 것은 아니다. 
		rec = new Record[inwon];
		
	}

	//2. 상세 데이터 입력 및 연산 처리하는 기능
	public void input() {
		String [] title = {"국어점수:" ,"영어점수: ","수학점수:"};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<inwon;i++) {
			// 인스턴스 생성 (********)
			 rec[i]=new Record();
			 
			 System.out.print((i+1)+"번째 이름입력 :");
			 rec[i].name=sc.next();// 객체배열로 잡고 객체를 끌어다가 써야한다. 
			 // next()와 nextLine()의 차이점은?
			 /* next() 토글 위주 nextLine()라인 위주 
			  *  홍길동  국어 next 라면 홍길동만 읽지만
			  *  홍길동  국어 nextLine이라면 홍길동  국어라고 읽는다. 
			  *  토글을 구분하는 메소드 ,나  공백으로 구분한다.
			  *  공백을 집어넣으면 공백의 다음걸을 구분해라 
			  */
	
			for(int j=0;j<title.length;j++) {// 과목
				// 안내 메세지 출력
				System.out.print(title[j]);
				
				// 입력받은 점수를 score에 저장한다. 
				rec[i].score[j]=sc.nextInt(); // 클래스 안에 배열 선언 그것을 끌어다 온다. 
				// 점수를 반복적으로 입력받아 총점을 누적시켜 총점을 구한다.
				rec[i].tot +=rec[i].score[i];
				
			}
			
			// 평균 산출 
			rec[i].avg=rec[i].tot/3.0;
			rec[i].rank=1;
			
		}
	}

	
	  public void display() {
		  ranking();
		  System.out.println("====학생 성적표 ====");
		  for(int i=0;i<inwon;i++){ //이름 출력
			  System.out.printf("%8s",rec[i].name);
			  // 국어 영어 수학점수를 반복 출력한다.
		 
			 for(int j=0;j<3;j++) {
				 System.out.printf("%5d",rec[i].score[j]);
				 //총점, 평균 출력
				 System.out.printf("%7d,%10.2f,%d",rec[i].tot,rec[i].avg,rec[i].rank);
				 System.out.println();
			 	}
			 	System.out.println("===================="); }	  
	  		}
	  	//석차계산 메소드를 추가
	  //한명 이상이기때문에 for문이 2개 필요하다
	  
	  public void ranking() {
		  //모든 학생의 등수를 1로 초기화 
		  int i,j;
		  for(i=0;i<inwon;i++)
			  rec[i].rank=1;
		  // 등수 계산
		  for(i=0;i<inwon-1;i++) {// 0,1
			  for(j=i+1;j<inwon;j++) {//1,2
				  if(rec[i].avg>rec[j].avg)
					  rec[j].rank++;
				  else if(rec[i].avg<rec[j].avg)
					  rec[i].rank++;
			  }
		  }
			/*
			 * for(int i=0;i<inwon;i++) { for(int j=0;j<inwon;j++) {
			 * if(rec[i].avg<rec[j].avg) rec[i].rank++;} }
			 */
	  }
		}
	
	
	
	
	
	




