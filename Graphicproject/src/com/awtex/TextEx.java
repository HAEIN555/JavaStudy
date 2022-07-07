package com.awtex;
import java.awt.*;
public class TextEx extends Frame {
	
	private TextField tf = new TextField("제목 :");
	private TextArea ta = new TextArea("메모",5,10);
	
	private Button bt = new Button("확인");
	private Label la = new Label("내용");
	
	
	public TextEx() {
		// TODO Auto-generated constructor stub
		super("TextField");
		setLayout(new BorderLayout());
		add("North",tf);
		add("South",bt);
		add("Center",ta);
		add("West",la);
		
		Winevent we = new Winevent();
	      addWindowListener(we);
	     // setLocation(300,300);
	     // setBounds(300,300,300,200);
	     setSize(300, 200);
	     setVisible(true);
	}
	public static void main(String[] args) {
	new TextEx();
		}
	}
