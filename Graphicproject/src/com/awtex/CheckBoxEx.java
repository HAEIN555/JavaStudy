package com.awtex;
import java.awt.*;
public class CheckBoxEx extends Frame{
	private Label lb = new Label("좋아하는 과일은?");
	private Button bt = new Button("확인");
	
	private Checkbox[] cb = {
			new Checkbox("바나나"),
			new Checkbox("딸기"),
			new Checkbox("수박"),
			new Checkbox("복숭아",true)};
	
	
	public CheckBoxEx() {
		// TODO Auto-generated constructor stub
		
		
		super("Checkbox");
		setLayout(new GridLayout(6,1));
		add(lb);
		for(int i =0;i<4;i++) {
			add(cb[i]);
		}
		
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
		new CheckBoxEx();
	}

}
