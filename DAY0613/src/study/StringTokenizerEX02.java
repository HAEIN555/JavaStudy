package study;
import java.util.*;
public class StringTokenizerEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="�б�,��,,���ӹ�";
		
		StringTokenizer tokens = new StringTokenizer(str,",");
		for(int x =1;tokens.hasMoreTokens();x++) {
			System.out.print("���� "+x+":"+tokens.nextToken()+"\t");
		} //���� 1:�б�	���� 2:��	���� 3:���ӹ� 
		//StringTokenizer Ŭ������ ��� ������ �����ϰ� �����Ѵ�. 
		System.out.println();
		System.out.println("========================");
		String[] values = str.split(",");      //������ �����ϴ��� 
		for(int x=0;x<values.length;x++) {
			System.out.print("���� "+(x+1)+":"+values[x]+"\t");
		}//���� 1:�б�	���� 2:��	���� 3:	���� 4:���ӹ�
	
		// StringTokenizer ������ �����Ѵ� ������ string�� ������ ���ش�. 
		//  String Ŭ������ spilt() �޼ҵ�� ���ǹ��� ���鵵 �ϳ��� �ڸ��� �����Ѵ�. 
		
	}

}
