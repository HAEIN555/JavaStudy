package com.awtex;
import java.awt.*;
import java.awt.event.*;
public class FrameEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프레임 객체 생성
		Frame frame = new Frame();
		Winevent we = new Winevent();
		frame.addWindowListener(we);
		frame.setSize(300,200);
		frame.setVisible(true);
		// 만약 안되면 ctrl alt delete
	}

}
