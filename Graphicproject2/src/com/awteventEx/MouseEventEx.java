package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import com.awtex.*;
public class MouseEventEx extends Frame implements MouseListener {

	private Button bt= new Button("Ȯ��");
	private Button bt1= new Button("���");
	
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
			System.out.println("Ȯ�ι�ư!");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt1) {
			System.out.println("��ҹ�ư�� ����!");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt1) {
			System.out.println("��ҹ�ư�� �����ٰ� �ôٰ�!");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub // ������ �̾߱���
		if(e.getSource()==bt||e.getSource()==bt1) {
			System.out.println("���콺�� ��ư ���� �ö� ����!");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bt||e.getSource()==bt1) {
			System.out.println("���콺�� ��ư ������ ����!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEx();
	}

}
