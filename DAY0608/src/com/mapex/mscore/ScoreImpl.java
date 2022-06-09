package com.mapex.mscore;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.text.AbstractDocument.BranchElement;
 // 지금 하고 있는 건 map

class MyComparator<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		ScoreVO s1 = (ScoreVO)o1;
		ScoreVO s2 = (ScoreVO)o2;
		int n = s1.getTot() -s2.getTot();
		if(n>1) {
			return 1; // 오름 차순
		}else if(n<1) {
			return -1;// 내림 차순
		}else {
			return 0;}// 두값이 같다.	
	}
}

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> map; //map 을 사용한다. 
	// 생성자 가져온다. 
	public ScoreImpl() {
		// TODO Auto-generated constructor stub
		map = new HashMap<String, ScoreVO>();
		
	}
	@Override
	public int insert() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n학번입력");
		hak = br.readLine();
		if(map.containsKey(hak)) {
			System.out.println("이미 존재하는 학번입니다.");
			return 0; 
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름입력");
		vo.setName(br.readLine());
		// String name  = br.readLine(); 같은거 
		System.out.print("국어점수 입력");
		//int kor =Integer.parseInt(br.readLine());
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어점수 입력");
		//int eng =Integer.parseInt(br.readLine());
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학점수 입력");
		//int mat =Integer.parseInt(br.readLine());
		vo.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, vo); // 맵에 추가 한다. 
		return 1;
	}

	@Override
	public int update() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n수정할 학번입력");
		hak = br.readLine();
		if(! map.containsKey(hak)) { // 부정을 넣어줌으로써 존재하는 학번을 바꿔준다. 
			System.out.println("존재하지 않는 학번입니다..");
			return 0; 
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("수정할 이름입력");
		vo.setName(br.readLine());
		// String name  = br.readLine(); 같은거 
		System.out.print("국어점수 입력");
		//int kor =Integer.parseInt(br.readLine());
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어점수 입력");
		//int eng =Integer.parseInt(br.readLine());
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학점수 입력");
		//int mat =Integer.parseInt(br.readLine());
		vo.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, vo);
		return 1;
	}

	@Override
	public void search() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.print("\n검색할 이름 입력 :");
		name = br.readLine();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			if(data.getName().equals(name)) {
				System.out.println(data.toString());
			}
		}
			// 학번으로 검색하기 
			//System.out.println();
			/*String hak;
			System.out.print("\n 검색할 학번 :");
			hak = br.readLine();
			if( map.containsKey(hak)) { // 검새하고자 하는 학번이 맵에 있는지 없는지!
				System.out.println(map.get(hak).toString());}
			 */
		
	}

	@Override
	public int delete() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n 삭제할 학번");
		hak = br.readLine();
		if(! map.containsKey(hak)) {
			System.out.println("존재하지 않는 자료 입니다");
			return 0;
		}
		map.remove(hak);
		System.out.println("삭제가 완료 되었습니다.");
		return 1;
	}

	@Override
	public void writeAll() {
		// TODO Auto-generated method stub
		Set<String> set = map.keySet();
		//키를 모아서 저장
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			System.out.println(data.toString());
		}
	}

	@Override
	public void writeSort() {
		// TODO Auto-generated method stub
		// 정렬을 사용해서! Comparator 
		// 두개가 서로 같으면 0 값보다 작으면 -1 0보다 크면 +1 
		// 객체 두개르 비교해서 같으면 0 작으면 -1 크면 +1 
		//1를 가지고 내림과 오름  
		List<ScoreVO>lists = new ArrayList<>();
		Set<String> set = map.keySet(); // 키 값을 가져온다. 
		Iterator<String> it1= set.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			lists.add(map.get(key));	
		}
		// 오름차순 정렬
		Collections.sort(lists,new MyComparator<ScoreVO>());
		
		// 내림차순 정렬
		//Collections.sort(lists,Collections.reverseOrder(new MyComparator<ScoreVO>()));
		System.out.println("\n[총점순으로 정렬]");
		Iterator<ScoreVO> it2 = lists.iterator();
		while(it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}
	}
}
