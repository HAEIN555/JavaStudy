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
 // ���� �ϰ� �ִ� �� map

class MyComparator<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		ScoreVO s1 = (ScoreVO)o1;
		ScoreVO s2 = (ScoreVO)o2;
		int n = s1.getTot() -s2.getTot();
		if(n>1) {
			return 1; // ���� ����
		}else if(n<1) {
			return -1;// ���� ����
		}else {
			return 0;}// �ΰ��� ����.	
	}
}

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> map; //map �� ����Ѵ�. 
	// ������ �����´�. 
	public ScoreImpl() {
		// TODO Auto-generated constructor stub
		map = new HashMap<String, ScoreVO>();
		
	}
	@Override
	public int insert() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n�й��Է�");
		hak = br.readLine();
		if(map.containsKey(hak)) {
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0; 
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸��Է�");
		vo.setName(br.readLine());
		// String name  = br.readLine(); ������ 
		System.out.print("�������� �Է�");
		//int kor =Integer.parseInt(br.readLine());
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("�������� �Է�");
		//int eng =Integer.parseInt(br.readLine());
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("�������� �Է�");
		//int mat =Integer.parseInt(br.readLine());
		vo.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, vo); // �ʿ� �߰� �Ѵ�. 
		return 1;
	}

	@Override
	public int update() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n������ �й��Է�");
		hak = br.readLine();
		if(! map.containsKey(hak)) { // ������ �־������ν� �����ϴ� �й��� �ٲ��ش�. 
			System.out.println("�������� �ʴ� �й��Դϴ�..");
			return 0; 
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("������ �̸��Է�");
		vo.setName(br.readLine());
		// String name  = br.readLine(); ������ 
		System.out.print("�������� �Է�");
		//int kor =Integer.parseInt(br.readLine());
		vo.setKor(Integer.parseInt(br.readLine()));
		System.out.print("�������� �Է�");
		//int eng =Integer.parseInt(br.readLine());
		vo.setEng(Integer.parseInt(br.readLine()));
		System.out.print("�������� �Է�");
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
		System.out.print("\n�˻��� �̸� �Է� :");
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
			// �й����� �˻��ϱ� 
			//System.out.println();
			/*String hak;
			System.out.print("\n �˻��� �й� :");
			hak = br.readLine();
			if( map.containsKey(hak)) { // �˻��ϰ��� �ϴ� �й��� �ʿ� �ִ��� ������!
				System.out.println(map.get(hak).toString());}
			 */
		
	}

	@Override
	public int delete() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n ������ �й�");
		hak = br.readLine();
		if(! map.containsKey(hak)) {
			System.out.println("�������� �ʴ� �ڷ� �Դϴ�");
			return 0;
		}
		map.remove(hak);
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		return 1;
	}

	@Override
	public void writeAll() {
		// TODO Auto-generated method stub
		Set<String> set = map.keySet();
		//Ű�� ��Ƽ� ����
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
		// ������ ����ؼ�! Comparator 
		// �ΰ��� ���� ������ 0 ������ ������ -1 0���� ũ�� +1 
		// ��ü �ΰ��� ���ؼ� ������ 0 ������ -1 ũ�� +1 
		//1�� ������ ������ ����  
		List<ScoreVO>lists = new ArrayList<>();
		Set<String> set = map.keySet(); // Ű ���� �����´�. 
		Iterator<String> it1= set.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			lists.add(map.get(key));	
		}
		// �������� ����
		Collections.sort(lists,new MyComparator<ScoreVO>());
		
		// �������� ����
		//Collections.sort(lists,Collections.reverseOrder(new MyComparator<ScoreVO>()));
		System.out.println("\n[���������� ����]");
		Iterator<ScoreVO> it2 = lists.iterator();
		while(it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}
	}
}
