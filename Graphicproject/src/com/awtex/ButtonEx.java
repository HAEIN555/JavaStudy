package com.awtex;
import java.awt.*;
public class ButtonEx extends Frame{
	
	private String[] str = {"7","8","9","4","5","6","1","2","3","*","0","#"};
	private Button[] bt = new Button[str.length];
	
	
	public ButtonEx() {
		// TODO Auto-generated constructor stub
		super("Button 테스트");
		setLayout(new GridLayout(4, 3,5, 5));
		for(int i = 0;i<bt.length;i++) {
			bt[i]= new Button(str[i]);
			bt[i].setFont(new Font("굴림체",Font.BOLD,30));
			add(bt[i]);
		}
		
		
		
		Winevent we = new Winevent();
	      addWindowListener(we);
	     // setLocation(300,300);
	     // setBounds(300,300,300,200);
	    setSize(300, 200);
	     
	      setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new ButtonEx();
	}

}
