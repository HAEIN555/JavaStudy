package com.swingex;
import java.awt.*;
import javax.swing.*;
public class WindowExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("������ ��� ���α׷�");
		
		// ���� ����� ��´�.
		frame.setPreferredSize(new Dimension(300,150)); //�������� ũ��
		frame.setLocation(500, 400);// �������� ��ġ x,y���� ��ǥ Ȯ��
		
		Container contentPane = frame.getContentPane();
		// ����
		//�÷�
		String colNames[] = {"�̸�","����","����"};
		Object data[][] = {
				{"��ȭ��",10,"����"},
				{"��ȭ��",11,"����"},
				{"�Ż�",15,"����"}
		};
		
		JTable table = new JTable(data,colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane,BorderLayout.CENTER);
		JButton button = new JButton("���");
		contentPane.add(button, BorderLayout.SOUTH);
		
		
		button.addActionListener(new PrintActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();// �ּҷ� ȭ���� ������????????????
		frame.setVisible(true);
	}

}
