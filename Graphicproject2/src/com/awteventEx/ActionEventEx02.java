package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
import com.awtex.*;
public class ActionEventEx02 extends Frame implements ActionListener {

	private Button bt = new Button("Á¾·á");
	
	public ActionEventEx02() {
		// TODO Auto-generated constructor stub
		super("ActionEvent2");
		bt.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(bt);
		Winevent we = new Winevent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventEx02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

}
