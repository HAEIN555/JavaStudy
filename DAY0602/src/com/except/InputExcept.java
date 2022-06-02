package com.except;
import java.util.*;
import java.util.InputMismatchException;
public class InputExcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세개의 정수를 입력받아서 합계를 구하는거
		int sum =0, n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		for(int i =0;i<3;i++) {
			System.out.print((i+1)+"번째 정수입력:" );
			 try {
			n=sc.nextInt();
			 }catch (InputMismatchException e) {
				System.out.println("문자를 입력하셨습니다.정수를 입력하세요."); 
				// next () 한 토큰을 뺀다 
				// 현재 입력스트립에 남아있는 토근을 지운다.==들어온 문자를 지운다.
				sc.nextLine();
				i--; //for문의 인덱스가 증가하지 않도록 미리 감소시킨다.
				continue;
			}
			sum+=n;
		}
		System.out.println("정수 3개의 합계"+sum);
	}
}
