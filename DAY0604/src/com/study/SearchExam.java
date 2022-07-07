package com.study;

import java.util.*;
import java.io.*;

public class SearchExam {

	public static void main(String[] args) {
		
		List<String>lists = new ArrayList<String>();
		lists.add("우리나라");
		lists.add("우산");
		lists.add("우리은행");
		lists.add("대한민국");
		lists.add("대한제국");
		lists.add("대구");
		lists.add("대형마트");
		lists.add("자바");
		lists.add("자연");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str ;
		//입력받은 문자열로 시작하는 문자열 검색
		try {
			System.out.print("검색할 단어:");
			str = br.readLine();
		
			ListIterator<String>it = lists.listIterator();
			while(it.hasNext()) {
				String temp = it.next();
				
				if(temp.startsWith(str)) {
					System.out.println(temp);
				}
			}
			}catch(IOException io) {
			io.printStackTrace();
		}
	
	
	
	}

}
