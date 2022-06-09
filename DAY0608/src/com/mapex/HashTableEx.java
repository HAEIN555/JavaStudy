package com.mapex;
import java.util.*;
public class HashTableEx {
	//이름에 딸린 전화번호를 활용해보장 중복이 들어간..!
	private  static final String name[] = {"플라톤","소크라테스","공자","맹자","아리스토텔레스","신재우"};
	private  static final String tel[] 
			= {"111-1111","222-2222","333-3333","555-5555","666-6666","555-5555"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> ht = new Hashtable<>();
		// 해시 테이블에 키와 데이터를 입력 합니다. 
		for(int i=0;i<name.length;i++) {
			ht.put(name[i],tel[i]);
		}
		//System.out.println(ht);
		// 해시 테이블의 값을 키를 이용해서 검색
		String str = ht.get("신재우");
		if(str != null) {
			System.out.println("신재우의 전화번호"+str);
		}
		//키가 존재하는지를 검색! 
		if(ht.containsKey("심심해"))
			System.out.println("심심해 자료가 존재 합니다.");
		else System.out.println("자료가 존재 하지 않습니다.");
		// 키에 대한 존재 유무 
		
		// 데이터가 존재하는지 유무 * 값이 존재하는지 유무
		if(ht.containsValue("555-5555"))
			System.out.println("자료값이 존재합니다.");
		else System.out.println("자료값이 존재 하지 않습니다.");
		
		
		ht.remove("신재우"); // 신재우 키를 지운다.
		if(ht.containsKey("심심해"))
			System.out.println("신재우 자료가 존재 합니다.");
		else System.out.println("자료가 존재 하지 않습니다.");
		// 키에 대한 존재 유무 
	}

}
