package com.mapex;

/*
 * 
 * Map <key,value> : 키값은 중복을 허용하지 않음, 값은 중복을 허용함.
 * 						키값이 중복을 될 경우 값을 변경해야함.
 * 					
 * 
 */

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx01 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		
		//map에 데이터 추가 put(k,v);
		map.put("만화", "마녀 배달부 키키");
		map.put("호러","스크림");
		map.put("영화","황혼에서 새벽까지");

		System.out.println(map);
		
		String key;
		
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}
		map.put("영화", "달마야 놀자");// 키 값은 변경은 안되고 값만 새롭게 추가된다. 
		// 키 값은 중복되지 않는다. 
		System.out.println(map);

	}

}
