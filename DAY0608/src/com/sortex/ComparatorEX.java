package com.sortex;
import java.util.*;
class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		 //내림차순으로 구현
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//instanceof  객체인지 아닌지 
			Comparable c1 = (Comparable)o1; 
			Comparable c2= (Comparable)o2;
			return c1.compareTo(o2)*-1; // 역으로 바꾸어줌  -를 곱해서 역으로 바꾸어줌 
			//return c2.compareTo(o1)*-1; // -1를 곱해서 기본 정렬 방식을 역으로 바꾸어줌 
		}
		return -1;
	}
}
public class ComparatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오름 정렬 -> 작은거에서 큰걸로 올라간다. 
		String[] strArr = {"cat","Dog","lion","tiger"};
		Arrays.sort(strArr);
		System.out.println("strArr"+Arrays.toString(strArr));
		// 결과 - strArr[cat, dog, lion, tiger] 
		// 대소문자 구분하면 대문자가 먼저 나온다. 아스키 코드 값이 먼저라서 
		
		// 대소문자 구분 없이 정렬하는 것  
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr"+Arrays.toString(strArr));
		//CASE_INSENSITIVE_ORDER 대소문자 구분 없이 
		// 결과  - strArr[cat, Dog, lion, tiger]
		
		// 내림정렬 -> 큰거에서 작은걸로 내려간다. 
		// 객체를 하나 만든다. 
		Descending d = new Descending();
		// 아니면 new Descending()을 넣어주던가 
		Arrays.sort(strArr,d);
		System.out.println("strArr"+Arrays.toString(strArr));
		// 결과 - strArr[tiger, lion, cat, Dog]

	}

}
