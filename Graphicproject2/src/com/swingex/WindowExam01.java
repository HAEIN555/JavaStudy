package com.swingex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowExam01 {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing Programming");
		frame.setPreferredSize(new Dimension(200, 70));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JLabel label = new JLabel("Hello !");
		JButton button = new JButton("확인");
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);

		ActionListener listener = new ConfirmButtonActionListener(text, label);

		button.addActionListener(listener);

		// 창 뜨게 하기
		frame.setVisible(true);

		// 종료 버튼
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 창 크기
		frame.pack();

	}

}
