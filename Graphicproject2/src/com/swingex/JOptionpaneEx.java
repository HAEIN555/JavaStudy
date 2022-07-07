package com.swingex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionpaneEx extends JFrame implements ActionListener {

	JButton b1,b2,b3,b4;
	String [] str = {"로그인","회원가입"};
	
	public JOptionpaneEx() {
		// TODO Auto-generated constructor stub
		
		super("JOptionpane Test");
		setLayout(new FlowLayout());
		
		b1= new JButton("MessageDialog");
    	b2= new JButton("ConfirmDialog");
    	b3= new JButton("InputDialog");
    	b4= new JButton("Option Dialog");
    	
    	add(b1);add(b2);add(b3);add(b4);
		
		setLocation(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();		
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "메세지 다이얼로그 박스", "매세지", JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getSource()==b2) {
			JOptionPane.showConfirmDialog(this,"확인 다이얼로그 박스","확인",JOptionPane.YES_NO_CANCEL_OPTION);
		}else if(e.getSource()==b3) {
			JOptionPane.showInputDialog(this, "입력다이얼로그","입력",JOptionPane.YES_NO_OPTION);
		}else if(e.getSource()==b4) {
			JOptionPane.showOptionDialog(this, "옵션 다이얼로그 박스", "옵션",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null, str,str[0]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new JOptionpaneEx();	
	}

}
