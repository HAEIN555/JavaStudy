package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseMotionListener;
import com.awtex.*;
public class MouseMotionEvent  extends Frame implements MouseMotionListener {
	
	public MouseMotionEvent() {
		// TODO Auto-generated constructor stub
		super("MouseMotionTest");
		
		addMouseMotionListener(this);
		
		Winevent we = new Winevent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//마우스를 움직여서 하는거
		if(e.getSource()==this) {
			System.out.println("x의 좌표값은"+e.getX()+",Y의 좌표값은="+e.getY());
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseMotionEvent();
	}

}
