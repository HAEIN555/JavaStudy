package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WindowExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("참가자 명단 프로그램");
		
		// 먼저 사이즈를 잡는다.
		frame.setPreferredSize(new Dimension(400,200)); //프레임의 크기
		frame.setLocation(500, 400);// 프레임의 위치 x,y축의 좌표 확인
		
		Container contentPane = frame.getContentPane();
		// 구성
		//컬럼
		String colNames[] = {"이름","나이","성별"};
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(6);// 이름 넣는 텍스트 필드
		JTextField text2 = new JTextField(3);// 나이넣는데 필요한 필드
		JTextField text3 = new JTextField(2);// 성별 위해서 텍스트 필드
		
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(text3);
		
		panel.add(button1);
		panel.add(button2);
		
		contentPane.add(panel,BorderLayout.SOUTH);
		// 추가
		button1.addActionListener(new AddActionListener(table, text1, text2, text3));
		// 삭제 
		button2.addActionListener(new RemoveActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
