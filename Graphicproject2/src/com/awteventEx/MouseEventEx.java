package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import com.awtex.*;
public class MouseEventEx extends Frame implements MouseListener {

	private Button bt= new Button("확인");
	private Button bt1= new Button("취소");
	
	public MouseEventEx() {
		// TODO Auto-generated constructor stub
		
		super("Mouse Test");
		setLayout(new FlowLayout());
		
		add(bt);
		add(bt1);
		
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
		
		Winevent we = new Winevent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt) {
			System.out.println("확인버튼!");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt1) {
			System.out.println("취소버튼을 누른!");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt1) {
			System.out.println("취소버튼을 눌렀다가 뗐다가!");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub // 범위를 이야기함
		if(e.getSource()==bt||e.getSource()==bt1) {
			System.out.println("마우스가 버튼 위에 올라간 상태!");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt||e.getSource()==bt1) {
			System.out.println("마우스가 버튼 내려간 상태!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEx();
	}

}
