package com.awtex;
import java.awt.*;
public class ListEx extends Frame{

	private Label lb = new Label("인원목록");
	private List li  = new List(4,true);
	private Button bt = new Button("확인");
	private String[] name;
	
	public ListEx(String a[]) {
		// TODO Auto-generated constructor stub
		
		super("List Test");
		name = a;
		setLayout(new BorderLayout());
		
		for(int i =0;i<name.length;i++) {
			li.add(name[i]);
		}
		
		add("North",lb);
		add("Center",li);
		add("South",bt);
		li.setFont(new Font("굴림체",Font.BOLD,30));
		
		
		
		
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
		new ListEx(args);
	}

}
