package study;

public class S004 {

	public static void main(String[] args) {
		/* [char] �ڷ��� �迭�� ���ĺ� �빮�ڸ� ä���, 
		 * ä���� �迭�� ��ü ��Ҹ� ���
		 * �� char �ڷ����� �迭�� �ʱ�ȭ�� �ݺ����� �̿��� 
		 */
	//���ĺ� �빮�ڸ� ����
		//1. 
	/*
	 * char aa[]=new char[26]; aa[0]='A'; aa[1]='B'; aa[2]='C';
	 * 
	 * aa[25]='Z';
	 */
		//2.
		char aaa[]= {'A','B','C','Z'};
		//3.
		char bb[] = new char[26];
		for(int i =0,b=65;i<bb.length;i++,b++) {
			bb[i]=(char)b;
			/*�빮�ڸ� ����ֱ� ���ؼ� b=65��� ���� �־��� ���� �ҹ��ڶ�� b=97*/
			System.out.printf("%c",bb[i]);
		}
		System.out.println();
		
		char [] alpha= new char[26];
		for(int r=0;r<alpha.length;r++) {
			alpha [r]=(char)('A'+r);
			System.out.print(alpha[r]);
		}// ���� ��ĵ� �빮�ڸ� ��½�ų �� �ִ�.
		//����� ����� ���� �Ҽ��� �ְ� �ѹ��� ���� �� �� �ִ�
	
	}

}
