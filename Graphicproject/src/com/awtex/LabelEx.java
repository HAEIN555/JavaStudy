package com.awtex;
import java.awt.*;
public class LabelEx extends Frame {
	
		Label la1;
		Label la2;
		Label la3;
		Label la4;
		
		Font f1;
		Font f2;
	
	public LabelEx() {
		// TODO Auto-generated constructor stub
		
		super("Label �׽�Ʈ");
		la1= new Label("�ȳ��ϼ���");
		la2= new Label("��ȭ���Դϴ�.",Label.CENTER);
		la3= new Label("������ �Դϴ�.",Label.RIGHT);
		la4= new Label("�ݰ����ϴ�.");
		
		f1 = new Font("����ü",Font.BOLD,20);
		f2 = new Font("����ü",Font.ITALIC,25);
		//���̾ƿ� ����
		setLayout(new GridLayout(4,1));
		// ��Ʈ ����
		la1.setFont(f1);la2.setFont(f1);
		la3.setFont(f2);la4.setFont(f2);
		
		add(la1);add(la2);add(la3);add(la4);
		la1.setBackground(Color.red);
		la1.setBackground(Color.BLUE);
		la1.setBackground(Color.GREEN);
		la1.setBackground(Color.PINK);
		
		 Winevent we = new Winevent();
	      addWindowListener(we);
	      setSize(300, 200);
	      setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
		
	}

}
