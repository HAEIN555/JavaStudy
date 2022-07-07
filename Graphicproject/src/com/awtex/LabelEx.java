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
		
		super("Label 테스트");
		la1= new Label("안녕하세요");
		la2= new Label("신화산입니다.",Label.CENTER);
		la3= new Label("강아지 입니다.",Label.RIGHT);
		la4= new Label("반갑습니다.");
		
		f1 = new Font("굴림체",Font.BOLD,20);
		f2 = new Font("바탕체",Font.ITALIC,25);
		//레이아웃 설정
		setLayout(new GridLayout(4,1));
		// 폰트 지정
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
