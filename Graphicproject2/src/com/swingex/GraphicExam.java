package com.swingex;
import java.awt.*;
import javax.swing.*;
public class GraphicExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("성적그래프 프로그램");
		
		// 먼저 사이즈를 잡는다.
		frame.setPreferredSize(new Dimension(400,350)); //프레임의 크기
		frame.setLocation(500, 200);// 프레임의 위치 x,y축의 좌표 확인
		
		Container contentPane = frame.getContentPane();
		
		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel,BorderLayout.CENTER);
		
		
		JPanel controlPanel = new JPanel();
		JTextField text1= new JTextField(3);
		JTextField text2= new JTextField(3);
		JTextField text3= new JTextField(3);
		
		JButton button = new JButton("그래프 그리기");
		controlPanel.add(new JLabel("국어"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("영어"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("수학"));
		controlPanel.add(text3);
		controlPanel.add(button);
		contentPane.add(controlPanel,BorderLayout.SOUTH);
		
		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));
		
		
		// 기본템
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}

}
