package study;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Homework1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		// 대문자를 입력받으면 소문자로 나오고 소문자를 입력받으면 대문자로 나오게 하세요!
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));	
		System.out.println("알파벳문자를 입력하세요");	
		char ch = (char)System.in.read(); 
		if(ch>='a'&&ch<='z') {
			System.out.println((char)(ch-32));
		}
		else if (ch>='A'&&ch<='Z') {
			System.out.println((char)(ch+32));
		}
		else {System.out.println("알파벳이 아닙니다.");}	
		
		
	}
}
