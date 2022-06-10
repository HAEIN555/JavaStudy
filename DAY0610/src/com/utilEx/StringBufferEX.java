package com.utilEx;
/* buffer - ? 버퍼란?
 * - 버퍼는 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 
 * 		메모리의 영역을 의미한다. (임시 메모리 공간)
 * 버퍼링 - ? Buffering 
 * 		버퍼링은 버퍼를 채우는 동작을 의미한다. 
 * 
 */
import java.io.*;
public class StringBufferEX {

	public static void main(String[] args)throws IOException{
		/*
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("문자입력");
		String str = br.readLine();
		// 엔터를 치는 순간 버퍼가 비어진다. 엔터를 치기 전까지 버퍼에 저장되어있다 
		*/
		StringBuffer sb = new StringBuffer("JAVA");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("1.8"); //추가 
		System.out.println(sb);
		sb.delete(3,5);
		System.out.println(sb);
		sb.insert(3,"A1");
		System.out.println(sb);
		sb.replace(4,7,"일점팔");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
