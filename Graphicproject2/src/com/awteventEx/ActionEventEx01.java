package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
import com.awtex.*;
public class ActionEventEx01 extends Frame implements ActionListener {
	
	private TextField tf = new TextField(10);
	
	public ActionEventEx01() {
		// TODO Auto-generated constructor stub
		super("ActionEvent Test");
		setLayout(new FlowLayout());
		add(tf);
		tf.addActionListener(this);
		
		Winevent we = new Winevent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventEx01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf) {
			String imsi = tf.getText();
			System.out.println("¸Þ¼¼Áö : "+imsi);
			tf.setText("");
		}
	}
}
