package study;
import java.util.*;
public class S005 {

	public static void main(String[] args) {
		/*사용자로 부터 임의의 정수를 개수만큼 입력받아 입력받은 수중에서
		 *가장 큰 수를 출력하는 프로그램을 작성하세요
		 * 단 배열을 이용하여 출력하세요
		 * 입력할 데이터 갯수 : 9
		 * 데이터 입력 : 4.7.9.1.3.2.5.6.8
		 * 가장 큰 수 : 9
		 */
		Scanner sc= new Scanner(System.in);		
		int n;// 데이터의 갯수을 입력받을 변수 
		System.out.print("입력할 데이터 갯수 :");
		n=sc.nextInt();
		// 입력받은 정수로 크기를 지정함
		int [] arr= new int [n];
		System.out.print("데이터 입력(공백 구분) : ");
		
		for (int i = 0; i<arr.length;i++) { // 배열에 입력 받은 데이터 저장 
			  arr [i]=sc.nextInt();
		  }
		
		int max = 0;//가장 큰수를 이용
		for (int i = 0; i<arr.length;i++) {
			//max 보다 큰 값을 골라내기
			if(arr[i]>max)
				max= arr[i];}
			
		System.out.println("가장 큰 수 :"+max);
		
		
	}

}
