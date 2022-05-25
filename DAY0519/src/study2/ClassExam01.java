package study2;
import java.io.*;
public class ClassExam01 {

	public static void main(String[] args)throws IOException{
		ClassExam ce = new ClassExam();
		// 값 입력
		ce.setX();
		ce.setY();
		// 결과 출력
		ce.display();
		
		//좌표이동
		ce.setX(50);
		ce.setY(80);
		// 결과 출력
		ce.display();
	}

}
