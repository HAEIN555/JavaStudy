package study;
import java.util.*;
public class D005IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격 단 4학년인경우 70점 이상이어야 합격
		// 학년은 1-4학년 까지 있다. 중첩 if로 처리하기
		// 점수는 65점이며 ,학년은 4학년이면 불합격 처리 하시오
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("점수을 입력하세요");
		a= sc.nextInt();
		System.out.println("학년을 입력하세요");
		b= sc.nextInt();
		
		if (a >= 60)/*60점이상이면*/ {
			if (b != 4)/*4학년이 아니면*/ { 
				System.out.print("합격");
			}else if (b==4&& a >= 70)/*4학년이 70점이상이면 */ {
				System.out.print("합격");
			} else/*4학년이 70점미만이면 */ {
				System.out.println("불합격");
			}
		}else/*점수60점미만이면 */
			System.out.println("불합격");
		
		
	
		}	
	}		
