package com.swingex;
import java.awt.*;
import javax.swing.*;
public class WindowExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("참가자 명단 프로그램");
		
		// 먼저 사이즈를 잡는다.
		frame.setPreferredSize(new Dimension(300,150)); //프레임의 크기
		frame.setLocation(500, 400);// 프레임의 위치 x,y축의 좌표 확인
		
		Container contentPane = frame.getContentPane();
		// 구성
		//컬럼
		String colNames[] = {"이름","나이","성별"};
		Object data[][] = {
				{"신화산",10,"남자"},
				{"신화사",11,"여자"},
				{"신사",15,"남자"}
		};
		
		JTable table = new JTable(data,colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane,BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contentPane.add(button, BorderLayout.SOUTH);
		
		
		button.addActionListener(new PrintActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();// 최소로 화면을 띄우려고????????????
		frame.setVisible(true);
	}

}
