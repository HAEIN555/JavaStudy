package study;

public class S002 {

	public static void main(String[] args) {
		/*	 1���� �迭 Ÿ�� �ڿ� []  -> ��Ҹ� �����Ѵ�. ������ ����� �޸𸮸� �Ҵ��Ѵ�.
		 *  �����Ͱ� �������϶� ������ �������� ����ϸ� ����ϱ� �迭�� ����ؼ� �����.
		 *  �ڷ����� �����ϰ� ���� ���־���Ѵ�. 
		 * class�ȿ��� �������� ������ Ÿ���� ������ �� �ִ�. �׷��� �� Ŭ������ �迭�� ������ָ� �ȴ�!p240 ��ü����
		 * ��ü�� Ŭ�����̴�! 
		 */
		//int [] score = new int [5] ; // score ��� �̸��� ���� int �� �迭�� 5���� ������ �����!
		int[] score;
		score = new int[5];
		// �����͸� ���� �ִ´� ������ ��ҿ� �����Ѵ�. 
		int j =1;
		score [0]=10;
		score [1]=10;
		score [j+1]=10;
		score [3]=10;
		score [4]=10;
		System.out.println(score);// [I@7de26db8 ->score �迭�� �޸� �ּҰ�
		// �迭�� ��ġ���� �����ϴ� ���̴�! ���� �����ϴ� ���� �ƴ� �޸� �ּ� ���� ���־�� �����°Ŵ�! 
		// ���� int �� �迭�� 5���� ������ ��Ҵٸ� 4����Ʈ X 5���� ���� 20����Ʈ�̴�!
		
		int sum = score[0]+score[1]+score[2]+score[3]+score[4];
		System.out.print(sum);
		sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+score[i];
			// sum =sum +i; // ���� 10�� ���´�. 
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
