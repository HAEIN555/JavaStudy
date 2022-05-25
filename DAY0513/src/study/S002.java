package study;
import java.io.*;
public class S002 {

	public static void main(String[] ar)throws IOException{
		/* 문제 )
		 * 배열을 이용해서 한명의 학생에 대한 성적처리 프로그램을 작성한다.
		 * 과목수 ,과목명
		 * 이름도 입력 받는다.
		 * 이름 , 과목명 , 총점 , 학점 
		 *   
		 */
		// run의 configuration에 저장! 배열값 국어 영어 수학 
		/*
		 * for(int i=0;i<ar.length;i++) { System.out.println(ar[i]);}
		 */
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		/*
		 * if(ar.length==0) { System.out.println("과목수가 없습니다."); System.exit(0);}
		 * 
		 */
		// ar.length :  과목수 
		//for(int i=0;i<ar.length;i++) { System.out.println(ar[i]);}
		 // 이름 입력받음
		System.out.println("이름입력");
		String name = br.readLine();
		//String subject []= new String[ar.length];
		String subject []={"국어","영어","수학"};
		// 만약 Run의 configuration에 값을 저장하지 않았다면 새로 배열을 만들어주면 된다!
		// 그때는 for문 안에 subject[i]=ar[i]; 값은 없어도 된다!
		/*
		 * for (int i =0;i<ar.length;i++) { subject[i]=ar[i];
		 * System.out.print(subject[i]+" "); }
		 * 안에 있는 과목이 무엇인지 알기 위해서 표시해준거
		 */
		int jumsu[] =new int [subject.length+1];// 총점을 저장하기 위한 공간
		for(int i=0;i<subject.length;i++) {
			System.out.println(subject[i]+"점수");
			jumsu[i]=Integer.parseInt(br.readLine());//점수를 입력받은 것 
			//누적함
			jumsu[subject.length-1]+=jumsu[i];
			//System.out.println("총점 :"+jumsu[subject.length-1]); 누적합계
		}
		float avg=jumsu[subject.length-1]/(float)(subject.length);
		// 소수점 3자리에서 반올림 반영
		avg = (int)((avg+0.005)*100)/100.f;
		// 0.005를 한 이유는 세번째 자리에서 반올림 해주기 위해서 0.005세번째 자리에 5를 넣어줌
		// int가 필요한 곳을 찾아라!
		char grade =0;
		switch ((int)(avg/10)) {
		case 10: 
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7:grade='C'; break;
		case 6:grade='D'; break;
		default : grade ='F';break;
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("-----------------------"+name+"의 성 적 표 ---------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("총점 :"+jumsu[subject.length-1]);
		
	}

}
