package study;

public class S002 {

	public static void main(String[] args) {
		/*	 1차원 배열 타입 뒤에 []  -> 요소를 생성한다. 공간을 만든다 메모리를 할당한다.
		 *  데이터가 여러개일때 변수를 여러가지 사용하면 힘드니까 배열을 사용해서 만든다.
		 *  자료형을 동일하게 만들어서 해주어야한다. 
		 * class안에는 여러가지 데이터 타입의 변수가 들어가 있다. 그래서 이 클래스를 배열로 만들어주면 된다!p240 객체지향
		 * 객체는 클래스이다! 
		 */
		//int [] score = new int [5] ; // score 라는 이름을 가진 int 형 배열에 5개의 공간을 만든다!
		int[] score;
		score = new int[5];
		// 데이터를 집어 넣는다 데이터 요소에 접근한다. 
		int j =1;
		score [0]=10;
		score [1]=10;
		score [j+1]=10;
		score [3]=10;
		score [4]=10;
		System.out.println(score);// [I@7de26db8 ->score 배열의 메모리 주소값
		// 배열은 위치값을 저장하는 것이다! 값을 저장하는 것이 아닌 메모리 주소 값을 써주어야 나오는거다! 
		// 만약 int 형 배열로 5개의 공간을 잡았다면 4바이트 X 5개의 공간 20바이트이다!
		
		int sum = score[0]+score[1]+score[2]+score[3]+score[4];
		System.out.print(sum);
		sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+score[i];
			// sum =sum +i; // 값이 10이 나온다. 
		}
		for(int i=0;i<score.length;i++) {
			sum=sum+score[i];
		}System.out.println(score.length);
		 System.out.println(sum);
		 for(int i=0;i<5;i++) {
				System.out.printf("score[%d]:%2d\n",i,score[i]); 
			}
		 
	}

}
