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
		//���콺�� �������� �ϴ°�
		if(e.getSource()==this) {
			System.out.println("x�� ��ǥ����"+e.getX()+",Y�� ��ǥ����="+e.getY());
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
