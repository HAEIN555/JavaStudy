package study2;
import java.io.*;
public class ClassExam01 {

	public static void main(String[] args)throws IOException{
		ClassExam ce = new ClassExam();
		// �� �Է�
		ce.setX();
		ce.setY();
		// ��� ���
		ce.display();
		
		//��ǥ�̵�
		ce.setX(50);
		ce.setY(80);
		// ��� ���
		ce.display();
	}

}