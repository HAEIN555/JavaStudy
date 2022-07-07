package com.boardex;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		boolean isStop = false ;
		
			do {
				System.out.println("메뉴를 선택하세요.");
				System.out.println("1. 게시판 글쓰기");
				System.out.println("2. 게시판 글목록 보기");
				System.out.println("3. 게시판 글삭제");
				System.out.println("4. 게시판 종료");
				
				
				String menu = sc.next();
				switch(menu) {
				case "1" :
				boardSVC.writeArticle(sc);
				break;
				
				case "2" :
				boardSVC.listArticle(sc);
				break;
				
				case "3" :
				boardSVC.removeArticle(sc);
				break;
				
				case"4" :
				isStop = true ;
				}
				}while(!isStop);
				}
			}	

		

