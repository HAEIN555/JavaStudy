package study;
/* java.util ��Ű���� ���� 
 * 2022/06/13 �̶�� ���ڿ��� delim(�����ڸ� /��)���� 2022,06,13���� �и��Ҷ� ����Ѵ�! 
 * ������ ���ڿ��� ��ū�̶� �Ѵ�!  
 * 
 */

import java.util.StringTokenizer; // ctrl shift o

public class StringTokenizerEX01 {
	
	StringTokenizer st;
	
	public StringTokenizerEX01(String str) { // ������ ���� ����
		// �����ڸ� �������� �ʾƵ� ������ ���� ���� 
		st = new StringTokenizer(str); // ��ü ����  
	}
	public StringTokenizerEX01(String str,String delim) { // ���������� 
		System.out.println("str : "+str);
		st = new StringTokenizer(str,delim);
	}
	public void print() {
		System.out.println("Token count :"+st.countTokens());
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); 
			System.out.println(token);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���� �״븦 �������� �����ϰų� �뿩����������";
		StringTokenizerEX01 st1 = new StringTokenizerEX01(str);
		st1.print();
		StringTokenizerEX01 st2 = new StringTokenizerEX01("2022/06/13","/");
		st2.print();
		StringTokenizerEX01 st3 = new StringTokenizerEX01("happydog");
		st3.print();
		
		
	}

}
