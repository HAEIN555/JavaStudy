package com.swingex;
import javax.swing.*;
import java.awt.event.*;

public class DrawActionListener implements ActionListener {

	JTextField text1,text2,text3;
	DrawingPanel drawingPanel;
	
	public DrawActionListener(JTextField text1,JTextField text2,JTextField text3,DrawingPanel drawingPanel) {
		// TODO Auto-generated constructor stub
		this.text1=text1;
		this.text2=text2;
		this.text3=text3;
		this.drawingPanel= drawingPanel;	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			int korean = Integer.parseInt(text1.getText());
			int english = Integer.parseInt(text2.getText());
			int math = Integer.parseInt(text3.getText());
			
			drawingPanel.setScores(korean, english, math);
			drawingPanel.repaint();// 다시 칠하다
		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(drawingPanel, "잘못된 숫자 형식입니다.",
					"에러메세지",JOptionPane.ERROR_MESSAGE);
		}
	}

}
