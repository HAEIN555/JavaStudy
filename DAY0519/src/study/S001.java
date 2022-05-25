package study;
import java.util.*;
import java.io.*;
public class S001 {

	public static void main(String[] args)throws IOException{
		/*문]
				주민 번호를 입력받아 올바른 주민등록인지를 검증하는 프로그램 작성

				123456 - abcdefg

				12 - 년도
				34 -  월
				56 - 일

				a 일 경우

				9, 0일 경우 1800년대
				1, 2일 경우 1900년대
				3, 4일 경우 2000년대

				9 1 3 일 경우 남성
				0, 2, 4일 경우 여성

				b 일 경우
				주민 번호를 등록한 지역
				0 - 서울
				1 - 경기, 인천
				2 - 부산
				3 - 강원
				4 - 충청도
				5 - 전라도
				6 - 대구, 광주
				7 - 경북, 경남
				8 - 경남
				9 - 제주도

				 c 와 d 일 경우
				 시도 의 구
				 
				 e 와 f일 경우
				 해당 구의 동 읍 면을 표시함
				 
				 g일 경우 
				  주민번호가 올바른지를 판별하는 숫자임
				 
				g을 판별 공식

				int hap = 0
				hap += 주민번호 첫번째 자리(1)*2
				hap += 주민번호 두번째 자리(2)*3
				hap += 주민번호 세번째 자리(3)*4
				hap += 주민번호 네번째 자리(4)*5
				hap += 주민번호 다섯번째 자리(5)*6
				hap += 주민번호 여섯번째 자리(6)*7
				7번째 자리는 '-'표시 이므로 계산 되지 않음
				hap += 주민번호 여덟번째 자리(a)*8
				hap += 주민번호 아홉번째 자리(b)*9
				hap += 주민번호 열번째 자리(c)*2
				hap += 주민번호 열한번째 자리(d)*3
				hap += 주민번호 열두번째 자리(e)*4
				hap += 주민번호 열세번째 자리(f)*5

				 float temp = (int)(hap/11.0f)*11.0f+11.0f-hap
				 float temp1 = temp -(int)(temp/10.0f) * 10.0fl

				이렇게 계산된 temp1이 마지막 자리수 g와 같으면  이 주민등록 번호는 검증 숫자가
				올바른 것이됨 그렇치 않으면 올바르지 않음
				*/
			BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
			// 객체 활용
			String name =""; //String 의 초기화 
			int [] jumin = new int[14]; //14칸의 주민 배열 생성
			boolean right =false; // 맞는지 아닌지 판별한다. 주민번호가 맞는지 틀린지 판단
			System.out.print("이름 입력 :");
			name = br.readLine();// 문자열을 입력받는다. 이름을 입력받는다. 
			do {
				right = false;
				System.out.print("주민 번호 입력(EX:111111-1111111)");
				for(int i=0;i<jumin.length;i++) {
					jumin[i]=System.in.read()-48; //아스키 코드 0을 빼준다. 	
				}
				//System.in.read();
				//System.in.read();
				System.in.skip(2); //두줄을 띄어준다.
				
				if(jumin[2]*10+jumin[3]>12) {
					// 월의 첫자리와 두번째 자리가 12보다 크다면 안되니까 저렇게 써줌
					// jumin[2]자리는 10의 자리라서 10을 곱해주고 jumin[3]자리는 1의 자리라서 더해줌
					System.out.println("태어난 달은 12월보다 클 수 없습니다.");
					continue;
				}else if(jumin[4]*10+jumin[5]>31) {
					// jumin[4],jumin[5]은 일을 나타낸다.
					System.out.println("태어난 일은 31일보다 클 수 없습니다.");
					continue;
				}else if(jumin[7] !=9&&jumin[7] !=0&&jumin[7] !=1
						&&jumin[7] !=2&&jumin[7] !=3&&jumin[7] !=4) {
					System.out.println("성별을 판정하는 숫자는");
					System.out.println("9,0,1,2,3,4 중 하나여야 합니다.");
					continue;
				}
				int hap = 0, cre =2; // cre은 만들때 활용 ?
				//10이 넘어가면 자릿수가 넘어간다. 0-9까지면 한자리이고 
				// 곱해지는 숫자를 넣어서 활용하려고 
				float temp =0.0f, temp1= 0.0f;
				
				for(int i=0;i<jumin.length-1;i++) {
				if(i==6) {
					continue;
				}	
				hap += jumin[i]*cre;
				cre++;
				
				if(cre==10) {
					cre=2;
				}
					
				}
				 temp = (int)(hap/11.0f)*11.0f+11.0f-hap;
				 temp1 = temp -(int)(temp/10.0f) * 10.0f;
				//temp 1이 마지막 자리?
				 if(temp1 !=jumin[13]) {
					 System.out.println("주민번호 검증 수치가 올바르지 않습니다.");
					 continue;
				 }
				right=true;
			} while (!right);
			
			System.out.println();
			System.out.print("이름: "+name);
			System.out.print("주민번호 : ");
			for(int i =0;i<jumin.length;i++) {
				if(i==6) {
					System.out.print("-");
					continue;
				}
				System.out.print(jumin[i]);
			}
			System.out.println();
			System.out.print("생년월일");
			int year =0,month=0,day=0;
			switch (jumin[7]) {
			case 9:
			case 0:
				year =1800;
				break;
			case 1:
			case 2:
				year =1900;
				break;
			case 3:
			case 4:
				year =2000;
				break;
			}
			year += jumin[0]*10+jumin[1];
			month = jumin[2]*10+jumin[3];
			day = jumin[4]*10+jumin[5];
			System.out.println(year+"년"+month+"월"+day+"일");
			System.out.print("성별 : ");
			System.out.println(jumin[7]%2==0?"여성":"남성");
			System.out.println("태어난 시도:");
			String area ="";
			switch (jumin[8]) {// 임의로 위치를 지정
			case 0:
				area="서울";
				break;
			case 1:
				area="경기,인천";
				break;
			case 2:
				area="부산";
				break;
			case 3:
				area="강원도";
				break;
			case 4:
				area="충청도";
				break;
			case 5:
				area="전라도";
				break;
			case 6:
				area="대구,광주";
				break;
			case 7:
				area="경북,경남";
				break;
			case 8:
				area="경남";
				break;
			case 9:
				area="제주도";
				break;
			
			}
			System.out.println(area);
			System.out.print("나이 :");
			Calendar ca= Calendar.getInstance();
			int age = ca.get(Calendar.YEAR)-year+1;
			System.out.println(age+"세");
	}

}
