package com.utilEx;
/* buffer - ? ���۶�?
 * - ���۴� �����͸� �� ������ �ٸ� �� ������ �����ϴ� ���� �Ͻ������� �� �����͸� �����ϴ� 
 * 		�޸��� ������ �ǹ��Ѵ�. (�ӽ� �޸� ����)
 * ���۸� - ? Buffering 
 * 		���۸��� ���۸� ä��� ������ �ǹ��Ѵ�. 
 * 
 */
import java.io.*;
public class StringBufferEX {

	public static void main(String[] args)throws IOException{
		/*
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("�����Է�");
		String str = br.readLine();
		// ���͸� ġ�� ���� ���۰� �������. ���͸� ġ�� ������ ���ۿ� ����Ǿ��ִ� 
		*/
		StringBuffer sb = new StringBuffer("JAVA");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("1.8"); //�߰� 
		System.out.println(sb);
		sb.delete(3,5);
		System.out.println(sb);
		sb.insert(3,"A1");
		System.out.println(sb);
		sb.replace(4,7,"������");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
