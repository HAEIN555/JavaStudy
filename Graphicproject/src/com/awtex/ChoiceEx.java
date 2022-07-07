package com.awtex;
import java.awt.*;
public class ChoiceEx extends Frame {

	private Label la = new Label("생일");
	private Button bt = new Button("확인");
	private Choice co = new Choice();
	
	public ChoiceEx() {
		// TODO Auto-generated constructor stub
		
		super("Choic");
		setLayout(new GridLayout(3,1));
		add(la);
		for(int i =1;i<= 12;i++) {
			co.add(String.valueOf(i)+"월");
		}
		add(co);
		add(bt);
		
		Winevent we = new Winevent();
	      addWindowListener(we);
	     // setLocation(300,300);
	     // setBounds(300,300,300,200);
	    // setSize(300, 200);
	      pack();
	     setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceEx();
	}

}
