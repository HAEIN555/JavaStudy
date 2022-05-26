package study;
import java.util.*;
public class SungImpl implements Sung {
// 구현체 
	int in;
	Record re[];
	Scanner sc = new Scanner(System.in); //전역으로 빼버림
	
	@Override
	public void set() { // 인원수 입력받는 기능
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("인원수 입력");
			in = sc.nextInt();
		} while (in<1||in>100);
		
		re= new Record[in];
	}

	@Override
	public void input() { // 이름하고 학번 과목별 점수 입력기능 ,판정
		String [] title = {"국어점수","수학점수","영어점수"};
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<re.length;i++) {
			
			re[i] =new Record();  // 객체 생성  생성자를 가지고 온다.
		System.out.printf("%d번째 학생의 학번과 이름을 입력하세요(공백구분)",(i+1));
			re[i].number=sc.nextInt();
			re[i].name =sc.next();
		System.out.print("국어 영어 수학점수를 입력하세요");
			re[i].scr[0]=sc.nextInt();// 국어점수 
			re[i].scr[1]=sc.nextInt();// 영어점수
			re[i].scr[2]=sc.nextInt();// 수학점수 
			// 각 과목별 판정 : 수 , 우 , 미 , 양 , 가
			for(int j =0;j<re[i].scr.length;j++) {
				
				if(re[i].scr[j]>=90)
							re[i].score[j]="수";
				else if(re[i].scr[j]>=80)
							re[i].score[j]="우";
				else if(re[i].scr[j]>=70)
							re[i].score[j]="미";
				else if(re[i].scr[j]>=60)
							re[i].score[j]="양";
				else 
							re[i].score[j]="가";
			} // end for 
			// 총점
			re[i].sum += re[i].scr[0]+ re[i].scr[1]+ re[i].scr[2];
			// 평균
			re[i].avg =re[i].sum/ 3;
		}
	}

	@Override
	public void print() { // 결과 출력 
		
		for(int i=0;i<re.length;i++) {
			System.out.printf("%5d%5s%3d%3d%3d%3d%3d\n",
					re[i].number,re[i].name,re[i].scr[0],re[i].scr[1],re[i].scr[2],
							re[i].sum,re[i].avg);
			System.out.printf("\t\t%s%s%s\n",re[i].score[0],re[i].score[1],re[i].score[2]);
		}
	}

	

}
