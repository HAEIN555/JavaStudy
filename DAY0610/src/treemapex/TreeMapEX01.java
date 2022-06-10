package treemapex;

import java.util.*;
import java.io.*;

public class TreeMapEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> map = new TreeMap<>();
		map.put("만화","마녀배달부 키키");
		map.put("호러","스크림");
		map.put("영화", "황혼에서 새벽까지");
		map.put("방화", "쉬리");
		map.put("TV", "X-files");
		System.out.println(map);
		
		Map<String, String> subMap = map.subMap("방화", "호러"); // 범위를 지정할 수 있다. 
		System.out.println(subMap);
		//{TV=X-files, 만화=마녀배달부 키키, 방화=쉬리, 영화=황혼에서 새벽까지, 호러=스크림}
		//{방화=쉬리, 영화=황혼에서 새벽까지} 
		
		/* Tree Map 클래스는 소트 (정렬) 된 상태로 자료가 추가된다.
		 * Tree map 클래스의 SotredMap<k,v>sub Map (k from key,k to key)메소드 
		 * from key key를 포함한다. to key key를 포함하지 않는다. 
		 * 키 범위를 부분적으로 추출하며 리턴함 
		 */
	}

}
