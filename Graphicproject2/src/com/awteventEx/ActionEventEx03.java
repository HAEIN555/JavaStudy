package com.awteventEx;

import java.awt.*;
import java.awt.event.*;
import com.awtex.Winevent;
public class ActionEventEx03 extends Frame implements ActionListener  {
	
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("File");
	private MenuItem now = new MenuItem("Now");
	private MenuItem exit = new MenuItem("Now");
	
	public ActionEventEx03() {
		// TODO Auto-generated constructor stub
		super("ActionEvent3");
		setMenuBar(mb);
		mb.add(file);
		file.add(now);
		file.addSeparator();
		file.add(exit);
		
		
		Winevent we = new Winevent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventEx03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
