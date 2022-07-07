package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
public class WindowEventEx04 extends Frame {
	
	public WindowEventEx04() {
		// TODO Auto-generated constructor stub
	super("WinEvent4");
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	
	setSize(300,200);
	setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowEventEx04();
	}

}
