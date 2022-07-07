package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import com.awtex.*;


public class ItemEventEx extends Frame implements ActionListener, ItemListener {

	private Label lb = new Label("혈액형 :",Label.RIGHT);
	private Label lb1 = new Label("생년월일 :",Label.RIGHT);
	private Label lb2 = new Label("지역:",Label.RIGHT);
	
	private TextField bType = new TextField();
	private Choice blood = new Choice();
	private TextField birth = new TextField();
	
	private Choice year= new Choice();
	private Choice month= new Choice();
	private Choice day= new Choice();
	
	private TextField area = new TextField();
	private List li = new List(3,false);
	private Button end = new Button("끝내기");
	
	public ItemEventEx() {
		// TODO Auto-generated constructor stub
		super("ItemEvent Test");
		setForm();
		li.addActionListener(this);
		end.addActionListener(this);
		blood.addItemListener(this);
		day.addItemListener(this);
		li.addItemListener(this);
		blood.requestFocus();
		
		
		Winevent we = new Winevent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}
	
	private void setForm() {
		setLayout(new GridLayout(2,1));
		Panel p = new Panel(new BorderLayout());
		Panel p1= new Panel(new GridLayout(3,1));
		p1.add(lb);p1.add(lb1);p1.add(lb2);
		p.add("West",p1);
		Panel p2= new Panel(new GridLayout(3,1));
		p2.add(bType);p2.add(birth);p2.add(area);
		p.add("Center",p2);
		Panel p3= new Panel(new GridLayout(4,1));
		p3.add(blood);p3.add(year);p3.add(month);p3.add(day);
		blood.add("A형");blood.add("B형");blood.add("AB형");blood.add("O형");
		for(int i =1900;i<=2022;i++) {
			year.add(i+" 년");
		}
		for(int i =1;i<=12;i++) {
			month.add(i+" 월");
		}
		for(int i =1;i<=31;i++) {
			day.add(i+" 일");
		}
		
		
		p.add("East",p3);
		
		add(p);
		Panel p4 = new Panel(new BorderLayout());
		p4.add("Center",li);
		li.add("서울");li.add("경기");li.add("인천");li.add("강원");li.add("대구");
		li.add("대전");li.add("경북");li.add("광주");li.add("울산");li.add("부산");
		li.add("제주");li.add("충남");li.add("충북");li.add("경남");li.add("전남");
		li.add("전북");
		p4.add("East",end);
		add(p4);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource()==blood) {
			String imsi = blood.getSelectedItem();
			bType.setText(imsi);
		}else if(e.getSource()==day) {
			String imsi = year.getSelectedItem();
			String imsi1 = month.getSelectedItem();
			String imsi2 = day.getSelectedItem();
			birth.setText(imsi+imsi1+imsi2);
		}else if(e.getSource()==li) {
			String imsi = li.getSelectedItem();
			area.setText(imsi+"지역");
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==li) {
			int i= li.getSelectedIndex();
			li.remove(i);
		}else if (e.getSource()==end) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventEx();
	}

}
