package com.sortex;
import java.util.*;
class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		 //������������ ����
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//instanceof  ��ü���� �ƴ��� 
			Comparable c1 = (Comparable)o1; 
			Comparable c2= (Comparable)o2;
			return c1.compareTo(o2)*-1; // ������ �ٲپ���  -�� ���ؼ� ������ �ٲپ��� 
			//return c2.compareTo(o1)*-1; // -1�� ���ؼ� �⺻ ���� ����� ������ �ٲپ��� 
		}
		return -1;
	}
}
public class ComparatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� -> �����ſ��� ū�ɷ� �ö󰣴�. 
		String[] strArr = {"cat","Dog","lion","tiger"};
		Arrays.sort(strArr);
		System.out.println("strArr"+Arrays.toString(strArr));
		// ��� - strArr[cat, dog, lion, tiger] 
		// ��ҹ��� �����ϸ� �빮�ڰ� ���� ���´�. �ƽ�Ű �ڵ� ���� ������ 
		
		// ��ҹ��� ���� ���� �����ϴ� ��  
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr"+Arrays.toString(strArr));
		//CASE_INSENSITIVE_ORDER ��ҹ��� ���� ���� 
		// ���  - strArr[cat, Dog, lion, tiger]
		
		// �������� -> ū�ſ��� �����ɷ� ��������. 
		// ��ü�� �ϳ� �����. 
		Descending d = new Descending();
		// �ƴϸ� new Descending()�� �־��ִ��� 
		Arrays.sort(strArr,d);
		System.out.println("strArr"+Arrays.toString(strArr));
		// ��� - strArr[tiger, lion, cat, Dog]

	}

}
