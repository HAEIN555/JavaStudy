package study;
public class S001 {
	public static void main(String[] args) {
		// 가변 배열  - 열의 변화에 대해서 
		// 사람들마다 다르게 주었을 때 
		//int [][]score =new int [5][];
		// 행 -5 열 -
		// 앞쪽은 행을 의미하고 그다음은 열을 의미한다.
		// 1차원은 행중심 2차원은 행이 바뀔때마다 새롭게 잡아준다.
		/*score [0]= new int[2];   //99,92
		score [1]= new int[4];   // 78,48,78,98
		score [2]= new int[3];  //  95,92,30
		score [3]= new int[5]; //   37,98,23,21,19
		score [4]= new int[3];//    29,64,83*/
		/*
		 * for(int i=0;i<score.length;i++) { for(int j=0;j<score[i].length;j++) {
		 * System.out.print(score[i][j]);
		 * 
		 * }System.out.println(); }
		 */
		/*00
		   0000
		   000
		   00000
		   000
		 * 라는 값이 나온다. 
		 */
		
		int [][]score = {
				{99,92},
				{78,48,78,98},
				{95,92,30},
				{37,98,23,21,19},
				{29,64,83}
		};
		int sum =0;
		for(int i=0;i<score.length;i++) { 
			sum =0;
			for(int j=0;j<score[i].length;j++) {
			sum+=score[i][j];
			  System.out.print(score[i][j]+" ");
			  
			 }System.out.println(); 
			 System.out.printf("합계 :%d,평균:%.2f\n",sum,(double)(sum/score[i].length));
			 }
			
	}

}
