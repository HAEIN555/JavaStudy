package study;

public class S001 {

	public static void main(String[] args) {
		// 2차원 배열의 선언과 초기화 
		// 방법 1 
		int [][] arr1 = new int [3][3];
		// 자바는 기본관리가 1차원이라서 [3][]이라고만 넣어주어도 오류가 나지 않는다.
		// 행과 열이 만나는 2차원 배열
		// 행의 값에 값을 집어 넣어주는 방법
		arr1[0][0]=1;
		arr1[0][1]=1;
		arr1[0][2]=1;
		// 방법2
		int [][] arr2={ {1,2,3},{4,5,6},{7,8,9}};
		
		//출력
		//열이 들어갈때 행을 가져가야 한다.
		// 행을 가지고 가야 하기때문에 j<arr2[i]을써준다.
		for (int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.printf("%2d",arr2[i][j]);
			}
			System.out.println();
		}
		
		//방법 3
		int[][] arr3 =new int[3][3];
		int n=1;//n값은 입력하는 값이어서 n에 1을 넣어준것이다!
		for (int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]=n;
				n++;
				System.out.printf("%2d",arr3[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
