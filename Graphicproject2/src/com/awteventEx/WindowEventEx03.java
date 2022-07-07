package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
public class WindowEventEx03 extends Frame {

	public WindowEventEx03() {
		// TODO Auto-generated constructor stub
		super("WinEvent3");
		addWindowListener(new WinEventEx());
		setSize(300,200);
		setVisible(true);
	}
	
	class WinEventEx extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowEventEx03();
	}

}
