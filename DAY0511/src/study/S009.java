package study;

public class S009 {

	public static void main(String[] args) {
		/*�迭�� Ȱ���Ͽ� �ִ밪�� �ּҰ�
		 * 
		 */
		int [] num = {79,88,91,33,100,55,95};
				
		int max = num[0];
		// �迭�� ù��° ������ �ִ밪�� �ʱ�ȭ
		int min = num[0];
		// �迭�� ù��° ������ �ּҰ��� �ʱ�ȭ
		for(int i=1;i<num.length;i++) {
		if(num[i]>max)
			max=num[i];
		else if(num[i]<min)
			min =num[i];
		}
		System.out.println("�ִ밪"+max);
		System.out.println("�ּҰ�"+min);
	}
	

}