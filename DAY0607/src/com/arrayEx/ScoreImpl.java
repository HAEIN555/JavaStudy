package com.arrayEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class ScoreImpl implements Score {
	private Scanner sc = new Scanner(System.in);
	private List<ScoreVO>list = new ArrayList<ScoreVO>();
	// 인터페이스 상속 받아서 구현체를 만들어주어야 하니까!
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("\n자료 등록....");
		String hak;
		System.out.println("학번 입력 :");
		hak = sc.next();
		ScoreVO temp = readScore(hak);
		if(temp!=null) {
			System.out.println("이미 등록된 학번입니다");
			return ;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름입력 :");
		vo.setName(sc.next());
		System.out.print("생년월일입력(19990101)형태로:");
		vo.setBirth(sc.next());
		
		System.out.print("국어점수 :");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수 :");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수 :");
		vo.setMath(sc.nextInt());
		list.add(vo);
		System.out.println("자료등록 완료~!");
		
		
	}
	public ScoreVO readScore(String hak) {
		ScoreVO  vo = null;
		for(ScoreVO temp :list) {
			if(temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\n 자료 수정.....");
		String hak;
		System.out.print("수정할 학번 입력");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo ==null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		System.out.print("이름 입력 :");
		vo.setName(sc.next());
		System.out.print("생년월일 :");
		vo.setBirth(sc.next());
		System.out.print("국어점수 :");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수 :");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수 :");
		vo.setMath(sc.nextInt());
		
		System.out.println("수정완료!");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("\n자료 삭제....");
		String hak;
		System.out.print("삭제할 학번 입력 :");
		hak = sc.next();
		ScoreVO  vo = readScore(hak);
		if(vo==null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		list.remove(vo);
		
		System.out.println("삭제 완료!");
		}
	

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n전체 출력.....");
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}System.out.println();
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		System.out.println("\n 이름 검색");
		String name;
		System.out.print("검색할 이름 입력:");
		name = sc.next();
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
	}

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub
		System.out.println("\n 학번 검색");
		String hak;
		System.out.print("검색할 학번 입력:");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo != null) {
			//System.out.println(vo);
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getBirth()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMath()+"\t");
			System.out.print(vo.getTot()+"\t");
			System.out.print(vo.getTot()/3+"\t");
		}
	}

}
