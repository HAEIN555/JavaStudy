package com.mapex;
import java.util.*;
public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		//new 뒤에 <String,Integer>은 생략 가능하다 
		map.put("홍길동",90);
		map.put("이순신", 100);
		map.put("이기자",60);
		map.put("빅자바",50);
		// key 값만 따로 뽑으면 String 값이 나온다. 
		Set<Map.Entry<String, Integer>>set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		//map .entry는 인터페이스이다.
		/* 키와 값을 set형태로 저장(HashMap을 이용해서 key 와values을 묶어주기 위해서 entry을 이용한다.)
		 *  맴의 엔트리 키의 값의 한쌍 (페어)이다.
		 *  Map.Entry 에는 entrySet() 메소드가 있는데 
		 *  entrySet() 메소드는 현재(이클래스)클래스에 속하는 요소를 가지는 맵의 컬렉션뷰를 돌려준다. 
		 *  맵의 앤트리 참조를 취득하는 유일한 방법은 반복자를 이용해서 취득한다. *반복자는 Iterator  
		 */
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e= it1.next();
			System.out.println("이름"+e.getKey()+"점수"+e.getValue());
		}
		Set set2 = map.keySet();
		System.out.println("이름"+set2);
		Collection<Integer> v = map.values();
		Iterator<Integer> it2  = v.iterator();
		int sum = 0;
		while(it2.hasNext()) {
			Integer i =it2.next();
		// 위에 Integer가 있어서 int형으로 해도무방
			sum += i;
			System.out.print(i+" ");
			
		}System.out.println();
		System.out.println("총점 :"+sum);
		System.out.println("평균 :"+sum/set2.size()); // 평균
		System.out.println("최댓값 :"+Collections.max(v)); // 최댓값
		System.out.println("최솟값 :"+Collections.min(v)); // 최솟값
	}

}
