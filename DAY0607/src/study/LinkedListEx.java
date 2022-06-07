package study;
import java.util.*;
public class LinkedListEx {

	private static final String colors[] =
		{"파랑" , "햐얀" , "노랑 " , "녹색", "검정" , "주황" , "연두"};
	private static final String colors2[] = 
		{"초록" , "빨강", "흰색", "남색", "보라색"};
	// 생성자
	public LinkedListEx() {
		// TODO Auto-generated constructor stub
		List<String> list1 = new LinkedList<String>(); // list 안에 들어올 수 있는 자료형은 String 뿐 
		List<String> list2 = new LinkedList<String>(); //
		
		for(String color : colors)
			list1.add(color);
		
		for(String color : colors2)
			list1.add(color);
		
		list1.addAll(list2);
		
		printList(list1); // 지우기 전의 메소드 
		
		removeItems(list1,4,7); // 지우는 메소드 
		
		printList(list1); // 메소드를 만들어따   지운 다음의 메소드
		//printList(list2);
		printReverseList(list1);
	}
	// 자료 출력하는 메소드 
	public void printList(List<String>list) {
		for(String color :list) {
			System.out.printf("%s\t",color);
		}System.out.println();
	}
	// 자료 제거하는 메소드
	private static void removeItems(List<String>list,int start,int end) {
		list.subList(start, end).clear();
	}
	// 자료를 역순으로 출력하자
	private static void printReverseList(List<String>list) {
		ListIterator<String> it = list.listIterator(list.size()); // Iterator 반복자 
		
		while(it.hasPrevious()); //p617
			System.out.printf("%s\t",it.previous());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new LinkedListEx();
		
	}

}
