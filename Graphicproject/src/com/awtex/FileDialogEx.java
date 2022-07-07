package com.awtex;
import java.awt.*;
public class FileDialogEx extends Frame {
	
	FileDialog fd = new FileDialog(this,"내꺼저장",FileDialog.SAVE);
	
	public FileDialogEx() {
		// TODO Auto-generated constructor stub
		
		
		super("FileDialog 테스트");
		
		
		Winevent we = new Winevent();
	     addWindowListener(we);
	     setLocation(300,300);
	     // setBounds(300,300,300,200);
	    // setSize(300, 200);
	   // pack();
	     setVisible(true);
	     fd.setVisible(true);
	     System.out.println(fd.getFile());
	     System.out.println(fd.getDirectory());
	     
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileDialogEx();
	}

}
