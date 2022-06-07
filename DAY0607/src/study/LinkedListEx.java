package study;
import java.util.*;
public class LinkedListEx {

	private static final String colors[] =
		{"�Ķ�" , "���" , "��� " , "���", "����" , "��Ȳ" , "����"};
	private static final String colors2[] = 
		{"�ʷ�" , "����", "���", "����", "�����"};
	// ������
	public LinkedListEx() {
		// TODO Auto-generated constructor stub
		List<String> list1 = new LinkedList<String>(); // list �ȿ� ���� �� �ִ� �ڷ����� String �� 
		List<String> list2 = new LinkedList<String>(); //
		
		for(String color : colors)
			list1.add(color);
		
		for(String color : colors2)
			list1.add(color);
		
		list1.addAll(list2);
		
		printList(list1); // ����� ���� �޼ҵ� 
		
		removeItems(list1,4,7); // ����� �޼ҵ� 
		
		printList(list1); // �޼ҵ带 ������   ���� ������ �޼ҵ�
		//printList(list2);
		printReverseList(list1);
	}
	// �ڷ� ����ϴ� �޼ҵ� 
	public void printList(List<String>list) {
		for(String color :list) {
			System.out.printf("%s\t",color);
		}System.out.println();
	}
	// �ڷ� �����ϴ� �޼ҵ�
	private static void removeItems(List<String>list,int start,int end) {
		list.subList(start, end).clear();
	}
	// �ڷḦ �������� �������
	private static void printReverseList(List<String>list) {
		ListIterator<String> it = list.listIterator(list.size()); // Iterator �ݺ��� 
		
		while(it.hasPrevious()); //p617
			System.out.printf("%s\t",it.previous());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new LinkedListEx();
		
	}

}
