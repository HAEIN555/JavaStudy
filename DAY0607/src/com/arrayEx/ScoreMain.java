package com.arrayEx;
import java.io.IOException;
public class ScoreMain {
	public static void main(String[] args) {
		char ch;
		// 인터페이스 다형성 
		Score score = new ScoreImpl();
		try {
		while(true) {
			
			do {
				System.out.print("1번추가, 2번수정, 3번삭제,  4번전체출력, 5번학번검색,  6번이름검색, 7번종료 ");
				ch = (char)System.in.read();
				System.in.skip(2);
				
				}while (ch<'1'||ch>'7'); //do while문 끝
				
				switch (ch) {
				case '1':score.insert();break;
				case '2':score.update();break;
				case '3':score.delete();break;
				case '4':score.listAll();break;
				case '5':score.searchHak();break;
				case '6':score.searchName();break;
				case '7':System.exit(0);break;
				}
		
				} // while문 끝
		
				}catch(IOException ii) {
					ii.printStackTrace();} // try catch 문 끝
	}

}
