package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class WindowExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("������ ��� ���α׷�");
		
		// ���� ����� ��´�.
		frame.setPreferredSize(new Dimension(400,200)); //�������� ũ��
		frame.setLocation(500, 400);// �������� ��ġ x,y���� ��ǥ Ȯ��
		
		Container contentPane = frame.getContentPane();
		// ����
		//�÷�
		String colNames[] = {"�̸�","����","����"};
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(6);// �̸� �ִ� �ؽ�Ʈ �ʵ�
		JTextField text2 = new JTextField(3);// ���ִ̳µ� �ʿ��� �ʵ�
		JTextField text3 = new JTextField(2);// ���� ���ؼ� �ؽ�Ʈ �ʵ�
		
		JButton button1 = new JButton("�߰�");
		JButton button2 = new JButton("����");
		
		panel.add(new JLabel("�̸�"));
		panel.add(text1);
		panel.add(new JLabel("����"));
		panel.add(text2);
		panel.add(new JLabel("����"));
		panel.add(text3);
		
		panel.add(button1);
		panel.add(button2);
		
		contentPane.add(panel,BorderLayout.SOUTH);
		// �߰�
		button1.addActionListener(new AddActionListener(table, text1, text2, text3));
		// ���� 
		button2.addActionListener(new RemoveActionListener(table));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
