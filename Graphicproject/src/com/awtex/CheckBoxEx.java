package com.awtex;
import java.awt.*;
public class CheckBoxEx extends Frame{
	private Label lb = new Label("�����ϴ� ������?");
	private Button bt = new Button("Ȯ��");
	
	private Checkbox[] cb = {
			new Checkbox("�ٳ���"),
			new Checkbox("����"),
			new Checkbox("����"),
			new Checkbox("������",true)};
	
	
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
